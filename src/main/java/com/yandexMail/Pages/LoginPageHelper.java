package com.yandexMail.Pages;

import com.yandexMail.driver.Waiter;
import io.qameta.allure.Step;

public class LoginPageHelper {

	@Step("Log in to the system")
	public static void submitForm() {
		LoginPage.getSignInButton().click();
	}

	@Step("Fill username")
	public static void fillUsername(String username) {
		LoginPage.getUserNameField().sendKeys(username);
	}

	@Step("Click button_1")
	public static void submitForm1() {
		LoginPage.getButton1().click();
	}

	@Step("Wait until open password field")
	public static void openPasswordField(){
		Waiter.untilVisible(LoginPage.getPasswordField(),"Password field not find" );
	}

	@Step("Fill password")
	public static void fillPassword(String password) {
		LoginPage.getPasswordField().sendKeys(password);
	}

	@Step("Click button_2")
	public static void submitForm2() {
		LoginPage.getButton2().click();
	}

	@Step("Login to application")
	public static void loginWithCreads(String userName, String password) {
		submitForm();
		fillUsername(userName);
		submitForm1();
		openPasswordField();
		fillPassword(password);
		submitForm2();
	}

}
