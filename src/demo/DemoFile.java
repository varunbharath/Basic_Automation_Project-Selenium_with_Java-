package demo;

import java.io.File;
import java.sql.Driver;

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ccc=new File("C:\\Users\\kumar\\Downloads\\chromedriver_win32");
         File[]bbb=      ccc.listFiles();
         System.out.println(bbb);
         for (File ddd : bbb) {
        	 if (ddd.getName().equalsIgnoreCase("chromedriver.exe")) {
        		 System.out.println("ok");
        	 
        		 
        	 
        		break; 
        		 
				
			}
        	 {
				
			}
        	 {
        	
        	 }
		}
	}

}
