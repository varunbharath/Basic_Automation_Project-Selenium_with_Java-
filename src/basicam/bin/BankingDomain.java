package basicam.bin;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingDomain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.demo.guru99.com/V4/");
        //Gurubank99 login process
        driver.findElement(By.name("uid")).sendKeys("mngr427164");
        driver.findElement(By.name("password")).sendKeys("UqavUbu");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        //add new Customer
        driver.findElement(By.partialLinkText("New Customer")).click();
        driver.findElement(By.name("name")).sendKeys("ANU");
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
        driver.findElement(By.name("dob")).sendKeys("01-10-1998");
        driver.findElement(By.name("addr")).sendKeys("xxx,yyy,zzzz");
        
        driver.findElement(By.name("city")).sendKeys("Coimbatore");
        driver.findElement(By.name("pinno")).sendKeys("6250008");
        driver.findElement(By.name("telephoneno")).sendKeys("9988776655");
        driver.findElement(By.name("emailid")).sendKeys("coimbatore@gmail.com");
        
        driver.findElement(By.name("password")).sendKeys("Coimbatore");
        driver.findElement(By.name("sub")).click();
        
       
        
        
        
        
       
	}

}
