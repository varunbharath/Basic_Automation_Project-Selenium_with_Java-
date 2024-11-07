package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoseleniumeasy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/");
		// ignore the popup msg
		WebElement ignorethepopup =driver.findElement(By.id("at-cv-lightbox-close"));
		ignorethepopup.click();
		Thread.sleep(1000);
		//1) enter the Itera-qa in  google search place
	WebElement startpractice=	driver.findElement(By.xpath("//*[@id=\'btn_basic_example\']"));
	startpractice.click();
	//click the checkbox option
	WebElement checkboxoption=driver.findElement(By.xpath("//*[@id=\'basic\']/div/a[2]"));
    checkboxoption.click();
	}

}
