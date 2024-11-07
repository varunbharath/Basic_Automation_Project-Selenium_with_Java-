package basicam.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xxxxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Cts =new ChromeDriver();
		Cts.get("http://demo.guru99.com/test/upload/");
		WebElement ccc=Cts.findElement(By.xpath("//*[@id=\'uploadfile_0\']"));
		
	}

}
