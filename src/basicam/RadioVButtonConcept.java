package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioVButtonConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked=driver.findElement(By.id("no"));
		WebElement Checked=driver.findElement(By.id("yes"));
		Thread.sleep(3000);
		boolean Status=unchecked.isSelected();
		boolean Status1=Checked.isSelected();
		System.out.println("yes"+Status+"yes2"+Status1);
		  Thread.sleep(3000);
		
		//WebElement agegroup21-40=div
		WebElement agegroup21to40=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		
		agegroup21to40.click();
		Thread.sleep(3000);
		
		
		

	} 

}
