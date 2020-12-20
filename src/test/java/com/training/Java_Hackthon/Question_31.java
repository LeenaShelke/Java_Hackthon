/*Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)*/
package com.training.Java_Hackthon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Question_31 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String filepath = System.getProperty("user.dir")+"/Leena.txt";
		  //	System.out.println(filepath);
		ArrayList<String> str1 = new ArrayList<String>(); 
		   //	String filepath="C:\\Users\\sagar\\eclipse-workspace\\Filedemo\\Leena.txt";
			str1=readFile(filepath);
			String wfilepath= System.getProperty("user.dir")+"/FiletoWrite.txt";
		//	String wfilepath ="C:\\Users\\sagar\\eclipse-workspace\\Filedemo\\FiletoWrite.txt";
		//	System.out.println(wfilepath);
	    	writeFile(wfilepath,str1);
		//	loadingPropertiesFile();
		}
			public static ArrayList<String> readFile(String sPath) throws IOException
			{
				String sLine;
				FileReader oFR = new FileReader(sPath);
				BufferedReader oBR = new BufferedReader(oFR);
				ArrayList<String> str = new ArrayList<String>(); 
				while((sLine = oBR.readLine()) != null)
				{   
			       
			        	str.add(sLine); 
			      
				}
				return str;
			}
			public static void writeFile(String sPath,ArrayList<String> str) throws IOException {
				//1. First you will go to location 2. you will open it 3. write it
				BufferedWriter oBW = null;
				try {
				FileWriter oFW = new FileWriter(sPath,false);
			    oBW =  new BufferedWriter(oFW);
			    for(int i=str.size()-1; i>=0;i--)
			    {
			    	oBW.write(str.get(i));
			    	oBW.newLine();
			    }
			    	
				
				}catch(Exception a) {
					System.out.println("Exception  : "+a);
					
				}finally
				{
					oBW.close();
				}
					
				}
	}


