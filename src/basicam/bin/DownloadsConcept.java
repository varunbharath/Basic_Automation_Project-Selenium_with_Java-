package basicam.bin;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsConcept {

	public static void main(String[] args) throws InterruptedException  {{
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//	WebDriver intel=new ChromeDriver();
		
	//	intel.get("https://www.rejinpaul.com/2022/06/ge8076-professional-ethics-in-engineering-important-questions.html");
		
	//	WebElement downloadfile=   intel.findElement(By.partialLinkText("Click here to Download"));
	//	Thread.sleep(3000);
	//	downloadfile.click();
		
		
		File downloads2=new File("C:\\Users\\kumar\\Downloads\\geckodriver-v0.31.0-win64");
		Thread.sleep(1000);
		File[] aaa=downloads2.listFiles();
		for (File VAM : aaa) {
			if(VAM.getName().equals("geckodriver.exe"));
			break;
		}}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
