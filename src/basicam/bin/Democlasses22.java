package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlasses22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver intel=new ChromeDriver();
		intel.get("http://www.google.com");
		
		
		
		WebElement auto=intel.findElement(By.name("q"));
		auto.sendKeys("s");


		List<WebElement> options=intel.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li"));
		Thread.sleep(1000);

		System.out.println(options.size());
		for (WebElement ss : options) {

		if (ss.getText().equals("Speed Test")){
		ss.click();
		break;
		}

		}

	}

}
