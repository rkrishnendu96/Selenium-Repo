package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAnd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email = driver.findElement(By.xpath("//input[@id='Email' and @name='Email']"));
		email.sendKeys("rkrishn@hj");
		WebElement pw = driver.findElement(By.xpath("//input[@id='Password' and @class='password']"));
		pw.sendKeys("12566");
		WebElement remeberme = driver.findElement(By.xpath("//input[@name='RememberMe' and @id='RememberMe']"));
		remeberme.click();
		WebElement login = driver.findElement(By.xpath("//input[@class='button-1 login-button' and@type='submit']"));
		login.click();
	}

}
