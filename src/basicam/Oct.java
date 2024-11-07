package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		WebElement gg=driver.findElement(By.name("search_query"));
		gg.sendKeys(" private party");
Thread.sleep(3000);
WebElement hh= driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
hh.click();
Thread.sleep(3000);
WebElement yy=driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
yy.click();
	}

}
