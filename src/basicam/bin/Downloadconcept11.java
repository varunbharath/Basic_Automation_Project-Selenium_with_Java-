package basicam.bin;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadconcept11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/generate-file-to-download-demo.html");
// enter the data
		WebElement enterthedata=  driver.findElement(By.id("textbox"));
	enterthedata.sendKeys("software testing posting=2344232737e6356");
	//generate the file
WebElement generatethefile=	driver.findElement(By.id("create"));
generatethefile.click();
//click download file
WebElement download=driver.findElement(By.id("link-to-download"));

download.click();

/*File checkthedownloadfile=new File("C:\\Users\\kumar\\Downloads");
File[]checkthefiles=checkthedownloadfile.listFiles();
for (File easyfile : checkthefiles) {
	if(easyfile.getName().equals("easyinfo (2)")) {
		System.out.println(easyfile);
		break;
	}
	
	else
	{
		driver.close();
		
	}
	*/
	}

	



	}


