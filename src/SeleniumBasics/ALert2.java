package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALert2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement simplealert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simplealert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement confirmalert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmalert.click();
		Thread.sleep(2000);
		WebElement confirmalert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmalert2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
	    prompt.click();
	    Thread.sleep(2000);
	    WebElement prompt2 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	    prompt2.click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().sendKeys("fasila");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	
        	
	}
	

}
