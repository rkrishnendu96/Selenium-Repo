package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public void dropdownByText() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select selObj = new Select(countryDropdown);
		selObj.selectByVisibleText("ANGOLA");
		driver.close();

	}

	public void dropdownByValue() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select selobj = new Select(countryDropdown);
		selobj.selectByValue("CHINA");
		// driver.close();

	}

	public void dropdownByIndex() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select selObj = new Select(countryDropdown);
		selObj.selectByIndex(2);
		// driver.close();

	}

	public static void main(String[] args) {
		Dropdown obj = new Dropdown();
		obj.dropdownByIndex();
	}

}