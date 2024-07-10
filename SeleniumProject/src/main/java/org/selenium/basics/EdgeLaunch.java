package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.javatpoint.com/java-tutorial");
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

	}

}
