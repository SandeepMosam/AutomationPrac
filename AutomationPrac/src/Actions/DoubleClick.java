package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Dropdown = driver.findElement(By.name("addresstype"));
		Select s = new Select(Dropdown);
		s.selectByValue("category.php?category=testing");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		Thread.sleep(5000);
		
		
		
		

		driver.close();

	}

}
