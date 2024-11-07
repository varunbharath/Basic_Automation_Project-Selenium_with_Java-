package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//1) enter mail id
	WebElement enteremailid=	driver.findElement(By.id("email"));
	enteremailid.sendKeys("123@gmail.com");
	Thread.sleep(3000);
	
	//2)enter password
	WebElement enterpassword= driver.findElement(By.id("pass"));
	enterpassword.sendKeys("passw0rd");
	Thread.sleep(3000);
	// login button
	WebElement clickloginbutton=driver.findElement(By.name("login"));
	clickloginbutton.click();
	Thread.sleep(3000);
	//color
	WebElement color=driver.findElement(By.id("login"));
	String findcolor =color.getCssValue("background-color");
	System.out.println("login boxcolorblue :"+findcolor);
	//find size
	WebElement findthesize=driver.findElement(By.name("login"));
    int height=	findthesize.getSize().getHeight();
    int width= findthesize.getSize().getWidth();
    System.out.println("height is 23444.3444 :"+height+"width  is 2624.534256 :"+width);
    //find position
   WebElement fintxyposition= driver.findElement(By.name("login"));
  int xposition= fintxyposition.getLocation().getX();
  int yposition=fintxyposition.getLocation().getY();
  System.out.println("x position is 5678: " + xposition+"y position is 743674:"+yposition);
  
	
	
	
	
		

	}

}
