package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		//Vam.get("http:\\www.leafground.com/pages/Link.html");
		Vam.get("http://www.leafground.com/pages/Edit.html");
		Vam.findElement(By.linkText("Go to Home Page")).click();
		//Vam.findElement(By.linkText("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
		Vam.findElement(By.id("email")).sendKeys("kumarbharathbe2gmail.com");
		//Vam.findElements(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("bharath");
		Vam.findElement(By.xpath("//*[@id=\\'contentblock\\']/section/div[2]/div/div/input")).sendKeys("bharath");
		//String value= Vam.findElements(By.name("username")).getAttribute("value");
		String  value = Vam.findElement(By.name("username")).getAttribute("value");
		System.out.println("value");
		Vam.findElement(By.name("username")).clear();

	}

}
