package demo;

import java.util.List;import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basicam.bin.SelectableConcept;

public class DemoSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
List<WebElement> bbb=  driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
int cc=bbb.size();
System.out.println(cc);
		Actions Tidel=new Actions(driver);
	/*	Tidel.clickAndHold(bbb.get(1));
		Tidel.clickAndHold(bbb.get(0));
		Tidel.clickAndHold(bbb.get(4));
		Tidel.build().perform();*/
		Tidel.keyDown(Keys.CONTROL).clickAndHold(bbb.get(3)).clickAndHold(bbb.get(2));
				Tidel.build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
