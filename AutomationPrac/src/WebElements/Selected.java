package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
driver.manage().window().maximize();
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(3000);
WebElement RadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

	if(RadioButton.isSelected())
	{
		System.out.println("Pass : Element is selected");
	}
	else
	{
		System.out.println("Failed : not Selected");
	}
	Thread.sleep(3000);
	driver.close();
	}

}
