package com.stormnet.tests.yandexMail_tests;

import com.yandexMail.Pages.DiskPageHelper;
import com.yandexMail.Pages.LoginPageHelper;
import com.yandexMail.Pages.UserPageHelper;
import com.yandexMail.driver.UiDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main_tests extends AbstractTest {


	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://mail.yandex.ru");
	}

	@Test
	public void testRun()  {
		LoginPageHelper.loginWithCreads("automationmary", "project123");

		UserPageHelper.wtiteAndSendLetter("automationmary@yandex.ru", "project", "test", "D:\\Studyproject\\java\\Homework5.txt");

		UserPageHelper.saveLetterToDisk();

		DiskPageHelper.sendFileToDiskAndDelete();

	}

}
