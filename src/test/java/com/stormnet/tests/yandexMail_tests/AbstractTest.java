package com.stormnet.tests.yandexMail_tests;

import com.stormnet.listeners.CustomITestNgListener;
import com.yandexMail.driver.UiDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.ByteArrayInputStream;

@Listeners({CustomITestNgListener.class, AllureTestNg.class})
public class AbstractTest {

	@BeforeMethod
	public void setUp() {
		UiDriver.getDriver();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment.png", new ByteArrayInputStream(takeScreenshot()));
		}
		UiDriver.closeDriver();
	}

	public byte[] takeScreenshot() {
		return ((TakesScreenshot) UiDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	}
}
