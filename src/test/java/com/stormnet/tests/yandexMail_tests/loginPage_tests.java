package com.stormnet.tests.yandexMail_tests;

import com.stormnet.tests.functionalities.AbstractTest;
import com.yandexMail.Pages.HeadPage;
import com.yandexMail.driverСontainer.elements.Button;
import com.yandexMail.Pages.LoginPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginPage_tests extends AbstractTest {
	@Test
	public void enteringLoginForm() throws InterruptedException {
		driver.get("https://mail.yandex.ru");
		HeadPage homePage = new HeadPage(driver);
		homePage.getButtonEnter().click();

		LoginPage loginPage1 = new LoginPage(driver);
		loginPage1.getIdField().sendKeys("automationmary");
		Button button1 = new Button(By.xpath("//span[text()='Войти']//ancestor::button"), driver);
		button1.click();
		LoginPage loginPage2 = new LoginPage(driver);
		loginPage2.wait(2000);
		loginPage2.getPasswordField().sendKeys("project123");
		Button button2 = new Button(By.xpath("//button[@type='submit']"), driver);
		button2.click();


	}
}
