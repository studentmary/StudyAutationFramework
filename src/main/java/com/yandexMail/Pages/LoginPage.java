package com.yandexMail.Pages;

import com.yandexMail.elements.InPut;
import com.yandexMail.elements.Button;
import org.openqa.selenium.By;

public class LoginPage {
	private static final By USERNAME_FIELD_LOCATOR = By.xpath("//span//input");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.xpath("//span[text()='Войти']//ancestor::a");
	private static final By BUTTON_LOCATOR = By.xpath("//button[@type='submit']");

	public static InPut getUserNameField() {
		return new InPut(USERNAME_FIELD_LOCATOR);
	}

	public static InPut getPasswordField() {
		return new InPut(PASSWORD_FIELD_LOCATOR);
	}

	public static Button getSignInButton() {
		return new Button(SIGN_IN_BUTTON_LOCATOR);
	}

	public static Button getButton() {
		return new Button(BUTTON_LOCATOR);
	}


}
