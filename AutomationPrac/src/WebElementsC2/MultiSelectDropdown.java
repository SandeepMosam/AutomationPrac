package WebElementsC2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);
		
		s.selectByValue("399");
		
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");

		
		Thread.sleep(3000);
		s.deselectByIndex(2);

		Thread.sleep(3000);
		s.deselectByValue("399");
		Thread.sleep(3000);
		s.deselectByVisibleText("More Than INR 500 ( 55 ) ");
		Thread.sleep(3000);
		driver.close();
	}

}
