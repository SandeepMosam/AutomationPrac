package WebElementsC2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("399");
		Thread.sleep(3000);
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		Thread.sleep(3000);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());

		for(WebElement alloptions : options)
		{
			System.out.println(alloptions.getText());
		}
		if(s.isMultiple())
		{
			s.deselectAll();
			System.out.println("Yes, It is multiselect");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
