package learning.automation;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ExplictWait {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/autocomplete");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize(); 
			
			WebElement autocomplete = driver.findElement(By.id("autocomplete"));
			autocomplete.click();
			autocomplete.sendKeys("Thasikhel, Lalitpur, Nepal");
		
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			WebElement autocompleteresults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
			autocompleteresults.click();
			
			
			driver.quit();
		
			

		}

	

}
