package selemaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           System.setProperty("webdriver.driver.gecko", "C:\\Users\\Dhruval\\geckodriver.exe");
           WebDriver driver = new FirefoxDriver();
           driver.get("https://rahulshettyacademy.com/AutomationPractice/");
          JavascriptExecutor js = (JavascriptExecutor)driver;
           js.executeScript("window.scrollBy(0,500)");
           Thread.sleep(3000);
           js.executeScript("document.querySelector('tableFixHead').scrollTop=5000");
           List<WebElement> value =driver.findElements(By.xpath("//div[@class ='tableFixHead'] //td[4]"));
           int sum = 0;
           for(int i =0; i< value.size(); i++) {
        	   sum = sum + Integer.parseInt(value.get(i).getText());
           }
           System.out.println(sum);
           driver.findElement(By.xpath("//div[@class = 'totalAmount']")).getText().split(":")[1].trim();
	}

}
