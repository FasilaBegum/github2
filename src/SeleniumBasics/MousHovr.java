package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousHovr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
	
	     WebDriver driver = new ChromeDriver();
	    
	     driver.get("http://automationpractice.com/index.php");
	     driver.manage().window().maximize();
	    
	     WebElement wom = driver.findElement(By.xpath("//a[@title='Women']"));
	     Actions ac = new Actions(driver);
	     ac.moveToElement(wom).build().perform();
	     
	     WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts'] "));
	     ac.moveToElement(tshirt).build().perform();
	     
	     JavascriptExecutor js= (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click()", tshirt);
	     
			
			
		
	}

}
