package basicam.bin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		//Vam.get("http:\\www.leafground.com/pages/Link.html");
		Vam.navigate().to("http://www.leafground.com/pages/table.html");
		//Table header
	List<WebElement>   ggg=	Vam.findElements(By.tagName("th"));
	int sss=ggg.size();
	System.out.println("jjhggagatrfa"+sss);
	//Table row
List<WebElement> yy=	Vam.findElements(By.tagName("tr"));
     int ff=    yy.size();
     System.out.println("jhgygyg"+ff);
     //table data
     List<WebElement> yy1=	Vam.findElements(By.tagName("td"));
     int ee=    yy1.size();
     System.out.println("jhgygyg"+ee);
     //Get the progress value of 'Learn to interact with Elements'
   WebElement ww=  Vam.findElement( By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
  String aa  = ww.getText();
  System.out.println(aa);


	}

}
