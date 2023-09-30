package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		
	Actions a = new Actions(driver);
		                                 
		a.contextClick(search).perform();
		
		driver.close();
	}

}
