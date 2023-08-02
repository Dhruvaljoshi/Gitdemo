package selemaven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.gecko", "C:\\Users\\Dhruval\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    int size = columndriver.findElements(By.tagName("a")).size();
	    System.out.println(size);
	    String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    for (int i=0; i <size; i++ )
	    {
	    	
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(click);
	    	Thread.sleep(5000);
	    }
	    
	    Set <String> abc=  driver.getWindowHandles();//5
	    Iterator<String> it= abc.iterator();
	    
	    while (it.hasNext()) 
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }		
		
	}

}
