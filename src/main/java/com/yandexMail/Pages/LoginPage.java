package com.yandexMail.Pages;

import com.yandexMail.driverСontainer.elements.InPut;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private final WebDriver driver;
	private final By ID_FIELD_LOCATOR = By.xpath("//span//input");
	private final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@type='password']");//input[@type='password']

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public InPut getIdField() {
		return new InPut(ID_FIELD_LOCATOR, driver);
	}

	public InPut getPasswordField() {
		return new InPut(PASSWORD_FIELD_LOCATOR, driver);
	}
}
