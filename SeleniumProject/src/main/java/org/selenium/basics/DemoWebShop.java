package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public void demoWebShopLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("rkrishnendu96@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456789");
		WebElement loginButton = driver.findElement(By.className("button-1 login-button"));
		loginButton.click();
	}

	public static void main(String[] args) {
		DemoWebShop obj = new DemoWebShop();
		obj.demoWebShopLogin();
	}

}
