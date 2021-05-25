import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebooklogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91965\\Desktop\\selenium\\crome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\91965\\eclipse-workspace\\Practice\\src\\signupDetails.properties");
		prop.load(ip);
	//	driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("gsearch"))).sendKeys(prop.getProperty("name"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("googlesearch"))).click();
		driver.findElement(By.xpath(prop.getProperty("facebooklogin"))).click();
	
		
		driver.findElement(By.xpath(prop.getProperty("createnewaccount"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("fname"))).sendKeys(prop.getProperty("firstname"));
		
		driver.findElement(By.xpath(prop.getProperty("sname"))).sendKeys(prop.getProperty("surname"));
		driver.findElement(By.xpath(prop.getProperty("emailadd"))).sendKeys(prop.getProperty("email"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("emailconfermaition"))).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.xpath(prop.getProperty("npass"))).sendKeys("newpass");
		
	//	driver.findElement(By.xpath(prop.getProperty("day"))).sendKeys(prop.getProperty("davvalue"));
		//driver.findElement(By.xpath(prop.getProperty("month"))).sendKeys(prop.getProperty("monthvalue"));
		//driver.findElement(By.xpath(prop.getProperty("year"))).sendKeys(prop.getProperty("yearvalue"));
		
		//day
		WebElement day_dropdown = driver.findElement(By.xpath(prop.getProperty("day")));
		Select day_dd = new Select(day_dropdown);
		day_dd.selectByVisibleText("4");
		
		//month
		WebElement month_dropdown = driver.findElement(By.xpath(prop.getProperty("month")));
		Select month_dd = new Select(month_dropdown);
		month_dd.selectByValue("11");
		
		//year
		WebElement year_dropdown = driver.findElement(By.xpath(prop.getProperty("year")));
		Select year_dd = new Select(year_dropdown);
		year_dd.selectByVisibleText("1999");
		
		
		driver.findElement(By.xpath(prop.getProperty("male"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("signup"))).click();
				
	

	
	}

}
