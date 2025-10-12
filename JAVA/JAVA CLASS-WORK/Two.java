// Step 1: Prompt the user to enter a number between 12:00-5:00.

// Step 2: if the number entered is 12:00, display "TAKE A LUNCH".

// Step 3: IF the number entered is 1:00, display "LUNCH OVER".

// Step 4: If the number entered is 2:00, display "TAKE A REST".

// Step 5: If the number entered is 3:00, display "GET BACK TO WORK".

// Step 6: if the number entered is 4:00, display "TAKE A BREAK".

// Step 7: If the number enrered is 5:00, display "GOOD BYE".






import java.util.Scanner;
       public class Two {
              public static void main(String [] args) {
                     Scanner input = new Scanner(System.in);
                     
                     System.out.print("Enter a number between 12:00-5:00");
                     String number = input.nextLine();

                   if(number.equals("12:00")) {
                     System.out.println("Take a lunch");
                     }
                   if(number.equals("1:00")) {
                     System.out.println("Lunch over");
                     }
                   if(number.equals("2:00")) {
                     System.out.println("Take a rest");
                     }
                   if(number.equals("3:00")) {
                     System.out.println("Get back to work");
                     }
                   if(number.equals("4:00")) {
                     System.out.println("Take a break");
                     }
                   if(number.equals("5:00")) {
                     System.out.println("Good bye");
                  }
                  }
                  }