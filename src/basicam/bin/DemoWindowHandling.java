package basicam.bin;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		String mainwindow= driver.getWindowHandle();
		//click the home page
		WebElement clickthehomebutton=driver.findElement(By.id("home"));
		clickthehomebutton.click();
	Set<String>	 childwindow1 =driver.getWindowHandles();
		for (String qqq : childwindow1) {
			
		
	driver.switchTo().window(qqq);
	
	
		}		
		// clickthebutton option
		WebElement button1=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a"));
		button1.click();
		//driver.close();
		driver.switchTo().window(mainwindow);
		//driver.close();
		//click themultiplewindow2
		WebElement multiplewindow2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindow2.click();
		int xxx= driver.getWindowHandles().size();
		System.out.println("333"+xxx);
		Set<String> bbb2=driver.getWindowHandles();
		for (String aaa : bbb2) {
			if (!aaa.equals(mainwindow)) {
				
			
			driver.switchTo().window(aaa);
			Thread.sleep(3000);
			driver.close();
			}
				
			
		}
			
	}

}
