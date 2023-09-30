package WebElementsC2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultisort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(5000);
WebElement Date = driver.findElement(By.name("birthday_day"));
WebElement Month = driver.findElement(By.name("birthday_month"));
WebElement Year = driver.findElement(By.name("birthday_year"));
Select D = new Select(Date);
Select M = new Select(Month);
Select Y = new Select(Year);
System.out.println("-----------------------------------------------------------------------");
D.selectByValue("6");
Thread.sleep(5000);
List<WebElement> dateoptions = D.getOptions();
System.out.println(dateoptions.size());
List DateArray = new ArrayList();
for(WebElement datelist:dateoptions)
{
	 DateArray.add(datelist.getText());
}
System.out.println("Dates List Order : " +        DateArray);
//Collections.sort(DateArray);

//System.out.println("Order wise Flow : "+ DateArray);
if(D.isMultiple())
{
	  System.out.println("Multi Select DropDown is available For Dates");
	  
}
else
{
	  System.out.println("Multi Select Drop Down is not available For Date");
}
System.out.println("-----------------------------------------------------------------------");
M.selectByValue("12");
Thread.sleep(5000);
List<WebElement> monthoptions = M.getOptions();
System.out.println(monthoptions.size());
List MonthArray = new ArrayList();
for(WebElement monthslist:monthoptions)
{
	  MonthArray.add(monthslist.getText());
}
System.out.println("Actual Flow : " +MonthArray);
Collections.sort(MonthArray);
System.out.println("Alphabetical Flow : " + MonthArray);
if(M.isMultiple())
{
	  System.out.println("Multi Select DropDown is available For Months");
	  
}
else
{
	  System.out.println("Multi Select Drop Down is not available for Months");
}

System.out.println("-----------------------------------------------------------------------");

Y.selectByValue("1995");
Thread.sleep(5000);
  List<WebElement> yearoptions = Y.getOptions();
System.out.println(yearoptions.size());
      List YearArray = new ArrayList();
     for(WebElement yearlist:yearoptions)
      {
     	 YearArray.add(yearlist.getText());
      }
      System.out.println("Actual Years List Order : " +        YearArray);
      
      Collections.sort(YearArray);
      
       System.out.println("Order wise Flow : "+ YearArray);
       if(Y.isMultiple())
       {
     	  System.out.println("Multi Select DropDown is available For Years");
     	  
       }
       else
       {
     	  System.out.println("Multi Select Drop Down is not available For Years");
       }    
       System.out.println("-----------------------------------------------------------------------");
       driver.close();


	}

}
     
      
     
      
      
      
      

