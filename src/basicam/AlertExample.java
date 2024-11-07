package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			//1)alertbox
			WebElement alertbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
			alertbox.click();
//			
//		Alert alertpopup =driver.switchTo().alert();
//		alertpopup.accept();
//		//2) confirmationoption 
//		WebElement confirmationoption=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
//			Confirmationoption.click();
//			
//		Alert accepttheconfirmation	=driver.switchTo().alert();
//		accepttheconfirmation.accept();
//		
//		Alert rejecttheconfirmation = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
//		rejecttheconfirmation.dismiss();
//		3// promptbox
//		WebElement promptbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
//		promptbox.click();
//		
//		Alert promptalert=driver.switchTo().alert();
//		promptalert.sendkeys("hdhshfgshfbs");
//		promptalert.dismiss();
//		
//		
//		Alert promptalert=driver.switchTo().alert();
//		promptalert.sendkeys("hdhshfgshfbs");
//		promptalert.accept();
		
		
		
		
	
	}

}
