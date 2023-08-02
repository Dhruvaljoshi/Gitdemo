package selemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.gecko", "C:\\Users\\Dhruval\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com");
		Actions a1 = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		a1.moveToElement(move).build().perform();
		a1.moveToElement(driver.findElement(By.xpath("//form[@id='nav-search-bar-form']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a1.moveToElement(move).contextClick().build().perform();
		
		
	}

}
