package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kumar\\\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/accounts/login/?source=auth_switcher");
		//signup
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[2]/div/p/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("b1412341@gmail.com");

		//driver.findElement(By.name("emailOrPhone")).sendKeys("8866778800");
		driver.findElement(By.name("fullName")).sendKeys("Varun");
	driver.findElement(By.name("username")).sendKeys("b1412341");
	driver.findElement(By.name("password")).sendKeys("passw0rd");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[7]/div")).click();
Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[6]/div/div/div/button")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[6]/div/div/div/button")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[5]/div/div/div/button/span")).click();
	//driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[6]/div/div/div/button")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//login 
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("username")).sendKeys("asustuf45");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("asus@123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	//home
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Not Now']")).click();
	Thread.sleep(5000);
	// searchfieldzzzzzzzzzzzzzzzzz
	driver.findElement(By.xpath("//*[text()='Search']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@aria-label='Search input']")).sendKeys("sabari_nathan_ds");
	Thread.sleep(5000);
	
WebElement dd=	driver.findElement(By.xpath("//*[text()='sabari_nathan_ds']"));
dd.click();
Thread.sleep(5000);
// click follow
driver.findElement(By.xpath("//*[text()='Follow']")).click();
Thread.sleep(5000);
// click home
  WebElement ggg=        driver.findElement(By.xpath("//*[@aria-label='Home']"));
  ggg.click();
Thread.sleep(5000);
//click the story
driver.findElement(By.xpath("//*[text()='therock']")).click();
Thread.sleep(5000);
//addlike 
driver.findElement(By.xpath("//*[@id=\"mount_0_0_v6\"]/div/div/div/div[1]/div/div/div/div[1]/div[1]/section/div[1]/div/div[5]/section/div/div[3]/div/div/span/button/div[2]/span/svg")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@aria-label='Next']")).click();
	}
		
}
