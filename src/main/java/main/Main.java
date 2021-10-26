package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement searchfield = driver.findElement(By.name("q"));
		searchfield.sendKeys("Banana");
		searchfield.sendKeys(Keys.ENTER);
		List<WebElement> titles = driver.findElements(By.tagName("cite"));
		WebElement result = titles.get(2);
		result.click();
		driver.close();
	}
}
