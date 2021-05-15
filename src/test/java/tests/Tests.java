package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends BaseClass{
	
	@Test
	public void testOne() throws Exception {
		driver.get("https://fb.com");
		Thread.sleep(1500);
		driver.findElement(By.id("email")).sendKeys("ashish");
		driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Testone completed....!");
	}

	
}
