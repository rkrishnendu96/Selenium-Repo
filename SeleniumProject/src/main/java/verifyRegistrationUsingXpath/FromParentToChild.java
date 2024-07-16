package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromParentToChild {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//div[@class='_6lux']//input[@id='email']"));
		email.sendKeys("rkrishna@gfdhg.com");
		WebElement passwrd=driver.findElement(By.xpath("//div[@id='passContainer']//input[@name='pass']"));
		passwrd.sendKeys("124569");
		WebElement login=driver.findElement(By.xpath("//div[@class='_6ltg']//button[@name='login']"));
		login.click();
		

	}

}
