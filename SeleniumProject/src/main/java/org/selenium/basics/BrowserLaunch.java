package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // interface reference creation
		driver.manage().window().maximize(); // for maximize the window
		driver.get("https://www.w3schools.com/"); // get command
		String title = driver.getTitle();
		System.out.println(title);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
	//	driver.quit();   // close multiple windows

	}

}
