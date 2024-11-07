package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. open chrome
		//2. Google home page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
			//driver.quit();
		//enter a search term
		// go the particular page
		//driver.findElement(By.name("q")).sendKeys("Mindtree coimbatore"+Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys("Mindtree Coimbatore"+Keys.ENTER);
		

	
	}
}
