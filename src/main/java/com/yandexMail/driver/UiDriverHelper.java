package com.yandexMail.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

public class UiDriverHelper {
	private WebDriver driver;

	public UiDriverHelper(WebDriver driver) {
		this.driver = driver;

	}

	public String getTitle() {
		return UiDriver.getDriver().getTitle();
	}
}
