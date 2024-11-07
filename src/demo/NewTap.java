package demo;

import java.sql.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
	String nnm=	driver.getWindowHandle();
	WebElement xxx=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	xxx.click();
	 ArrayList<String> bbb=new ArrayList<String>( driver.getWindowHandles()) ;
       driver.switchTo().window(bbb.get(1));
   WebElement vvv= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/a"));
     driver.manage().window().maximize();
     Thread.sleep(2000);
     vvv.click();
     Thread.sleep(2000);
    WebElement cc=   driver.findElement(By.xpath("//*[@id=\'position\']"));
      int x=  cc.getLocation().getX();
      int y=cc.getLocation().getY();
      System.out.println("vvvh"+x+"vvbhbhg"+y);
      // driver.close();
 driver.switchTo().window(nnm);
	}

}
