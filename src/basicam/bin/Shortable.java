package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.get("http://www.leafground.com/pages/sortable.html");
	List<WebElement> bb=	Vam.findElements(By.xpath("//*[@id=\'sortable\']/li"));
	WebElement ff=bb.get(2);
	WebElement to=bb.get(5);
	Actions yy=new Actions(Vam);
	Thread.sleep(2000);
	//yy.dragAndDrop(ff, to).build().perform();
	yy.clickAndHold(ff);
	yy.moveToElement(to);
	yy.release(to);
	yy.build().perform();

	}

}
