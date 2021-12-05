package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanuch {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Dime\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe")	;	

 
 WebDriver driver =new ChromeDriver();// type casting
  
 driver.get("https://www.google.com/");
 
 driver.get("https://www.google.com/search?q=gmail+login&oq=gmail&aqs=chrome.1.69i59j0i131i433i512j0i433i512l3j0i512j69i61j69i65.6446j0j4&sourceid=chrome&ie=UTF-8");
 
 driver.manage().window().maximize();
 
 driver.navigate().refresh();
 driver.navigate().back();
 driver.navigate().forward();
 driver.navigate().to("https://www.zomato.com/chennai/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-AllUser_SC-Generic_L-PanIndia&utm_term=zomato&gclid=CjwKCAjw7rWKBhAtEiwAJ3CWLH5WlLLeH9Vi_aYTHooYGygb5oDsEtmLXFbtAdI-8btT7sH9E8U7nRoCVSAQAvD_BwE");
 
driver.close(); 
}
}
