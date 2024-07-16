package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingStartsWith {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address or phone number')]"));
		email.sendKeys("rkrishna@gfdhg.com");
		WebElement passwrd=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]"));
		passwrd.sendKeys("124569");
		WebElement login=driver.findElement(By.xpath("//button[starts-with(@name,'login')]"));
		login.click();
		

	}

}