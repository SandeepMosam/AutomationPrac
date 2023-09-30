package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demoapp.skillrary.com/login.php?type=login");
Thread.sleep(5000);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.partialLinkText("password?")).click();
Thread.sleep(5000);
driver.findElement(By.partialLinkText("Return")).click();
Thread.sleep(5000);
driver.close();

	}

}
