package LoginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/hyderabad/sign-in-1-hitech-city/menu");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Continue with Email']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mosam.sandeep@gmail.com");
		driver.findElement(By.xpath("(//span[contains(@class,'sc-1kx')])[4]")).click();
		Thread.sleep(3000);
		
		String Title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		
		System.out.println(Title);
		System.out.println(URL);
		
	if(Title.equals("Sign In Menu, Menu for Sign In, Hitech City, Hyderabad"))
		{
			System.out.println("TestCase Passed, Displayed Correct Page");
		}
		
		driver.close();
	
		
	}

}
