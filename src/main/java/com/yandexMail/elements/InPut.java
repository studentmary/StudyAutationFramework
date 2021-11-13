package com.yandexMail.elements;

import org.openqa.selenium.By;

public class InPut extends HtmlElement {

	public InPut(By locator) {
		super(locator);
	}

	public void sendKeys(String text) {
		getElement().clear();
		getElement().sendKeys(text);
	}
}
