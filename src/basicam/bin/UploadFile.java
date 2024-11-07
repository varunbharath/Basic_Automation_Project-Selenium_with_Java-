package basicam.bin;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Cts =new ChromeDriver();
		Cts.get("http://demo.guru99.com/test/upload/");
		WebElement ccc=Cts.findElement(By.xpath("//*[@id=\'uploadfile_0\']"));
		//ccc.click();
		/*String fff="C:\\Users\\kumar\\Downloads\\easyinfo(1).txt";
	StringSelection sss	= new StringSelection(fff);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss, null);
	Robot gg=new Robot();
	gg.keyPress(KeyEvent.VK_CONTROL);
	
	gg.keyPress(KeyEvent.VK_V);
	gg.keyRelease(KeyEvent.VK_V);
	gg.keyRelease(KeyEvent.VK_CONTROL);
	gg.keyPress(KeyEvent.VK_ENTER);
	gg.keyRelease(KeyEvent.VK_ENTER);*/
		ccc.sendKeys("C:\\Users\\kumar\\Downloads\\easyinfo(1).txt");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
