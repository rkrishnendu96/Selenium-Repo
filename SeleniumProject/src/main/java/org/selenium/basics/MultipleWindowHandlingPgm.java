package org.selenium.basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandlingPgm {
	public void verifyMultipleWindowHandling() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/");
		WebElement contactusButton = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactusButton.click();
		WebElement loginPortalButton = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortalButton.click();
		String parent = driver.getWindowHandle();
		System.out.println("parent window :" + parent);
		Set<String> allWindows = driver.getWindowHandles();   // multiple windows id stored in a collection
		for (String temp : allWindows) {              // multiple window id fetch cheyan use for each loop
			System.out.println("windows:" + temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("*****************");
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandlingPgm obj = new MultipleWindowHandlingPgm();
		obj.verifyMultipleWindowHandling();

	}

}
