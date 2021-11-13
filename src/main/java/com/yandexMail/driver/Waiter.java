package com.yandexMail.driver;

import com.yandexMail.elements.HtmlElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.yandexMail.driver.UiDriver.getDriver;

public class Waiter {
	private static final int defaultWaitTimeInSeconds = 7;


	public static void untilVisible(HtmlElement element, String message) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds));
		wait.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}
}
