package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	WebElement Login = driver.findElement(By.xpath("//div[text()='Login ']"));
	
	if(Login.isEnabled())
	{
		System.out.println("Pass : Element is enabled");
		Login.click();
		
	}
	else
	{
		System.out.println("Failed");
	}
		driver.close();
	}

}
