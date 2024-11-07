package hug;

import org.antlr.v4.runtime.tree.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hug {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		//WebElement ff=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		//ff.sendKeys("bharath");
		WebElement ff= driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		ff.click();
		Thread.sleep(2000);
		WebElement rr=driver.findElement(By.name("q"));
		rr.sendKeys("laptop");

	}

}
