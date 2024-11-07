package basicam.bin;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Window.html");
String parentwindow=driver.getWindowHandle();

//click the homepage
WebElement home=driver.findElement(By.id("home"));

home.click();
Set<String> childwindow1= driver.getWindowHandles();
for (String aaaa : childwindow1) {
	driver.switchTo().window(aaaa);
	
//click the button	
}
WebElement clickthebutton=   driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img"));
clickthebutton.click();
 driver.switchTo().window(parentwindow);
 //click the multiple windoew
 WebElement multiplewindow1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));

multiplewindow1.click();
int size1=  driver.getWindowHandles().size();
System.out.println("xxx is 555"+size1);



Thread.sleep(3000);
driver.manage().window().maximize();
driver.switchTo().window(parentwindow);
Thread.sleep(3000);
Set<String> cccc= driver.getWindowHandles();
for (String bbbb : cccc) {
	if(!bbbb.equals(parentwindow)) {
		driver.switchTo().window(bbbb);
		driver.close();
	}
		

	
}
driver.switchTo().window(parentwindow);
Thread.sleep(5000);
//click the last button
 WebElement lastbutton1=   driver.findElement(By.id("color"));
 lastbutton1.click();

	}

}
