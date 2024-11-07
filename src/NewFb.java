import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basicam.Alert;

public class NewFb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\kumar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.facebook.com/");
WebElement rr=driver.findElement(By.xpath("//*[text()=\"Create a Page\"]"));
Thread.sleep(3000);
rr.click();
WebElement tt=driver.findElement(By.xpath("//*[text()=\"Sign Up\"]"));
Thread.sleep(3000);
tt.click();
WebElement uu=driver.findElement(By.name("firstname"));
Thread.sleep(3000);
uu.sendKeys("Varun");
WebElement ff=driver.findElement(By.name("lastname"));
Thread.sleep(3000);
ff.sendKeys("Bharath");
WebElement ggq=driver.findElement(By.name("reg_email__"));
Thread.sleep(3000);
ggq.sendKeys("8748374873");
WebElement yy=driver.findElement(By.id("password_step_input"));
Thread.sleep(3000);
yy.sendKeys("FaceBook22");
WebElement ss=driver.findElement( By.name("birthday_day"));
Thread.sleep(3000);
Select dd= new Select (ss);
dd.selectByValue("8");
Thread.sleep(3000);

WebElement jk=driver.findElement(By.name("birthday_month"));
Select oo=new Select(jk);
oo.selectByValue("10");
Thread.sleep(3000);
WebElement hj=driver.findElement(By.name("birthday_year"));
Thread.sleep(3000);
Select hho=new Select(hj);
hho.selectByValue("1998");
Thread.sleep(3000);
WebElement ffw=driver.findElement(By.xpath("//*[text()=\"Male\"]"));
Thread.sleep(3000);
ffw.click();

WebElement vv=driver.findElement(By.name("websubmit"));
vv.click();
Thread.sleep(3000);
WebElement ii=driver.findElement(By.xpath("//*[text()='Continue']"));
ii.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-checkmark']")).click();
WebElement vv1=driver.findElement(By.name("websubmit"));
vv1.click();
//Alert mm =driver.switchTo().alert();






	}

}
