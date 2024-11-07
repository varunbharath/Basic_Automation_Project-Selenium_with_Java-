package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Tidel= new ChromeDriver();
		Tidel.get("http://www.leafground.com/pages/Button.html");
		 //1)go the home page  
		
		//WebElement homepage= Tidel.findElement(By.id("home"));
		//homepage.click();
		
		//2)find the position 
		WebElement Position= Tidel.findElement(By.id("position"));
		Point   xyaxis=    Position.getLocation();
	int	xvalue=xyaxis.getX();
	int	yvalue=xyaxis.getY();
	System.out.println("x value is 20x:"+xvalue+"y value is 30:"+ yvalue);
	 
	//3) find the colorbutton
	WebElement colorbutton= Tidel.findElement(By.id("color"));
String color=	colorbutton.getCssValue("background-color");
System.out.println("button colour is red:"+color);
  
//4)find the size 
WebElement buttonsize=Tidel.findElement(By.id("size"));
int height=buttonsize.getSize().getHeight();
int width= buttonsize.getSize().getWidth();
System.out.println("height is 23:"+height+"width is 45:"+width);

// go the home page
WebElement homepage= Tidel.findElement(By.id("home"));

homepage.click();
	
	
	

		

	}

}
