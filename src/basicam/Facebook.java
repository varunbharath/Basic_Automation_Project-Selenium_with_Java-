package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.get("https://www.facebook.com/");
		
		WebElement emailaddress= Vam.findElement(By.id("email"));
		 emailaddress.sendKeys("123@gmail.com");
		 
		 WebElement Password= Vam.findElement(By.id("pass"));
		 Password.sendKeys("12345678");
		 
		// WebElement login= Vam.findElement(By.xpath("//*[@id=\"u_0_d_KF\"]"));
		 WebElement login= Vam.findElement(By.name("login"));
		 login.click();
		
		
		

	}

}
