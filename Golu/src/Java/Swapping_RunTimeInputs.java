package Java;

import java.util.Scanner;

public class Swapping_RunTimeInputs {
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int num1 = sc.nextInt();
System.out.println("The first number is: "+num1);

System.out.println("Enter second number: ");
int num2 = sc.nextInt();
System.out.println("The second number is: "+num2);

System.out.println("Before swapping..");
System.out.println("First number is: "+num1);
System.out.println("Second number is: "+num2);

num1=num1-num2;
num2=num1+num2;
num1=num2-num1;

System.out.println();
System.out.println("After swapping..");
System.out.println("First number is: "+num1);
System.out.println("Second number is: "+num2);
}
}
