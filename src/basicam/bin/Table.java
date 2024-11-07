package basicam.bin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.navigate().to("http://www.leafground.com/pages/table.html");
		
	List<WebElement> vv=	Vam.findElements(By.tagName("th"));
int bb=	vv.size();
System.out.println("table header"+bb);

     List<WebElement> cc=Vam.findElements(By.tagName("tr"));
 int gg = cc.size();
 System.out.println("table row"+gg );
 Vam.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
 
		
			
 List<WebElement> cc2=Vam.findElements(By.tagName("td"));
 int gg3 = cc2.size();
 System.out.println("table data"+gg3 );
 
 
 WebElement dd= Vam.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/table/tbody/tr[3]/td[1]/font"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
