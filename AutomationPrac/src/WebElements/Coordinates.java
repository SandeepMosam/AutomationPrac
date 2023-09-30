package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		 WebElement TextBox = driver.findElement(By.id("twotabsearchtextbox"));
		 
		 Point loc = TextBox.getLocation();
		 
		 
		System.out.println(loc.getX() + "X Coordinates");
		 
		System.out.println(loc.getY() + "Y Coordinates");
driver.close();

	}

}
