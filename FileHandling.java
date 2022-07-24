package filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

	 public void read()
	 {
	  try {
	         File Obj1 = new File("myfile.txt");
	         Scanner Read = new Scanner(Obj1);
	         while (Read.hasNextLine()) {
	             String data1 = Read.nextLine();
	             System.out.println(data1);
	         }
	         Read.close();
	     }
	     catch (FileNotFoundException e) {
	         System.out.println("An error has occurred unexpectedly.");
	         e.printStackTrace();
	     }
	 }
	 
	 public void write()
	 {
	  try {
	   String sys;
	   System.out.println("Enter text to write in the file");
	   Scanner sc1 = new Scanner(System.in);
	   sys = sc1.nextLine();
	         FileWriter Writer = new FileWriter("myfile.txt");
	         Writer.write(sys);
	         Writer.close();
	         System.out.println("Successfully written in the file.");
	     }
	     catch (IOException e) {
	         System.out.println("An error has occurred unexpectedly.");
	         e.printStackTrace();
	     }
	 }
	 
	 public void append()
	 {
	  try {
	  BufferedWriter out = new BufferedWriter(new FileWriter("myfile.txt", true));
	  Scanner sc1 = new Scanner(System.in);
	  System.out.println("Enter text to append in the file");
	  String str1 = sc1.nextLine();
	        out.write(str1);
	        out.close();
	        System.out.println("Added successfully in the file");
	  }
	  catch(IOException e) {
	         System.out.println("An error has occurred unexpectedly.");
	         e.printStackTrace();
	  }
	 }
	 
	 public static void main(String[] args) throws IOException {

	  FileHandling fl1 = new FileHandling();
	  File Obj1 = new File("myfile.txt");
	        if (Obj1.createNewFile()) {
	            System.out.println("File created: "
	                               + Obj1.getName());
	        }
	        else {
	            System.out.println("File already exists in the path.");
	        }
	          
	        System.out.println("Choose the options: 1-read, 2-write, 3-append" );
	        Scanner sc1 = new Scanner(System.in);
	        int number = sc1.nextInt();
	        
	        switch(number)
	        {
	        case 1:
	         fl1.read();
	         break;
	         
	        case 2:
	         fl1.write();
	         break;
	         
	        case 3:
	         fl1.append();
	         break;
	         
	        default:
	         System.out.println("Invalid option..Check again!");
	        }
	 }
}

