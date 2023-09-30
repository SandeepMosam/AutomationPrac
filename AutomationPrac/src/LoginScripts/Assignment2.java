package LoginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mosam.Sandeep");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sandeep@123");
		driver.findElement(By.xpath("//button[contains(@class,'btn__primary')]")).click();
		Thread.sleep(3000);
		String Title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(Title);
		System.out.println(URL);
		
		if(Title.equals("LinkedIn Login, Sign in | LinkedIn"))
		{
			System.out.println("TestCase passes, Displayed Correct Page");
			
		}
		
		driver.close();
		
		

	}

}
