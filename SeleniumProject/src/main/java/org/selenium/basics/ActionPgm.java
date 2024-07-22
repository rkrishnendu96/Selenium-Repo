package org.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPgm {
	public void verifyRightClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClicks = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actionObj = new Actions(driver);
		actionObj.contextClick(doubleClicks).build().perform();

	}

	public void verifyDoubleClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClicks = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actionObj = new Actions(driver);
		actionObj.doubleClick(doubleClicks).build().perform();
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
		// driver.close();

	}

	public void verifyMouseHover() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(mouseHover).moveToElement(subList).build().perform();

	}

	public static void main(String[] args) {
		ActionPgm obj = new ActionPgm();
		obj.verifyRightClick();

	}

}
