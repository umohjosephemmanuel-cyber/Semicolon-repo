// Step 1: Prompt the user to enter an Integer.

// Step 2: Display the two messages.

// Step 3: Use the If statmement to check if the given number is a multiple of 6 or a multiple of 7.

// Step 4: Use the If statement to check if the given number is neither a multiple of 6 nor a multiple of 7.











import java.util.Scanner;
       public class Multiples {
              public static void main(String [] args) {
                     Scanner input = new Scanner(System.in);
                            
                     System.out.print("Enter a number");
                     int number = input.nextint();

                     boolean is the multiple of 6 = (number % 6 == 0);
                     boolean is the multiple of 7 = (number % 7 == 0);

                  if(The multiple of 6 // is the multiple of 7) {
                     System.out.println(number + "is a multiple of 6 or 7");
            } else {

                    System.out.println(number + "is neither a multiple of 6 nor 7");
            }
            }
            }
