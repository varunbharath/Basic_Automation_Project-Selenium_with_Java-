package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/"); 
		WebElement enterthevalue=driver.findElement(By.name("q"));
		enterthevalue.sendKeys("M");
		Thread.sleep(3000);
		List<WebElement> selectoption=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li"));
		
for (WebElement myoption : selectoption) {
	if(!myoption.getText().equals("map")) {
		System.out.println(myoption);
		break;
	}
	else {
		driver.close();
	}
}
	}

}
