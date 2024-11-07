package basicam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		//Vam.get("http:\\www.leafground.com/pages/Link.html");
		Vam.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailbox= Vam.findElement(By.id("email"));
		emailbox.sendKeys("35242@gmail.com");
		Vam.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		WebElement Appendbox= Vam.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Appendbox.sendKeys("bharath2222");
		
		WebElement Getdefaulttextentered= Vam.findElement(By.name("username"));
		String value =Getdefaulttextentered.getAttribute("Value");
		System.out.println(value);
		
		WebElement Clearthetext= Vam.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		 Clearthetext.clear();
		 
		 WebElement  Confirmthateditfieldisdisabled  =Vam.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		//WebElement  
		 Confirmthateditfieldisdisabled  =Vam.findElement(By.xpath("//*[@id=\"email\"]"));
		 
		Boolean  Enable=  Confirmthateditfieldisdisabled.isEnabled();
		System.out.println(Enable);
		
		

	}

}
