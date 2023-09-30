package Frames;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//typecasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		js.executeAsyncScript("window.scrollBy(0,-5000)");
	}

}
