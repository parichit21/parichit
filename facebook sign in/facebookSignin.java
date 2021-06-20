import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookSignin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\91965\\eclipse-workspace\\Practice\\src\\FacebookSignin.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91965\\Desktop\\selenium\\crome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath(prop.getProperty("emailaddXpath"))).sendKeys(prop.getProperty("emailadd"));
		driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("signinbuttonXpath"))).click();
		
		
	
	
	
	
	
	}

}
