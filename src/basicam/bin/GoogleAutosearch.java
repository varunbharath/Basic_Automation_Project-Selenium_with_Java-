package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	WebElement search=	driver.findElement(By.name("q"));
	search.sendKeys("s");
	Thread.sleep(3000);
	
	List<WebElement> xxx1 =driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li"));
	System.out.println(xxx1.size());
	
	for (WebElement searchbox2 : xxx1) {
		if(searchbox2.getText().equalsIgnoreCase("speed test")) {
			searchbox2.click();}
		 break;
			
		
		
	}
	
	
	
	
	
	
	}}

	
