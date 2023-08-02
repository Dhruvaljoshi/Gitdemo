package selemaven;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.gecko", "C:\\Users\\Dhruval\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j =0;
		String [] items = {"Cucumber","Brocoli", "Cauliflower"};
    
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
       
		for (int i = 0; i < productName.size(); i++) {
			String []name = productName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemneeded = Arrays.asList(items);

			if (itemneeded.contains(formattedName)) {
              
				driver.findElements(By.xpath("//button[text()= 'ADD TO CART']")).get(i).click();
				j++;
		      if (j==3)
		    	  break;
				
			}
			}
		}

	}

