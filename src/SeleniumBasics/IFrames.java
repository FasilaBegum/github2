package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.switchTo().frame("singleframe");
	
	WebElement sframes = driver.findElement(By.xpath("//input[@type='text']"));
	sframes.sendKeys("Fasila");
	
	driver.switchTo().defaultContent();
	
	WebElement multiframes = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	multiframes.click();

	
	WebElement frame1= driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	driver.switchTo().frame(frame1);
	
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(frame2);
	
	WebElement mframe= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	mframe.sendKeys("Fasila");
	
	
	
	
}
}
