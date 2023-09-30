package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(5000);
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9652303256");
driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Sandeep");
driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3NgS1a']")).click();
Thread.sleep(3000);
driver.close();




	}

}
