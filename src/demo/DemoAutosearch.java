package demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutosearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.google.com");
			WebElement search=	driver.findElement(By.name("q"));
			search.sendKeys("si");
		List<WebElement> zzz=	driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li"));
		int aaa=zzz.size();
		System.out.println(aaa);
		for (WebElement aadhi : zzz) {
			if(aadhi.getText().equals("siva")) {
			
				
			}
			else
			{
				driver.close();
			}
			}
			
		}

	}


