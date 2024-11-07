package basicam.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		
		WebElement drag1=driver.findElement(By.id("draggable"));
		WebElement drop1=driver.findElement(By.id("droppable"));
		Actions bbbb=new Actions(driver);
		//bbbb.clickAndHold(drag1).moveToElement(drop1).release(drop1).build().perform();
		bbbb.dragAndDrop(drag1, drop1).build().perform();

	}

}
