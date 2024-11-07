package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.navigate().to("http://www.leafground.com/pages/Link.html");
	WebElement xx=	 Vam.findElement(By.linkText("Go to Home Page"));
	Thread.sleep(2000);
	xx.click();
	Thread.sleep(4000);
	Vam.navigate().back();
	// Find where am supposed to go without clicking me?
WebElement ss	=Vam.findElement(By.partialLinkText("Find where am supposed to go without clicking me?"));
  String dd=  ss.getAttribute("href");
  System.out.println("vvvvv"+dd);
  //Verify am I broken?
 WebElement hh= Vam.findElement(By.partialLinkText("Verify am I broken?"));
hh.click();
String ii=Vam.getTitle();
if (ii.contains("404")) {
	System.out.println("ok");
}
else {
	System.out.println("non ok");
}
Thread.sleep(2000);
Vam.navigate().back();
// how many links
//Vam.navigate().back();
 List<WebElement>  ddd1=Vam.findElements(By.tagName("a"));
int aa=ddd1.size();
System.out.println("ffff"+aa);
	}

}
