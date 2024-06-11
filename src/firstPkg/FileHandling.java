package firstPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling
{
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./Data/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("URL"));
		System.out.println(prop.get("Browser"));
		
		
		
		
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./Data/xyz.txt");
		
		FileWriter fw  = new FileWriter(f, true);
		
		fw.write("\nthis is forth line in the file");
		fw.flush();
		fw.close();
		
		System.out.println("this is Java \nthis is Selenium");
		//System.out.println("this is Selenium");
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\test.txt");  //file connection
		
		//File f = new File("./Data/abc.txt");	
		
		FileReader fr = new FileReader("./Data/abc.txt");	
		
		int r = fr.read();  //84
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read(); //104
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) throws Exception
	{
		FileHandling.readprop();
	}

}
