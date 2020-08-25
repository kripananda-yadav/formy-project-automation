package learning.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/dropdown");
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
	    WebElement dropDownMenu = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
	    dropDownMenu.click();
	    WebElement autocomplete = driver.findElement(By.id("autocomplete"));
	    autocomplete.click();
	    
	    
	    
	    
	  
	 driver.quit();
	}

}
