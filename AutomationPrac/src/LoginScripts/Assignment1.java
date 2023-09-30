package LoginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("(//div[@class='mTxt'])[5]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Sandeep.Mosam");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sandeep@123");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);

String URL = driver.getCurrentUrl(); 
System.out.println(URL);

String Title = driver.getTitle();
System.out.println(Title);
if(URL.equals("https://www.naukri.com/"))
{
System.out.println("TestCase  Passed, Displayed Correct Page");
	}

driver.close();






	}

}
