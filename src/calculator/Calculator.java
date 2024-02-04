package calculator;

import java.util.Scanner;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1,num2;
      // for taking input from user we have to create
      // scanner object
      Scanner in = new Scanner(System.in);
      System.out.println("Enter 1st number : ");
      num1 = in.nextInt();
      
      System.out.println("Enter 2nd number: ");
      num2 = in.nextInt();
      
   // Calculate and print the sum of the two numbers
      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

      // Calculate and print the difference of the two numbers
      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

      // Calculate and print the product of the two numbers
      System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

      // Calculate and print the division of the two numbers
      System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

      // Calculate and print the remainder of the division of the two numbers
      System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
}
}
