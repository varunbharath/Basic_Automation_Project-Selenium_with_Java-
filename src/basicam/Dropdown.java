package basicam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Cts =new ChromeDriver();
		Cts.get("http://www.leafground.com/pages/Dropdown.html");
		
      WebElement Dd    = Cts.findElement(By.id("dropdown1"));
      Select Ddoptions =new Select(Dd);
      Ddoptions.selectByValue("3");
      Thread.sleep(4000);
      
     // Ddoptions.selectByIndex("2");l
      
      
      Ddoptions.selectByIndex(1);
      Thread.sleep(4000);
      
      Ddoptions.selectByVisibleText("Appium");
      
      // show the list options
       
      List<WebElement> listoptions= Ddoptions.getOptions();
     int size =listoptions.size();
     System.out.println("numbers of element 44444444"+size);
     
    // pass the value(send keys method)
     Dd.sendKeys("selenium");
     
     //find Multiselector options
     //WebElement multipleoptions=Cts.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
     WebElement multipleoptions= Cts.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
     Select multipleoptionsselect= new Select(multipleoptions);
     multipleoptionsselect.selectByValue("1");
     multipleoptionsselect.selectByValue("2");
     multipleoptionsselect.selectByValue("3");
     //
    // button size
   WebElement buttonsize=  Cts.findElement(By.id("dropdown1"));
  int height= buttonsize.getSize().getHeight();
  System.out.println("hit is 6t655:"+height);
     
      
	}

}
