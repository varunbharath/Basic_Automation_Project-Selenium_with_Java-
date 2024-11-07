package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampledynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.get("http:\\www.leafground.com");
	List<WebElement>	bb   =  Vam.findElements(By.xpath("//*[@id='j_idt154_content']//td[1]//span"));
	for (WebElement sample : bb) {
		if (sample.getText().contains("USA")) {
			System.out.println("ok");
			//break;
		}
		else
		{
			System.out.println("bb");
		}
		
		
	}}

	}


