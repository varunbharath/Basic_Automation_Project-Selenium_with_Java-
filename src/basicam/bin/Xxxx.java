package basicam.bin;

import java.io.File;

public class Xxxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File downloads2=new File("C:\\Users\\kumar\\Downloads\\geckodriver-v0.31.0-win64");
		//SThread.sleep(1000);
		File[] aaa=downloads2.listFiles();
		for (File VAM : aaa) {
			
			
			if(VAM.getName().equals("eckodriver.exe")){
				System.out.println(VAM);
			break;
	}
		}
	}}
