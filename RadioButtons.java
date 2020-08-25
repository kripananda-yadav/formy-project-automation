package learning.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/radiobutton");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    WebElement radiobutton1 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 1')]"));
    radiobutton1.click();
    
    WebElement radioButton2 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 2')]"));
    
    
    
    driver.quit();
    
	}
}
