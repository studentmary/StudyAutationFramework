package com.stormnet.tests.functionalities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AbstractTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
