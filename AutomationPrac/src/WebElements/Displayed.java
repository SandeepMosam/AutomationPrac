package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement Search = driver.findElement(By.name("username"));
		
		if(Search.isDisplayed())
		{
			System.out.println("Pass, Element is Displayed");
			Search.sendKeys("123456");
		}
		else
		{
			System.out.println("Failed");
			
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
