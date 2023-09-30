package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		driver.findElement(By.xpath("(//img[@class='thumb lazy'])[1]")).click();
		//Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@class='addtowishlist']")).click();
		
		
		driver.close();
	}

}
