package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) {
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
	}
	

}
