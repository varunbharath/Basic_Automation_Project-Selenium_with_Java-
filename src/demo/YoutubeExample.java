package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//1) enter the Itera-qa in  google search place
	WebElement enterItera=	driver.findElement(By.name("q"));
	enterItera.sendKeys("Youtube"+Keys.ENTER);
	//click the youtubelink
	WebElement clickyoutube=driver.findElement(By.partialLinkText("YouTube"));
	clickyoutube.click();
	Thread.sleep(1000);
//using search option

	WebElement searchoption1=driver.findElement(By.name("search_query"));
	searchoption1.sendKeys("private party song");
	Thread.sleep(2000);
	//click search icon 
WebElement searchicon=	driver.findElement(By.xpath("//*[@id=\'search-icon-legacy\']/yt-icon"));
searchicon.click();
// click the song links
WebElement clicksong=driver.findElement(By.xpath("//*[@id='img']"));
clicksong.click();
// enter the comment
//WebElement comment=driver.findElement(By.xpath("//*[@id=\'title\']"));
	//comment.click();
	
	//click the particularsongs
	//WebElement paricularsongs=driver.findElement(By.name("img"));
	//paricularsongs.click();
	//Thread.sleep(1000);
	//click the history 
	//WebElement history=driver.findElement(By.partialLinkText("History"));
	//history.click();
	//s
	

	}

}
