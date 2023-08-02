package selemaven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.gecko", "C:\\Users\\Dhruval\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> window  = driver.getWindowHandles();
		 Iterator<String>it =window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String emailID= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[0].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys("dhruval");
		driver.findElement(By.id("password")).sendKeys(emailID);
		
		
	

}}
