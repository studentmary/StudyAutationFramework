package com.yandexMail.driverСontainer.elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InPut extends HtmlElements {

	public InPut(By locator, WebDriver driver) {
		super(locator, driver);
	}

	public void sendKeys(String text){
		getElement().sendKeys(text);
	}
}
