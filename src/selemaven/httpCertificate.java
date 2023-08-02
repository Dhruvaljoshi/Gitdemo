package selemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class httpCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.driver.gecko", "C:\\Users\\Dhruval\\geckodriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
	}

}
