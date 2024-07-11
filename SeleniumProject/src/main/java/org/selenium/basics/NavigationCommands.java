package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.w3schools.com/"); 
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/drivers/");
		driver.close();

		 
	//	WebElement	element=driver.findElement(By.id("UserName"))
		//https://demowebshop.tricentis.com/
		//https://www.saucedemo.com/

	}

}
