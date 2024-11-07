package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html"); 
		
		WebElement searchbox=driver.findElement(By.id("tags"));
		searchbox.sendKeys("a");
		Thread.sleep(5000);
	List<WebElement> xxx=	driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	for (WebElement ram : xxx) {
		if (ram.getText().equals("Rest API")) 
		
		{
		ram.click();
		
			
			}
		
		else {
			Thread.sleep(3000);
			driver.close();
		}
	}
	
	}

}
