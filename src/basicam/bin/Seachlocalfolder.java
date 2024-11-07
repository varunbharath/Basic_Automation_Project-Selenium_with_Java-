package basicam.bin;

import java.io.File;

public class Seachlocalfolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File xxx=new File("C:\\Users\\kumar\\Downloads\\geckodriver-v0.31.0-win64");
File[] aaa22=xxx.listFiles();
for (File ccc : aaa22) {
	if(ccc.getName().equals("geckodriver.exe")) {
		System.out.println("ok");
		break;
	}
	else{
		System.out.println("sss");
		
	}
	}
		
}
	}


