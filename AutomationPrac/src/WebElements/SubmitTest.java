package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/index.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
driver.findElement(By.id("username")).clear();
driver.findElement(By.id("password")).clear();
driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();

Thread.sleep(3000);
driver.close();

	}

}
