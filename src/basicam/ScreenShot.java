package basicam;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Vam=new ChromeDriver();
		Vam.get("http:\\www.leafground.com/pages/Link.html");
		// webdriver Screen shot(Selenium)
		TakesScreenshot hh=(TakesScreenshot) Vam;
		File From=hh.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File to=new File("C:\\Automation location\\ppp.png");
		FileHandler.copy(From, to);
		//whole Screen Window (Java)
		/*Robot Fr= new Robot();
	Dimension gge=	Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle kk= new Rectangle(gge);
	BufferedImage wer=Fr.createScreenCapture(kk);
	File poi=new File("C:\\Automation location\\nnn.png");
	ImageIO.write(wer, "png", poi);*/
	}
}
