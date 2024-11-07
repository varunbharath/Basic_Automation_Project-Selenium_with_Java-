package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicam.Alert;

public class SignUpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		https://www.facebook.com/
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//2) go the signup page
		WebElement gothesignuppage=driver.findElement(By.linkText("Create New Account"));
			gothesignuppage.click();
			//3) enter the  firstname
			WebElement  enterthefirstname =driver.findElement(By.name("firstname"));
			enterthefirstname.click();
			//Alert firstname=driver.switchTo().alert();
			//firstname.click();
			
			
			


	}

}
