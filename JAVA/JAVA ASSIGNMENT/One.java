// Step 1: Prompt the user to enter a number.

// Step 2: If the number is an odd number,Print  it's odd number.

// Step 3: if the number is an even even number, Print it's even number.





import java.util.Scanner;
       public class One {
              public static void main(String [] args) {
                     Scanner input = new Scanner(System.in);

                     System.out.print("Enter a number:");
                     int number = input.nextInt();

                   if(number%2 ==0) {
                     System.out.println("Even number");
            } else if(number%2==1) {
                     System.out.println("Odd number");
            }
            }
            }