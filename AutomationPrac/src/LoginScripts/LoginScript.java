package LoginScripts;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.abhibus.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.id("AccLogin")).click();

driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("9652303256");
driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
driver.findElement(By.xpath("//input[@name='referral_code']")).sendKeys("FirstRide001");
driver.findElement(By.xpath("//input[@value='Login/Signup with OTP']")).click();

String Title = driver.getTitle();
String URL = driver.getCurrentUrl();
System.out.println(Title);
System.out.println(URL);
if(Title.equals("Bus Ticket Booking | Bus Booking Online, Win Free Bus Tickets Daily With AbhiBus"))
{
System.out.println("TestCase Passed, Displayed Correct Page");
}

driver.close();

}


	}


