package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/browsers/firefox/");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String title=driver.getTitle();
		System.out.println(title);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
		

	}

}
