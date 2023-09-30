package WebElementsC2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.amazon.com/");
WebElement dropdown = driver.findElement(By.name("url"));
Select s = new Select(dropdown);
Thread.sleep(3000);
s.selectByIndex(4);
Thread.sleep(3000);
s.selectByValue("search-alias=fashion-mens-intl-ship");
Thread.sleep(3000);
s.selectByVisibleText("Health & Household");
Thread.sleep(3000);

List<WebElement> options = s.getOptions();
System.out.println(options.size());

for(WebElement alloptions : options)
{
	System.out.println(alloptions.getText());
}
driver.close();
	}

}
