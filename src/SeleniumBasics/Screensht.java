package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensht {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	    
	    WebElement user = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	    user.sendKeys("bhsagad");
	    
	    WebElement pwd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	    pwd.sendKeys("hhhhhugeah");
	    
	    WebElement login = driver.findElement(By.xpath("//button[contains(@id,'login')]"));
	    login.click();
	    
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File scr = ts.getScreenshotAs(OutputType.FILE);
	    File dst = new File("C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Screenshot\\sc.png");
	    FileUtils.copyFile(scr, dst);
	    
	 
	}
	

}
