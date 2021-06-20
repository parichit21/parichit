import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\91965\\eclipse-workspace\\Practice\\src\\GmailSignin.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91965\\Desktop\\selenium\\crome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.xpath(prop.getProperty("emailXpath"))).sendKeys(prop.getProperty("Emailid"));
		driver.findElement(By.xpath(prop.getProperty("next1"))).click();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("next2"))).click();
		
		
		
		
		
		
		
		
	}

}
