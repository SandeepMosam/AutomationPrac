package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.linkText("https://demoapp.skillrary.com/")).click();
		//new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://amazon.com/");
		
		
	/*	String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		driver.quit();
		*/
	}

}
