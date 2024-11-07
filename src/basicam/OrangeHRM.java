package basicam;



	 import java.time.Duration;
import java.util.ArrayList;
	 import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.support.ui.Select; 
	 public class   OrangeHRM {  public static void main(String[] args) throws InterruptedException { // TODO Auto-generated method stub 
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\kumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,tebsecond);//
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 String ii=driver.getWindowHandle(); Thread.sleep(2000); 
		 
		 //driver.findElement(By.xpath("//[@name='username']")).sendKeys("Admin"); 
		 driver.findElement(By.name("q")).sendKeys("W3Schools");
		 Thread.sleep(2000); 
		 driver.findElement(By.name("btnK")).click(); 
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("https://www.w3schools.com")).click(); 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='w3-bar-item w3-btn w3-right']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/div[1]/span/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/div[1]/span/span")).click(); Thread.sleep(2000); driver.findElement(By.name("email")).sendKeys("selvacsk958@gmail.com"); Thread.sleep(2000);
		 driver.findElement(By.name("current-password")).sendKeys("Valuemomentum@2022");
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click(); 
		 Thread.sleep(2000);
		// windowhandling WebElement hh=driver.findElement(By.xpath("//*[@href='https://campus.w3schools.com/']"));
		// System.out.println("hh:"+ hh); hh.click(); System.out.println("***");
		// Thread.sleep(2000); ArrayList<String> uu2= new ArrayList<String>(driver.getWindowHandles());
		 //Thread.sleep(2000); driver.switchTo().window(uu2.get(2)); Thread.sleep(2000);
		 
		WebElement hh=driver.findElement(By.xpath("//*[contains(text(),'Paid courses')]"));
		 Thread.sleep(5000);
		 hh.click();
		 Thread.sleep(2000);
		 
		 //product search// 
		 WebElement dd= driver.findElement(By.xpath("//*[@class='collection-filters__filter-group-heading productgrid--sidebar-button']")); 
		 dd.click(); //options ( producttype) 
		 driver.findElement(By.xpath("//*[@data-value='Certification']")).click();
		 //options (price) 
		 WebElement vv1= driver.findElement(By.xpath("//*[@class='collection-filters__filter-group-heading productgrid--sidebar-button']"));
		 vv1.click();
		 driver.findElement(By.xpath("//*[@ id='filter-Price-0-from']")).sendKeys("100");
		 driver.findElement(By.xpath("//*[@id='filter-Price-0-to']")).sendKeys("450");
		 
	 }

}
