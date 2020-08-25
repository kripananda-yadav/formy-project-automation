package learning.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterHandle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://formy-project.herokuapp.com/switch-window");
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	     
	     WebElement alertbutton = driver.findElement(By.id("alert-button"));
	     alertbutton.click();
	     Alert alert = driver.switchTo().alert();
	     alert.accept();
	     
	     
	     driver.quit();
	  

}
}
