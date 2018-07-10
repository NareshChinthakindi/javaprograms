/**
 * 
 */
package com.core.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class FileReading {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("D:\\olddata\\Naresh\\Personal\\NewHome\\Home.pdf");
		  //init array with file length
		  byte[] bytesArray = new byte[(int) file.length()]; 

		  FileInputStream fis = new FileInputStream(file);
		  fis.read(bytesArray); //read file into bytes[]
		  fis.close();
		  
		  System.out.println(bytesArray);
		  
		  System.out.println(file.length());
		  
		  File fileDest = new File("D:\\olddata\\Naresh\\Personal\\NewHome\\Home1.pdf");
		  Path path = Paths.get(fileDest.toURI());
		  Files.write(path, bytesArray);
					
	}

}
