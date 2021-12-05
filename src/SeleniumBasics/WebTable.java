package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> Alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement Data : Alldata) {
			System.out.println(Data.getText());
			
		}
		
		System.out.println("**************single row****************");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]"));
		for (WebElement Row1 : row) {
			System.out.println(Row1.getText());
			
		}
		
		
		System.out.println("****************single cell***************");
		WebElement Cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
		System.out.println(Cell.getText());
		
		
		System.out.println("****************Header***************");
		List<WebElement> Header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]"));
		for (WebElement Header1 : Header) {
			System.out.println(Header1.getText());
		}
	}

}
