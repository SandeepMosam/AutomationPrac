package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.manage().window().maximize();
WebElement SignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
Actions a = new Actions(driver);
a.moveToElement(SignIn).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='login']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("9652303256");
Thread.sleep(3000);
driver.close();




	}

}
