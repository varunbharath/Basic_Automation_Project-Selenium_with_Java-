package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int xxx=selectable.size();
		System.out.println(xxx);
		Actions work=new Actions(driver);
		work.keyDown(Keys.CONTROL).click(selectable.get(1)).click(selectable.get(2)).click(selectable.get(5)).build().perform();
		//work.clickAndHold(selectable.get(1));
		//work.clickAndHold(selectable.get(2));
		//work.clickAndHold(selectable.get(4));
	//	work.build().perform();
	}

}
