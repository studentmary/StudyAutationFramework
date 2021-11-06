package com.yandexMail.driverСontainer.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlElements {
	protected WebElement element;
	protected By locator;
	protected WebDriver driver;

	public HtmlElements(By locator, WebDriver driver) {
		this.driver = driver;
		this.locator = locator;
	}

	public WebElement getElement() {
		return driver.findElement(locator);
	}
}
