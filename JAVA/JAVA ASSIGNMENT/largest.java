ASSIGNMENT NUMBER 1
PSEUDOCODE
1 prompt the user to enter the first number
2 prompt the user to enter the second number
3 prompt the user to enter the third number
4 Assume number two to be greater than largest number, if so then make the the largest to be number two
5 Assume number 3 to be greater than largest number, if so then make the largest to be number 3
6 Display the largest number

import java.util.Scanner;
      public class Largest {
            public static void main(String [] args){
                  Scanner input = new Scanner(System.in);
                  System.out.print("Enter first number");
                  int number1 = input.nextInt();
                  System.out.print("Enter second number");
                  int number2 = input.nextInt();
                  System.out.print("Enter third number");
                  int number3 = input.nextInt();

                if(number1 >= number2 && number1 >= number3) {
                  largest number = number1;
                } else if (number2 >= number1 && number2 >= number3) {
                  largest number = number2;
                } else { 
                  largest number = number3;
                }
                  System.out.println("The largest number is" + largest);
                }
                }