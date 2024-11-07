package basicam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		java.click();
		
		WebElement selectselenium=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
boolean saveboolean=selectselenium.isSelected();
System.out.println("hffheufgeu"+saveboolean);

WebElement iamunselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
//if(iamunselect.isSelected()) {
		//iamunselect.click();
		
//}
		//iamunselect.isSelected();
			iamunselect.click();
WebElement iamselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
//if(iamunselect.isSelected()) {
	//iamselect.click();
//}
//iamselect.isSelected();
	iamselect.click();
	}

}
