package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//div[text()='Shiv Shakti Kavach 5 Mala With Shiv Trishul & Damru Wood Shiv Shakti Kavach Mukhi Rudraksha Wood Locket']"));
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeAsyncScript("window.scrollBy("+x+","+y+")");
	
	Thread.sleep(3000);
	ele.click();
	
	
	
	}

}
