package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlAssi {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("hdjakhujhfcsj@gamil.com");
		
		WebElement pswd = driver.findElement( By.id("id"));
		pswd.sendKeys("yoerhljd");
		
		WebElement Login = driver.findElement(By.id("u_0_d_M2"));
		Login.click();

}
}
