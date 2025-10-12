// Step 1: Prompt the user to enter first score.

// Step 2: Prompt the user to enter second score.

// Step 3: Prompt the user to enter third score.

// Step 4: Calculate the average of the three scores.

// Step 5: Determine each letter grade and print out the result as follows.






import java.util.Scanner;
  public class Grade {
    public static void main(String [] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first score:");
      int score1 = input.nextInt();

      System.out.print("Enter second score:");
      int score2 = input.nextInt();

      System.out.print("Enter third score:");
      int score3 = input.nextInt();

      
      double average = (score1 + score2 + score3) / 3.0;


      char grade;
      if(average >= 90 && average <= 100) {
      grade = 'A';

      } else if(average >= 80) {
      grade = 'B';
       
      } else if(average >= 70) {
      grade = 'C';

      } else if(average >= 60) {
      grade = 'D';

      } else {
      grade = 'F';
      }
      
      System.out.println("Average Score:" + average); 
      System.out.println("Letter grade:" + grade);
    }
  }