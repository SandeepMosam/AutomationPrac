package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("7794814882");
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sandeep");
Thread.sleep(3000);
driver.findElement(By.cssSelector("button[value='1']")).click();
Thread.sleep(3000);
driver.close();

	}

}
