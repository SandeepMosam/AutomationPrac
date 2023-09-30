package LoginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnet4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=CjwKCAiAlrSPBhBaEiwAuLSDUJvi4eOCEKPIBPGElIW2OFYy1fEMOx6Ttn0qjHVXN7Rl0I1JiaYsHxoCGEEQAvD_BwE");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[text()='Login']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9652303256");
Thread.sleep(5000);
driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
Thread.sleep(5000);

String Title = driver.getTitle();
String URL = driver.getCurrentUrl();

System.out.println(Title);
System.out.println(URL);

if(Title.equals("Order food online from India's best food delivery service. Order from restaurants near you"))
{
	System.out.println("TestCase Passed, Displayed Correct Page");
}

driver.close();

	}

}
