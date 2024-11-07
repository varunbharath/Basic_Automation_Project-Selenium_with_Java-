package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
	WebElement frame1=	driver.findElement(By.id("Click"));
	frame1.click();
	driver.switchTo().defaultContent();
	//click me
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	WebElement  clickme=    driver.findElement(By.id("Click1"));
	clickme.click();
	driver.switchTo().defaultContent();
	// numbers of frame
List<WebElement>  vvv=	driver.findElements(By.tagName("div"));
int list1 =   vvv.size();
System.out.println(list1);

	}

}
