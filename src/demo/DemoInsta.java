package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoInsta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/payment-gateway/index.php");
		Thread.sleep(3000);
		//choose the quantity
		WebElement dd=driver.findElement(By.name("quantity"));
		Select dropdowm1=new Select(dd);
		dropdowm1.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Buy Now']")).click();
		driver.findElement(By.id("card_nmuber")).sendKeys("2233445566778899");
	WebElement month1=	driver.findElement(By.id("month"));
	Select monthoptions=new Select(month1);
	monthoptions.selectByVisibleText("06");
	Thread.sleep(3000);
WebElement www=	driver.findElement(By.id("year"));
Select ddy=new Select(www);
Thread.sleep(3000);
ddy.selectByVisibleText("2022");
WebElement web=driver.findElement(By.id("cvv_code") );
Thread.sleep(3000);
web.sendKeys("453");
Thread.sleep(3000);
driver.findElement(By.name("submit")).click();
Thread.sleep(3000);
WebElement gggyyyuu=driver.findElement(By.xpath("//*[text()='Order ID']//following::td[1]"));
Thread.sleep(3000);
System.out.println(gggyyyuu);
		
	 
		
			
	}

	}


