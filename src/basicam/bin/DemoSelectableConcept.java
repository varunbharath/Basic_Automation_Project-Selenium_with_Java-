package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSelectableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
  List<WebElement> cccc=        driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
 int xxxx= cccc.size();
 System.out.println("xxxxx"+xxxx);
 Actions bbbb=new Actions(driver);
		
 /*bbbb.clickAndHold(cccc.get(4));
		 bbbb.click(cccc.get(1));
		 bbbb.click(cccc.get(2));
		 bbbb.build().perform();*/
 bbbb.keyDown(Keys.CONTROL).clickAndHold(cccc.get(6)).clickAndHold(cccc.get(4)).clickAndHold(cccc.get(1)).build().perform();
  
	}

}