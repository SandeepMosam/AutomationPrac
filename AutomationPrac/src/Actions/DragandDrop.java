package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/ ");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement Block3 = driver.findElement(By.xpath("//p[text()='Block 3 data']"));
	WebElement Block2 = driver.findElement(By.xpath("//p[text()='Block 2 data']"));
	
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	a.dragAndDrop(Block3, Block2);
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
}
}
