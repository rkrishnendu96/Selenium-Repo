package org.selenium.basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruSiteRegistrationCommands {

	public void registerPage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("KRISHNA");
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("R");
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("944568956");
		WebElement emailId = driver.findElement(By.id("userName"));
		emailId.sendKeys("rkridhndud2gmail.com");
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("ahshah bhavan");
		WebElement city = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
		city.sendKeys("kochi");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("TVM");
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("651255");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("krishnh@ghhd.com");
		WebElement password = driver.findElement(By.cssSelector(
				"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=password]"));
		password.sendKeys("123456789");
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("123456789");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

	}

	public static void main(String[] args) {
		GuruSiteRegistrationCommands obj = new GuruSiteRegistrationCommands();
		obj.registerPage();

	}

}
