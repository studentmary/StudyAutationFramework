package com.yandexMail.elements;

import com.yandexMail.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HtmlElement {
	protected By locator;

	public HtmlElement(By locator) {
		this.locator = locator;
	}

	public WebElement getElement() {
		return UiDriver.getDriver().findElement(locator);
	}

	public By getLocator() {
		return locator;
	}

	public  void getRightClickButton() {
		Actions action = new Actions(UiDriver.getDriver());
		action.contextClick();
	}

//	public  void getDoubleClickButton() {
//		Actions action = new Actions(UiDriver.getDriver());
//		action.doubleClick();
//	}
	public  void getDrugAndDropButton() {
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(getElement().findElement(locator),getElement().findElement(locator));
	}
}
