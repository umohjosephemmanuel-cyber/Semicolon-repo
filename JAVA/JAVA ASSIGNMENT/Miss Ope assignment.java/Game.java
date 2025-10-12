import java.util.Scanner;
       public class Game {
              public static void main (String [] args) {
                     System.out.print(System.in);
 
                     System.out.print("Enter 0 for scissor, 1 for rock, or 2 for paper:");
                     int userChoice = input.nextInt();
     
                     Stringchoice = ("scissor" && "rock" && "paper");

                     System.out.println("The computer is" + choices(computerchoice) + " ");
                     System.out.println("You are" + choices(userChoice) + " ");
       
                     if(userchoice == computerChoice) {
                     System.out.println("It's a draw");

                } else if(userchoice == 0 && computerchoice == 2) {
                     System.out.println("Scissor cuts paper");
               
                } else if(userchoice == 1 && computerchoice == 0) {
                     System.out.println("Rock knocks Scissor");

                } else if(userchoice == 2 && computerchoice == 1) {
                     System.out.println("Paper wraps Rock"); 

                     System.out.println("You win");
               } else {
                     System.out.printl("You lose");
               }
            }
          }



        