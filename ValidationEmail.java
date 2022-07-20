package emailvalidation;
import java.util.ArrayList;
import java.util.Scanner;
public class ValidationEmail {
 public static void main(String[] args) {
  Scanner a = new Scanner(System.in);
  ArrayList<String> gmail = new ArrayList<String>();
  gmail.add("gokul123@gmail.com");
  gmail.add("sriramelaki785@gmail.com");
  gmail.add("thalaajith99@gmail.com");
  gmail.add("doctormaran55@gmail.com");
  gmail.add("dirdinesh753@gmail.com");
  System.out.println("enter user email id:");
  String userId = a.nextLine();
   if (gmail.contains(userId)) {
    System.out.println();
    System.out.println("EMAIL ID " + userId + " found");
   } 
   else {
    System.out.println("EMAIL ID " + userId + " Not found");

   }
  }
 }