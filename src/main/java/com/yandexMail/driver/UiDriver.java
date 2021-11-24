package com.yandexMail.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.logerator.Logger;

public class UiDriver {
	private static final ThreadLocal<UiDriver> instance = new ThreadLocal<>();
	private final WebDriver driver;

	private UiDriver() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	public static WebDriver getDriver() {
		if (instance.get()== null) {
			instance.set(new UiDriver());
			Logger.getLogger().debug("Started new driver");
		}
		return instance.get().driver;
	}

	public static void closeDriver() {
		Logger.getLogger().debug("Close driver{}", UiDriver.getDriver());
		getDriver().quit();
		instance.set(null);
	}
}
