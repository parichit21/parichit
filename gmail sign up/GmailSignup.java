import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignup {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\91965\\eclipse-workspace\\Practice\\src\\GmailLoginDetails.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91965\\Desktop\\selenium\\crome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement( By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("gmail signup");
		driver.findElement(By.xpath(prop.getProperty("searchXpath"))).sendKeys(prop.getProperty("search"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("googlesearchXpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("CreateYourGoogleAccountLink"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("fnamexpath"))).sendKeys(prop.getProperty("fname"));
		
		driver.findElement(By.xpath(prop.getProperty("lnameXpath"))).sendKeys(prop.getProperty("surname"));
		
		driver.findElement(By.xpath(prop.getProperty("usernameXpath"))).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath(prop.getProperty("passwordXpath"))).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(prop.getProperty("cpasswordXpath"))).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(prop.getProperty("showpasswordXpath"))).click();
		
		//driver.findElement(By.xpath(prop.getProperty("NextXpath"))).click();
	
	}

}
