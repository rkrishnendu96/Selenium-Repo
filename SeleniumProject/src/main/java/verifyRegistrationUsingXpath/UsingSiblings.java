package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSiblings {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email = driver.findElement(By.xpath("//div[@class='inputs']//label[@for='Email']//following-sibling::input"));
		email.sendKeys("rkrishna@gfdhg.com");
		WebElement passwrd = driver.findElement(By.xpath("//div[@class='inputs']//label[@for='Password']//following-sibling::input"));
		passwrd.sendKeys("124569");
		WebElement rememberme = driver.findElement(By.xpath("//div[@class='inputs reversed']//input[@id='RememberMe']"));
		rememberme.click();
		WebElement login = driver.findElement(By.xpath("//div[@class='buttons']//input[@class='button-1 login-button']"));
		login.click();

	}
}
