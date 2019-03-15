import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tulsi");
		driver.findElement(By.xpath("//input[@name='q']")).clear();
	    driver.findElement(By.linkText("Gmail")).click();
	   driver.navigate().back();
	//    driver.findElement(By.linkText("Images")).click();
	   
	   driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Test11");
	    driver.findElement(By.name("btnK")).click();
		driver.quit();
		
		
		

	}

}
