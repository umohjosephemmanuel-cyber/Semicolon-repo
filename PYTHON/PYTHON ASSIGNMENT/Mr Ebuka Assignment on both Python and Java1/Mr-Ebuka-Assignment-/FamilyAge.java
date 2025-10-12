// Step 1: Prompt the user to input father's current age.

// Step 2: Prompt the user to enter son's current age.

// Step 3: Calculate the difference between father's age when it is as twice as the son's age.

// Step 4: Assume the difference equals [0], Display "father is twice as old now".

// Step 5: Assume the difference is greater than [0], Display "father was twice as old",difference, "years ago".

// Step 6: If not, Display "father will be twice as old", difference, "years in future".





import java.util.Scanner;
     public class FamilyAge {
           public static void main(String [] args) {
                  Scanner input = new Scanner(System.in);


                  System.out.print("Enter father's current age:");
                  int fatherAge = input.nextInt();

                  System.out.print("Enter son's current age:");
                  int sonAge = input.nextInt();

                  int difference = fatherAge - 2 * sonAge;

               if(difference == 0) {
                  System.out.println("Father is exactly twice as old now");

               } else if(difference > 0) {
                    System.out.println("Father was twice as old:" + difference  + "years ago");

               } else {
                    System.out.println("Father will be twice as old" + Math.abs(difference) + " years in the future");
               }
            }
         }