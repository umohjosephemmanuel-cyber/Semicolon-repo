// Step 1: Prompt the user to enter the first number.

// Step 2: Prompt the user to enter the OPERATOR "(+,-,*,/)".

// Step 3: Prompt the user to enter the second number.

// Step 4: Use if statement to check which operator the user entered.

// Step 5: Perform a calculation based on the operator.

// Step 6: Printout the result found.

// Step 7: Handle division by 0.

// STEP 8: If operator is invalid, display "Error".









import java.util.Scanner;
       public class Operator {
              public static void main(String [] args) {
                     Scanner input = new Scanner(System.in);
                    
                     System.out.print("Enter first number");
                     double firstnumber = input.nextDouble();

                     System.out.print("Enter Operation:(+,-,*,/)");
                     String operation = input.next();

                     System.out.print("Enter second number");
                     double secondnumber = input.nextDouble();

                  if(operation =="+") {
double addition = firstnumber + secondnumber;
                   System.out.println(addition);
                  }
             
             
                  }
                  }