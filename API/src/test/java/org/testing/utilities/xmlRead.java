package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class xmlRead
{
 /* public static String handleXml(String path)
  {
	  
  }*/
	
	public static void main(String[] args) throws IOException 
	{
	  File f=new File("../API/xmlData.xml");
	  FileReader fr=new FileReader(f);
	  BufferedReader b=new BufferedReader(fr);
	  String s;
	  while((s=b.readLine())!=null)
	  {
		  System.out.println(s);
	  }
	}
}
