package basicam.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		//Vam.get("http:\\www.leafground.com/pages/Link.html");
		Vam.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
	WebElement xxx=	Vam.findElement(By.id("datepicker"));
	xxx.click();
	
	//select the year&month
WebElement cc=	Vam.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
cc.click();
Thread.sleep(1000);
//cc.click();
/*c.click();
Thread.sleep(1000);
cc.click();
Thread.sleep(1000);
cc.click();
Thread.sleep(1000);
cc.click();
Thread.sleep(1000);
cc.click();*/
WebElement cc11=	Vam.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
cc11.click();
Thread.sleep(1000);
WebElement xxx1=	Vam.findElement(By.id("datepicker"));
xxx1.sendKeys("10/08/2022"+Keys.ENTER);
WebElement ss=		Vam.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[6]/td[2]/a"));
ss.click();
		
		
		
	}

}
