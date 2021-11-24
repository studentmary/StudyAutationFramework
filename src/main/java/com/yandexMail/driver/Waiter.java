package com.yandexMail.driver;

import com.yandexMail.elements.HtmlElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.yandexMail.driver.UiDriver.getDriver;

public class Waiter {
	private static  final int defaultWaitTimeInSeconds = 7;


	public static void untilVisible(HtmlElement element, String message) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds));
		wait.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}

	public static void untilInVisible(HtmlElement element, String message) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		wait.withMessage(message)
				.until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));
	}

	public static void presenceOfElement(HtmlElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(element.getLocator()));
	}


}