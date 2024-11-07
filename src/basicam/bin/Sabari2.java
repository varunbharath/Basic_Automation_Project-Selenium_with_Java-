package basicam.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sabari2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//1) enter the Itera-qa in  google search place
	WebElement enterItera=	driver.findElement(By.name("q"));
	enterItera.sendKeys("Itera-qa"+Keys.ENTER);
	Thread.sleep(1000);
	//Test automation practice page
	WebElement testautomationpage=driver.findElement(By.partialLinkText("Home Page - Testautomation practice page"));
testautomationpage.click();
// click the test automation
WebElement testautomation1=driver.findElement(By.partialLinkText("Test Automation"));
testautomation1.click();
Thread.sleep(1000);
//enter  the name
WebElement enterthename=driver.findElement(By.id("name"));
enterthename.sendKeys("Aadi");
Thread.sleep(1000);
Thread.sleep(1000);
//enter the mobile number
WebElement mobilenumber=driver.findElement(By.id("phone"));
mobilenumber.sendKeys("0987654321");
Thread.sleep(1000);
//enter the mailid
WebElement mailid=driver.findElement(By.id("email"));
mailid.sendKeys("aathicse@gmail.com");
Thread.sleep(1000);
//enter the password
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("@@222@@@@@a");
Thread.sleep(1000);
//click the address
WebElement address=driver.findElement(By.id("address"));
address.sendKeys("xxxxxxxx,yyyyyyy,zzzzzzzz,63536536");
Thread.sleep(1000);
// Check the click button size
WebElement button=driver.findElement(By.name("submit"));
int height =button.getSize().getHeight();
int width= button.getSize().getWidth();
System.out.println("height is 555.555000cm"+height+"width is 3221.4434");
Thread.sleep(1000);
//check the button location
WebElement button1=driver.findElement(By.name("submit"));
int xvalue=button1.getLocation().getX();
int yvalue=button1.getLocation().getY();
System.out.println("x position is 54e3645:"+xvalue+"y position is yuydyuwdy997");
Thread.sleep(1000);
// check the button color
WebElement buttoncolor=driver.findElement(By.name("submit"));
String value2=buttoncolor.getCssValue("der-coloborr");
System.out.println("black"+value2);
Thread.sleep(1000);
//click the button 
WebElement clickthebutton=driver.findElement(By.name("submit"));
clickthebutton.click();
//click the gender
//WebElement clickgender=driver.findElement(By.id("male"));
//clickgender.click();
Thread.sleep(1000);
// check the conditions for radio button 
WebElement clickornot=driver.findElement(By.id("female"));
boolean sssss=clickornot.isSelected();
System.out.println("notselect22:"+sssss);
Thread.sleep(1000);
//click the gender
WebElement clickgender=driver.findElement(By.id("male"));
clickgender.click();
boolean zzz=clickgender.isSelected();
System.out.println("gygyg:"+zzz);
Thread.sleep(1000);
//check the conditions for the check boxes
WebElement checkboxescondition=driver.findElement(By.id("thursday"));
boolean ee=checkboxescondition.isSelected();
System.out.println("fdsdgshd+ttrue"+ee);
Thread.sleep(1000);
//click the check boxes

WebElement monday=driver.findElement(By.id("monday"));
monday.click();
Thread.sleep(1000);
///click the check boxes
WebElement tuesday=driver.findElement(By.id("tuesday"));
tuesday.click();
Thread.sleep(1000);
//click the check boxes
WebElement wed=driver.findElement(By.id("wednesday"));
wed.click();
Thread.sleep(1000);
//click the check boxes
//WebElement thus=driver.findElement(By.id("thusday"));
//thus.click();
//click the check boxes
WebElement friday=driver.findElement(By.id("friday"));
friday.click();
Thread.sleep(1000);
//list the drop option
WebElement list=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
Thread.sleep(1000);
//click  the overall option in dropdown
WebElement clickthedropdown =driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
Select clickdropdownlist =new Select(clickthedropdown);
clickdropdownlist.selectByValue("1");
Thread.sleep(1000);
//clickthedropdown.sendKeys("Norway");
//choose the radio button22
WebElement radiobutton2=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[3]/label"));
radiobutton2.click();
Thread.sleep(1000);
//click the check box
WebElement checkbox22=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label"));

checkbox22.click();








	}

}
