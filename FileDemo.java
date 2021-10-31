package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo {

	public static void main(String[] args) throws IOException {
      
		File f=new File("C:\\Data\\music.java");

		
		if(f.exists())
				{
			
		f.createNewFile();
		System.out.println("File succefully created...");
		}
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		
		PrintWriter pw=new PrintWriter(f);
		String s=new String();
		pw.write(s);
		
	}

}
