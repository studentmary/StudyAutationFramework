package com.yandexMail.Pages;

import com.yandexMail.driver.Waiter;
import io.qameta.allure.Step;
import utility.logerator.Logger;


public class LoginPageHelper {

	@Step("Enter to system")
	public static void clickInButtonEnter() {
		LoginPage.getSignInButton().click();
	}

	@Step("Fill username")
	public static void fillUsername(String username) {
		LoginPage.getUserNameField().sendKeys(username);
	}

	@Step("Click button")
	public static void submitForm() {
		LoginPage.getButton().click();
	}

	@Step("Wait until open password field")
	public static void openPasswordField() {
		Waiter.untilVisible(LoginPage.getPasswordField(), "Password field not find");
	}

	@Step("Fill password")
	public static void fillPassword(String password) {
		LoginPage.getPasswordField().sendKeys(password);
	}

	@Step("Login to application")
	public static void loginWithCreads(String userName, String password) {
		Logger.getLogger().info("Try to login as {}/{}",userName,password);
		clickInButtonEnter();
		fillUsername(userName);
		submitForm();
		openPasswordField();
		fillPassword(password);
		submitForm();
		Logger.getLogger().info("User log in the system");
	}

}
