package WebElementsC2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stud
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement TextBox = driver.findElement(By.className("desktop-searchBar"));
		TextBox.sendKeys("dre");
		
		Thread.sleep(5000);
	List<WebElement> ele = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
	
	System.out.println(ele.size());
	
	for(WebElement alloption:ele)
	{
		System.out.println(alloption.getText());;
	}
	
	driver.close();
	}

}
