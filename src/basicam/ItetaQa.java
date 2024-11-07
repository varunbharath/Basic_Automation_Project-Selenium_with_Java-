package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItetaQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		//Vam.get("http:\\www.leafground.com/pages/Link.html");
		Vam.get("https://www.itera-qa.azurewebsites.net/home");
		WebElement typegoogle=Vam.findElement(By.name("q"));
		typegoogle.sendKeys("Itera-qa"+Keys.ENTER);
		//click the Testautomation link
		WebElement Testautomationlink=Vam.findElement(By.partialLinkText("Home Page - Testautomation practice page"));
Testautomationlink.click();		

	}

}
