package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basicam.Alert;

public class BasicProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/");
		// close the ad
		Thread.sleep(2000);
		WebElement closetheAD =driver.findElement(By.xpath("//*[@id=\'at-cv-lightbox-button-holder\']/a[2]"));
closetheAD.click();
// click the start practice
 WebElement practice =driver.findElement(By.id("btn_basic_example"));
 practice.click();
 Thread.sleep(2000);
/* //click the form
WebElement form= driver.findElement(By.partialLinkText("Simple Form Demo"));
form.click();
 //text box
   WebElement textbox=     driver.findElement(By.id("sum1"));
   textbox.sendKeys("715");
   
   WebElement textbox1=     driver.findElement(By.id("sum2"));
   textbox1.sendKeys("7152");
   //click th getvalue
 WebElement  getvalue= driver.findElement(By.xpath("//*[@id=\'gettotal\']/button"));
   getvalue.click();*/
 //click the check box
/* WebElement checkbox= driver.findElement(By.partialLinkText("Check Box Demo"));
 checkbox.click();
 // select the check box
 WebElement checkbox1=     driver.findElement(By.id("check1"));
 checkbox1.click();
 
 //WebElement checkbox2=     driver.findElement(By.id("check2"));
 //checkbox2.click();
 
 //WebElement checkbox3=     driver.findElement(By.id("check3"));
 
 //checkbox3.click();
 
// WebElement checkbox4=     driver.findElement(By.id("check4"));
 //checkbox4.click();
 //click unselect button
 Thread.sleep(2000);
  WebElement unselect=      driver.findElement(By.xpath("//*[@id=\'check1\']"));
  unselect.click();*/
/* //click the radio button
 WebElement Radiobutton= driver.findElement(By.partialLinkText("Radio Buttons Demo"));
 Radiobutton.click();
 //click the male
 WebElement male=      driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
 male.click();
 //click the age 
 WebElement age=      driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label[3]/input"));
 age.click();
 //click the value
 WebElement value=      driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/button"));
 
 value.click();
//WebElement scroll=      driver.findElement(By.xpath(""));
 
 //scroll.click();*/
/*//click the dropdown
WebElement dropdown= driver.findElement(By.partialLinkText("Select Dropdown List"));
dropdown.click();
// select any one option 
 WebElement dropdown1=driver.findElement(By.id("select-demo"));
 //dropdown1.click();
 Select options=new Select(dropdown1);
options.selectByIndex(2);
	List<WebElement>   cccc =options.getOptions();
	int bbbb=cccc.size();
	System.out.println(bbbb);
	// click the multiple option
WebElement  multipleoption=	driver.findElement(By.id("multi-select"));
		Select multiple=new Select (multipleoption);
		multiple.selectByVisibleText("Washington");
		multiple.selectByIndex(0);
		multiple.selectByValue("Texas");
		List<WebElement> nnnnnn=    multiple.getOptions();
	int aaa	=nnnnnn.size();
	System.out.println("gdhsghjdfg"+aaa);*/
//click the JAVASCRIPT
WebElement JAVASCRIPT = driver.findElement(By.partialLinkText("Javascript Alerts"));
JAVASCRIPT.click();
//CLICK ME BUTTON
 //WebElement  clickme=   driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/button"));
 //clickme.click();
/*Alert bbb=driver.switchTo().alert();
bbb.accept();*/
WebElement  promptbox=   driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[3]/div[2]/button"));

promptbox.click();

 
//bbbbb.accept();
 
		
}




 
	}


