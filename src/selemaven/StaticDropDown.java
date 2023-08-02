package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Dhruval\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement ddaddress = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd = new Select(ddaddress);
		dd.selectByIndex(3);
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("AED");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByValue("INR");
		
		
	}

}
