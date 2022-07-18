package arithmeticcal;
import java.util.Scanner;
public class ArithmeticCalci {
 public static void main(String[] args) {
  double n1;
  double n2;
  double output;
  char operator;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a number:");
  n1=sc.nextInt();
  System.out.println("Enter another number:");
  n2=sc.nextInt();
  System.out.println("Enter the operators (+,-,*,/)");
  operator = sc.next().charAt(0);
  switch(operator) {
  case '+':
   output= n1+n2;
   System.out.println(n1 + "+"+n2 + "= " +output );
   break;
        case '-':
   output= n1-n2;
   System.out.println(n1 + "-"+n2 + "= " +output );
   break;
  case '*':
   output= n1*n2;
   System.out.println(n1 + "*"+n2 + "= " +output );
   break;
  case '/':
   output= n1/n2;
   System.out.println(n1 + "/"+n2 + "= " +output );
   break;
   default :
    System.out.println("Invalid operator");
  }
 }

}