package com.yandexMail.driverСontainer.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends HtmlElements{
	public Button(By locator, WebDriver driver) {
		super(locator, driver);

	}
	public void click(){
		getElement().click();
	}
}
