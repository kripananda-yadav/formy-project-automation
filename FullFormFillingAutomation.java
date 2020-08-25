package learning.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FullFormFillingAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("kripananda");
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("yadav");
		
		WebElement jobTitle = driver.findElement(By.id("job-title"));
		jobTitle.sendKeys("QA Engineer");
		
		WebElement radioButton = driver.findElement(By.id("radio-button-2"));
		radioButton.click();
		
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.cssSelector("option[value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("2077/06/11");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();;
		
		
		driver.quit();
	}

}
