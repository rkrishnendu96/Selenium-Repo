package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleFormDemo {

	public void simpleFormDemoo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enterMsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMsg.sendKeys("Course details needed");
		WebElement showMsg = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMsg.click();
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys("2800");
		WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys("200");
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		driver.close();
	}

	public void checkBoxDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlecheckBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean isSinglebuttonSelected = singlecheckBox.isSelected();
		System.out.println("button selected before click" + " " + isSinglebuttonSelected);
		singlecheckBox.click();
		isSinglebuttonSelected = singlecheckBox.isSelected();
		System.out.println("button selected before click" + " " + isSinglebuttonSelected);
		WebElement multipleCheckBox = driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean isMultiButtonSelected = multipleCheckBox.isSelected();
		System.out.println("multiple button selected before click" + " " + isMultiButtonSelected);
		multipleCheckBox.click();
		isMultiButtonSelected = multipleCheckBox.isSelected();
		System.out.println("multiple button selected after click" + " " + isMultiButtonSelected);
		WebElement unselectALLCheckBox = driver.findElement(By.xpath("//input[@id='button-two']"));
		unselectALLCheckBox.click();

	}

	public void radioButtonDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleButton = driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
		maleButton.click();
		WebElement showSelcted = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelcted.click();
		WebElement genderButton = driver.findElement(By.xpath("//label[@for='inlineRadio11']"));
		genderButton.click();
		WebElement ageButton = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		ageButton.click();
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResult.click();

	}

	public void selectInput() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/select-input.php");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select objSel = new Select(selectColor);
		objSel.selectByVisibleText("Yellow");
		List<WebElement> listObj = objSel.getOptions();
		System.out.println(listObj.size());
		WebElement firstSelectedElemnt = driver
				.findElement(By.xpath("//select[@id='multi-select-field']//option[@value='Red']"));
		firstSelectedElemnt.click();
		WebElement getFirstselctdButton = driver.findElement(By.xpath("//button[@id='button-first']"));
		getFirstselctdButton.click();
		/*
		 * WebElement redSelected= driver.findElement(By.xpath(
		 * "//select[@id='multi-select-field']//option[@value='Red']"));
		 * redSelected.click(); WebElement yellowSelected= driver.findElement(By.xpath(
		 * "//select[@id='multi-select-field']//option[@value='Yellow']"));
		 * yellowSelected.click(); WebElement greenSelected=
		 * driver.findElement(By.xpath(
		 * "//select[@id='multi-select-field']//option[@value='Green']"));
		 * greenSelected.click(); WebElement getAllSelected=
		 * driver.findElement(By.xpath("//button[@id='button-all']"));
		 * getAllSelected.click();
		 */

	}

	public void formSubmit() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/form-submit.php");
		WebElement firstName = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstName.sendKeys("Krishnendu");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastName.sendKeys("R");
		WebElement userName = driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		userName.sendKeys("rkrishnendu@ghs.com");
		WebElement city = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("TVM");
		WebElement state = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zipcode.sendKeys("657895");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		boolean checkBoxIsSelected = checkBox.isSelected();
		System.out.println("checkbox is selected before click" + " " + checkBoxIsSelected);
		checkBox.click();
		checkBoxIsSelected = checkBox.isSelected();
		System.out.println("checkbox is selected after click" + " " + checkBoxIsSelected);
		WebElement submitForm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitForm.click();

	}

	public static void main(String[] args) {
		SimpleFormDemo obj = new SimpleFormDemo();
		// obj.simpleFormDemoo();
		// obj.checkBoxDemo();
		// obj.selectInput();
		// obj.radioButtonDemo();
		 obj.formSubmit();

	}

}
