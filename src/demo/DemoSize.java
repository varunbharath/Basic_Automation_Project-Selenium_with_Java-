package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Cts =new ChromeDriver();
		Cts.get("http://www.leafground.com/pages/Dropdown.html");
		
List<WebElement> ccc=	Cts.findElements(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/li"));
		//Actions ddd=new Actions(Cts);
		//ddd.keyDown(Keys.CONTROL).clickAndHold(ccc.get(2)).build().perform();
	int xxx	=ccc.size();
	System.out.println("xxx"+xxx);
	
	
	
	
	

	}

}
