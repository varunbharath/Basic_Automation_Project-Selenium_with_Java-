package basicam;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBooKAutomationExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/search?q=facebook+login&rlz=1C1CHBF_enIN1007IN1007&oq=f&aqs=chrome.0.69i59j69i57j0i131i433i512l3j69i60l3.2613j0j7&sourceid=chrome&ie=UTF-8");
 
//1) go the login URL
WebElement clicktheloginURL=driver.findElement(By.partialLinkText("Facebook - log in or sign up"));
clicktheloginURL.click();
//2) go the signup page
WebElement gothesignuppage=driver.findElement(By.linkText("Create New Account"));
	gothesignuppage.click();
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	
	
	//3) enter the  firstname
	WebElement  enterthefirstname =driver.findElement(By.name("firstname"));
	enterthefirstname.sendKeys("Aadhi");
	//4) enter the secondName
	WebElement enterlastname=driver.findElement(By.name("lastname"));
	enterlastname.sendKeys("CSE");
	//5)enter the mailid
WebElement entermailid=	driver.findElement(By.name("reg_email__"));
entermailid.sendKeys("1234@gmail.com");

driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
//resubmit the mailid
WebElement resubmitthemailid=driver.findElement(By.name("reg_email_confirmation__"));
resubmitthemailid.sendKeys("1234@gmail.com");





// enthe the password
WebElement enterthepassword=driver.findElement(By.id("password_step_input"));
enterthepassword.sendKeys("Passw0rd");
//enter the date
WebElement date=driver.findElement(By.name("birthday_day"));
Select birthdatdate=new Select(date);

birthdatdate.selectByValue("8");
// select the month
WebElement Birthdaymonth=driver.findElement(By.name("birthday_month"));
Select month=new Select(Birthdaymonth);
month.selectByIndex(0);

//List<WebElement>  listoptions=month.getOptions();
//int sizevalue=listoptions.size();
//System.out.println("12 months:"+sizevalue);
//birthday year 
WebElement birtdayyear=driver.findElement(By.name("birthday_year"));
Select year=new Select(birtdayyear);
year.selectByVisibleText("2014");
//select the gender
WebElement gender=driver.findElement(By.name("sex"));
gender.click();
//Your pronoun is visible to everyone
//WebElement entertheBirthdaywishes=driver.findElement(By.name("preferred_pronoun"));
//Select text=new Select(entertheBirthdaywishes);
//text.selectByValue("2");
//Gender (optional)
WebElement genderoptional=driver.findElement(By.name("sex"));
genderoptional.click();
driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
//learn more
//WebElement learnmore=driver.findElement(By.partialLinkText("Learn more"));
//learnmore.click();
//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
//click the submit
WebElement submitvalue=driver.findElement(By.name("websubmit"));
submitvalue.submit();
//WebElement submit=driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v]"));
//submit.click();
//driver.findElement(By.cssSelector(""))
//resubmit the mailid
//WebElement resubmitthemailid=driver.findElement(By.name("reg_email_confirmation__"));
//resubmitthemailid.sendKeys("1234@gmail.com");
driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

//click the submit
WebElement submitvalue1=driver.findElement(By.name("websubmit"));
submitvalue1.click();

	
	
	
	
	
	}

}
