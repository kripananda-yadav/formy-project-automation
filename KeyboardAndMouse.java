package learning.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouse {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name = driver.findElement(By.xpath(" //input[@id='name']"));
		name.click();
		name.sendKeys("kripananda");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='button']"));
		button.click();
		
		driver.quit();

	}

}
