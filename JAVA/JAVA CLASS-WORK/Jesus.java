import java.util.Scanner;
       public class MiniappAssistant {
              public static void main(String [] args) {
                    Scanner input = new Scanner(System.in);

                    System.out.print("Hello what is your name:");
                    String name = input.nextLine();
                    System.out.println("Hello"+name+"Welcome to your personal Miniapp Assistant");
                    System.out.println("How do you feel today (happy,Sad,excited,tired:)");

		     String mood = input.nextLine();
                  if(mood.equals("Happy")) {
                    System.out.println("Keep smailing");
                    
                    System.out.println("Suggestion:Go out and play a sport you like");
           } else if(mood.equals("Sad")) {
                    System.out.println("cheer up tomorrow is a new day");
                    System.out.println("Suggestion:take a short walk outside and grt asome fresh air");
           } else if(mood.equals("Excited")) { 
                    System.out.println("Awesome enter your energy");
                    System.out.println("Rest well and recharge");
                    System.out.println("Suggestion:Have a short nap or rest to recharge");
           } else {
                    System.out.println("Thanks for sharing hope you have a good day");}
                    System.out.print("How old are you");
                    int age = input.nextInt();

                  if(age<13) {
                    System.out.println("You are a younger explorer");
           } else if(age<=59) {
                    System.out.println("Wisdom looks good on you");
                   }
                    System.out.println("Do you want a suggestion for the day");
                    String wantSuggestion = input.nextLine();
                  if(wantSuggestion.equals("yes")) {
                    System.out.println("Stay positive always and keep exploring more");
                  }
                   System.out.print("Enter a number between 1 and 10");
                   int number = input.nextInt();
                  
                 if(number ==5) {
                   System.out.println("Wow you guessed it");
          } else {
                   System.out.println("Try again next time");
                 }
                 }
                }

 
                    
                    