package selemaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Dhruval\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(7000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
	//	List<WebElement> dates= driver.findElements(By.className("dayContainer"));
		//int size = driver.findElements(By.className("dayContainer")).size();
	//	System.out.println(size);
		/*for(int i=0; i < size; i++)
		{
			String text= driver.findElements(By.className("dayContainer")).get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("dayContainer")).get(i).click();
				break;
			}
		}*/
		
	}

}
