package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingContains {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement firstName=driver.findElement(By.xpath("//input[contains(@id,'FirstName')]"));
		firstName.sendKeys("krishna");
		WebElement lastName=driver.findElement(By.xpath("//input[contains(@id,'LastName')]"));
		lastName.sendKeys("r");
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		email.sendKeys("rkrishna@gfdhg");
		WebElement passwrd=driver.findElement(By.xpath("//input[contains(@class,'text-box single-line password')]"));
		passwrd.sendKeys("124569");
		WebElement cnfmpasswrd=driver.findElement(By.xpath("//input[contains(@name,'ConfirmPassword')]"));
		cnfmpasswrd.sendKeys("124569");
		

	}

}
