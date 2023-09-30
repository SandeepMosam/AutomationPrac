package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(5000);
		

		driver.findElement(By.id("identify_email")).sendKeys("9652303256");
		//driver.findElement(By.name("pass")).sendKeys("9652303256");
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(3000);
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//Thread.sleep(3000);
		//driver.close();

	}

}
