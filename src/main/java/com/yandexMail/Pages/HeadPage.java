package com.yandexMail.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeadPage {
	private final By BUTTONENTER_LOCATOR = By.xpath("//span[text()='Войти']//ancestor::a");
	private final WebDriver driver;

	public HeadPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getButtonEnter() {
		return driver.findElement(BUTTONENTER_LOCATOR);
	}
}
