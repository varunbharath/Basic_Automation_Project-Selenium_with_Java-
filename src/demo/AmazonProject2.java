package demo;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AmazonProject2{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//enter the amazon
		
	WebElement EnterAmazon=driver.findElement(By.name("q"));
	EnterAmazon.sendKeys("Amazon india "+Keys.ENTER);
	
	//click the loginlink
WebElement clicktheloginlink=driver.findElement(By.partialLinkText("Online Shopping site in India: Shop Online for Mobiles, Books ..."));
clicktheloginlink.click();
// click the signi"
WebElement signin=driver.findElement(By.id("nav-link-accountList"));
signin.click();
//click the signupbutton
WebElement clickthesignupbutton=driver.findElement(By.id("createAccountSubmit"));
clickthesignupbutton.click();


//find the color for continue button
WebElement findthecolorcontinuebutton=driver.findElement(By.id("continue"));
String color=findthecolorcontinuebutton.getCssValue("background-color");
System.out.println("balck is my favourite:"+color);
//enter your name
WebElement enteryourname=driver.findElement(By.id("ap_customer_name"));
enteryourname.sendKeys("sabari");
driver.findElement(By.xpath("//*[@id='ap_phone_number']")).sendKeys("8877665544");
//dropdownoption choose the countrycode
//WebElement dropdownoptionchoosethecountrycode=driver.findElement(By.xpath("//*[@id=\"auth-country-picker-container\"]/span/span/span"));
//Select dropdown=new Select(dropdownoptionchoosethecountrycode);
//dropdown.selectByIndex(7);
//enter the mailid
WebElement entermailid=driver.findElement(By.id("ap_email"));
entermailid.sendKeys("12345gge@gmail.com");
//enter the password

WebElement enterthepassword=driver.findElement(By.id("ap_password"));
enterthepassword.sendKeys("@@@@2@@");
Thread.sleep(3000);
//WebElement reenterthepassword=driver.findElement(By.name("passwordCheck"));
//reenterthepassword.sendKeys("@@@@2@@");

//click the continuebutton
//WebElement continebutton=driver.findElement(By.id("continue"));
//continebutton.click();
Thread.sleep(2000);
//find the color for continue button
//WebElement findthecolorcontinuebutton=driver.findElement(By.id("continue"));
//String color=findthecolorcontinuebutton.getCssValue("background-color");
//System.out.println("balck is my favourite:"+color);
// find the position 
WebElement findtheposition=driver.findElement(By.id("continue"));
org.openqa.selenium.Point Xylocation=findtheposition.getLocation();
int xvalue=Xylocation.getX();
int yvalue=Xylocation.getY();
System.out.println("ssdssee"+xvalue+"fyftdrd5"+yvalue);
//checkthebuttonsize
WebElement buttonsize=driver.findElement(By.id("continue"));
int height=buttonsize.getSize().getHeight();
int width=buttonsize.getSize().getWidth();
System.out.println("43353534.222:"+height+"654364536.7545"+width);


//click the continuebutton
WebElement continebutton=driver.findElement(By.id("continue"));
continebutton.click();
// signin button
WebElement signinbutton=driver.findElement(By.partialLinkText( "Sign-In"));
signinbutton.click();
//signin mailid
WebElement mailid=driver.findElement(By.name("email"));
mailid.sendKeys("6637463@gmail.com");
//click the continuebutton in signin page
WebElement clickcontinuebutton=driver.findElement(By.id("continue"));
clickcontinuebutton.click();
//enter the need help button
WebElement clicktheneedhelpbutton=driver.findElement(By.partialLinkText("Need help?"));
clicktheneedhelpbutton.click();
//click the forgot password
WebElement clickforgotbutton=driver.findElement(By.partialLinkText("Forgot Password"));
clickforgotbutton.click();
//click the continuebutton1 forgot page
WebElement clickcontinuebutton1=driver.findElement(By.id("continue"));
clickcontinuebutton1.click();
//click the customer service 
WebElement customerservice=driver.findElement(By.partialLinkText("Customer Service"));
customerservice.click();
//select the drop down option
WebElement selectdropdown22=driver.findElement(By.id("cu-select-firstNode"));

Select dropdown22=new Select(selectdropdown22);
dropdown22.selectByIndex(2);
Thread.sleep(2000);

// click back to top 
WebElement clickbacktotop=driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));

clickbacktotop.click();
//select the address
WebElement selectaddress=driver.findElement(By.partialLinkText("Select your address"));
selectaddress.click();
Thread.sleep(1000);
//enter your pincode
WebElement pincode=driver.findElement(By.id("GLUXZipUpdateInput"));
pincode.sendKeys("625515");
Thread.sleep(1000);
//click the apply
WebElement clickapply=driver.findElement(By.xpath("//*[@id=\'GLUXZipUpdate\']/span/input"));

clickapply.click();
Thread.sleep(1000);
//click the amazon icon 
WebElement amazon=driver.findElement(By.id("nav-logo-sprites"));
amazon.click();
Thread.sleep(1000);
//clicktheallbutton
WebElement clicktheallbutton=driver.findElement(By.xpath("//*[@id=\'nav-hamburger-menu\']/span"));

clicktheallbutton.click();
//click the mobile,computer 
WebElement mobilecomputer=driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[1]/li[15]/a"));

mobilecomputer.click();
//click all mobilephone
WebElement allmobilephone=driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[8]/li[3]/a"));

allmobilephone.click();
Thread.sleep(1000);
//click the made for amazon
WebElement clickmadeforamazon=driver.findElement(By.xpath("//*[@id=\'s-refinements\']/div[2]/ul/li/span/a/div/label/i"));
clickmadeforamazon.click();
Thread.sleep(1000);
//click zinq tech
WebElement zinqtech=driver.findElement(By.xpath("//*[@id=\'p_89/Zinq Technologies\']/span/a/span"));
zinqtech.click();
Thread.sleep(1000);
//click dyazo
WebElement dyazo =driver.findElement(By.xpath("//*[@id=\'p_89/Dyazo\']/span/a/span"));

	dyazo.click();
	Thread.sleep(1000);
	//click the featured
	WebElement clickfeatured=driver.findElement(By.xpath("//*[@id=\'a-autoid-0-announce\']"));
	
	//clickfeatured.click();
	Select featured=new Select(clickfeatured);
	
	featured.selectByIndex(1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}