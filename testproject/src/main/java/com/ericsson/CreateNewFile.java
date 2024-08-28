package com.ericsson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CreateNewFile {
	public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
        readStringFromFileLineByLine();
        //usingBufferedWritter();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("e://temp//testFile1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Maven home: E:\'apache-maven-3.5.3 \n");
          writer.write("Java version:  1.8.0\n");
          writer.write("Java home: C:\'Program Files (x86)\'Java\'jdk1.8.0_92\n");
          writer.close();
    }
    

    
    public static void readStringFromFileLineByLine() throws IOException
    {
    	File file = new File("e://temp//testFile1.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line+" text");	
			stringBuffer.append("\n");
		}
		fileReader.close();
		//System.out.println("Contents of file:");
		//System.out.println(stringBuffer.toString());
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("e:/temp/testFile2.txt", true)  //Set true for append mode
            ); 
		writer.newLine();   //Add new line
		writer.write(stringBuffer.toString());
		writer.close();
    }
    
    public static void usingBufferedWritter() throws IOException
    {
        /*String textToAppend = "Happy Learning !!";
         
        BufferedWriter writer = new BufferedWriter(
                                    new FileWriter("e:/temp/testFile1.txt", true)  //Set true for append mode
                                ); 
        writer.newLine();   //Add new line
        writer.write(textToAppend);
        writer.close();*/
    }

}
