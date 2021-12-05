package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
	
	//implicit wait
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.DAYS);
		driver.close();
		
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.textToBePresentInElementValue(null, null));
		//wait.until(ExpectedConditions.attributeToBeNotEmpty(null, null));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(null));
		
		//fluent wait
		Wait wait1= new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		
	}
}
