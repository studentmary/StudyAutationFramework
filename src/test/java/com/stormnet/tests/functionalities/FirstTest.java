package com.stormnet.tests.functionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FirstTest extends AbstractTest {

	@Test
	public void testRewrite() {
		driver.get("https://google.com");
		WebElement searchfield = driver.findElement(By.name("q"));
		searchfield.sendKeys("Banana");
		searchfield.sendKeys(Keys.ENTER);
		List<WebElement> titles = driver.findElements(By.tagName("cite"));
		WebElement result = titles.get(2);
		result.click();
	}

}
