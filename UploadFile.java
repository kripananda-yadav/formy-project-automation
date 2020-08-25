package learning.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://formy-project.herokuapp.com/fileupload");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    
    WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
    fileUploadField.sendKeys("Screenshot");
    
    
    driver.close();
}
}
