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

	public void verifyIsSelected() {
		//boolean isButtonselected;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement radiobuttonMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean isButtonselected = radiobuttonMale.isSelected();
		System.out.println("male element before selected" + " " + isButtonselected);
		radiobuttonMale.click();
		isButtonselected = radiobuttonMale.isSelected();
		System.out.println("male element after selected" + " " + isButtonselected);
		driver.close();
	}
	public void verifyIsEnabled() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement subscribeButton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		subscribeButton.click();
		boolean isButtonEnabled=subscribeButton.isEnabled();
		System.out.println("button enabled after click"+" "+isButtonEnabled);
		driver.close();

	}
	public void verifyIsDisplayed() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement searchButton= driver.findElement(By.xpath("//input[@id='FirstName']"));
		searchButton.click();
		boolean isDisplayedSearchButton=searchButton.isDisplayed();
		System.out.println("button displayed after click"+" "+isDisplayedSearchButton);
		driver.close();
	}

	public static void main(String[] args) {
		DemoWebShop obj = new DemoWebShop();
		// obj.demoWebShopLogin();
		 //obj.verifyIsSelected();
		//obj.verifyIsEnabled();
		obj.verifyIsDisplayed();
	}

}
//https://selenium.qabible.in/
