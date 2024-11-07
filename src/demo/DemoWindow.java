package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
	String nnm=	driver.getWindowHandle();
	// click the home page
WebElement vvv=	driver.findElement(By.id("home"));
vvv.click();
 Set<String> bbb=driver.getWindowHandles();
 for (String wwww : bbb) {
	 driver.switchTo().window(wwww);
	 Thread.sleep(2000);
	
}
 WebElement ccc= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
ccc.click();
Thread.sleep(2000);
driver.switchTo().window(nnm);
Thread.sleep(2000);

//click multiple window
WebElement sss=   driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
sss.click();
 Set<String> xxxx=     driver.getWindowHandles();
 for (String dddd : xxxx) {
	 driver.switchTo().window("CDwindow-64753F2FECE9956D166EC1E78581EE08");

	 
	
}
Set<String> zzzz=  driver.getWindowHandles();
System.out.println(zzzz);
 
 
 
 
 
 
 
driver.close();











}

}
