package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
	String nnm=	driver.getWindowHandle();
	WebElement xxx=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	xxx.click();
	Set<String>  aadi=driver.getWindowHandles(); 
	for (String windowHandle : driver.getWindowHandles()) {
		System.out.println(driver.switchTo().window(windowHandle).getTitle());
	//	if(driver.switchTo().window(windowHandle).getTitle().contains(title)) {
		}
		}
		
	}
	


