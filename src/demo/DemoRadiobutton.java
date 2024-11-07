package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		WebElement xxx=driver.findElement(By.xpath("//*[@id=\'yes\']"));
		WebElement yyy=driver.findElement(By.xpath("//*[@id=\'no\']"));
		boolean ccc=xxx.isSelected();
		boolean vvv=yyy.isSelected();
		System.out.println("333"+ccc+"444"+vvv);

	}

}
