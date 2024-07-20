package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertPgm {

	public void verifySimpleAlert() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement clickmeButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickmeButton.click();
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();

	}

	public void verifyConfirmationAlert() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement clickmeButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickmeButton.click();
		Alert alertObj = driver.switchTo().alert();
		// alertObj.accept();
		alertObj.dismiss();

	}
	public void verifyPromtAlert() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement clickmeButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickmeButton.click();
		Alert alertObj = driver.switchTo().alert();
		alertObj.sendKeys("krish");
		alertObj.accept();
		
	}

	public static void main(String[] args) {
		AlertPgm obj = new AlertPgm();
		obj.verifyPromtAlert();

	}
}