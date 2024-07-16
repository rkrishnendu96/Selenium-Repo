package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingParent {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender = driver.findElement(By.xpath(""));
		gender.click();
		WebElement firstName = driver.findElement(By.xpath(""));
		firstName.sendKeys("krishna");
		WebElement lastName = driver.findElement(By.xpath(""));
		lastName.sendKeys("r");
		WebElement email = driver.findElement(By.xpath(""));
		email.sendKeys("rkrishna@gfdhg");
		WebElement passwrd = driver.findElement(By.xpath(""));
		passwrd.sendKeys("124569");
		WebElement cnfmpasswrd = driver.findElement(By.xpath(""));
		cnfmpasswrd.sendKeys("124569");

	}
}
