package org.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePgm {
	public void verifyDynamicWebTable() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse");
		WebElement showmoreLink = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showmoreLink.click();
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		// System.out.println(table.getText()); // for print whole content of table
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[5]"));
		System.out.println(tableRow.getText());
		List<WebElement> rows = table.findElements(By.tagName("tr")); // for fetch morethan 1 webelemnt...use collection
		int rowSize = rows.size();
		for (int i = 0; i < rowSize; i++) {
			List<WebElement> column = rows.get(i).findElements(By.tagName("td")); // inside row inside column
			int columnSize = column.size();
			for (int j = 0; j < columnSize; j++) {
				String cellData = column.get(j).getText();
				
				if (cellData.equals("NIFTY NEXT 50")) {
					System.out.println("Previous close value is" + " " + column.get(1).getText());
				}
			}

		}
		driver.close();

	}

	public static void main(String[] args) {
		TablePgm obj = new TablePgm();
		obj.verifyDynamicWebTable();

	}

}