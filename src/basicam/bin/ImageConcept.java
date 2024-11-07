package basicam.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.get("http:\\www.leafground.com/pages/Image.html");
		WebElement zzz=Vam.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		if(zzz.getAttribute("naturalHeight").equals("0")) {
			System.out.println("ok");
		}
		else
		{
			System.out.println("notok ");
		}
	}

}
