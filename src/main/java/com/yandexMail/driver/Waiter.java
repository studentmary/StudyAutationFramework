package com.yandexMail.driver;

import com.yandexMail.elements.HtmlElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.yandexMail.driver.UiDriver.getDriver;

public class Waiter {
	private final static int defaultWaitTimeInSeconds = 5;


	public static void untilVisible(HtmlElement element, String message) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds));
		wait.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}

	public static void untilInVisible(HtmlElement element, String message) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));
	}
}