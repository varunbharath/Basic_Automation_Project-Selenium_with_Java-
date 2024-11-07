import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Vam.get("http:\\www.leafground.com/pages/Link.html");
		driver.get("https://www.youtube.com/");
driver.findElement(By.id("search")).sendKeys("tamil new songs");
Thread.sleep(5000);
driver.findElement(By.id("search-icon-legacy")).click();

	}

}
