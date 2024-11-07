package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		//click on firstbutton
		driver.switchTo().frame(0);
		WebElement clickonfirstoption=driver.findElement(By.id("Click"));
	
		clickonfirstoption.click();
		driver.switchTo().defaultContent();
		//cluck on 2nd option.
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement clickon2ndoption=driver.findElement(By.id("Click1"));
		clickon2ndoption.click();
		//driver.getsize();
		// find the frame
		driver.switchTo().defaultContent();
		List<WebElement> findtheframe=driver.findElements(By.tagName("iframe"));
		 int xxx =findtheframe.size();
		 System.out.println("56"+xxx);
		
		

	}

}
