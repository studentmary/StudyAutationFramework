package com.yandexMail.driverСontainer.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Waiter {
	private WebDriver driver;

	public Waiter(WebDriver driver) {
		this.driver = driver;
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

}
