package learning.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://formy-project.herokuapp.com/scroll");
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     WebElement name = driver.findElement(By.id("name"));
	     Actions actions = new Actions(driver);
	     actions.moveToElement(name);
	     name.sendKeys("kripananda");
	     
	     
                 	 
	     driver.quit();
	     
	}

}
