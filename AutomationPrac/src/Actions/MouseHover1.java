package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
WebElement Mens = driver.findElement(By.xpath("//a[@data-group='men']"));

Actions a = new Actions(driver);
a.moveToElement(Mens).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Jackets']")).click();
Thread.sleep(5000);

driver.close();




	}

}
