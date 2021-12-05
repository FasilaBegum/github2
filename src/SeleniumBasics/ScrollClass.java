package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollClass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=4185f484d631d9f59b674723cd5c697c");
		driver.manage().window().maximize();
		
		//scroll code using Xpath
		WebElement pagedown = driver.findElement(By.xpath("(//div[@class='headline'])[5]"));
		JavascriptExecutor jp= (JavascriptExecutor) driver;
		jp.executeScript("arguments[0].scrollIntoView();", pagedown);
		Thread.sleep(3000);
		
		WebElement pageup = driver.findElement(By.xpath("//div[@id='app']"));
		jp.executeScript("arguments[0].scrollIntoView();", pageup);
		Thread.sleep(2000);
		
		
		//scroll using pixel
		jp.executeScript("window.scrollBy(0,5000);");
		Thread.sleep(2000);
		jp.executeScript("window.scrollBy(0,1000);");
		
		;
	}

}
