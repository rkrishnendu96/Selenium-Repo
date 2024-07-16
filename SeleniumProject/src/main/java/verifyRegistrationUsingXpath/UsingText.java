package verifyRegistrationUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		shoppingCart.click();
		WebElement wishlist = driver.findElement(By.xpath("//span[text()='Wishlist']"));
		wishlist.click();

	}

}