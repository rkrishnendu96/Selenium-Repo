package org.selenium.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPgm {
	public void verifyRightClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClicks = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actionObj = new Actions(driver);
		actionObj.contextClick(doubleClicks).build().perform();

	}

	public void verifyDoubleClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClicks = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actionObj = new Actions(driver);
		actionObj.doubleClick(doubleClicks).build().perform();
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
		// driver.close();

	}

	public void verifyMouseHover() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(mouseHover).moveToElement(subList).build().perform();

	}

	public void verifyDragAnddrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		WebElement dragButton = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropArea = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(dropArea).build().perform(); // first mouse hover on drop button
		actionObj.click(dragButton).build().perform(); // we can use double click also
		actionObj.contextClick(dragButton).build().perform(); // double click
		actionObj.dragAndDrop(dragButton, dropArea).build().perform(); // source to target

	}

	// -----------------drag and drop using offset----------------//

	public void verifyDragAnddropUsingOffset() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement dragmeButton = driver.findElement(By.xpath("//div[@id='dragBox']"));
		Actions actionObj = new Actions(driver); // created action class reference
		actionObj.dragAndDropBy(dragmeButton, 150, 100).build().perform(); // put x and y axis values

	}

	public void verifyFrames() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe); // switch to iframe tag
		WebElement jmeterButton = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeterButton.click();

	}
	// --------- keyboard events ---------//

	public void verifyKeyboardEventPgm() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		Robot robot = new Robot(); // created Robot class reference
		robot.keyPress(KeyEvent.VK_CONTROL); // control key
		robot.keyPress(KeyEvent.VK_T); // T letter key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

	}

	public static void main(String[] args) {
		ActionPgm obj = new ActionPgm();
		obj.verifyDragAnddropUsingOffset();

	}

}
