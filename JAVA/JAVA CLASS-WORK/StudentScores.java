    import java.util.Scanner;
      public class StudentScores {
        public static void main (String []args) {     
       Scanner scores = new Scanner(System.in);
      
       System.out.println("Enter first user name");
       String text  = scores.next();

       System.out.println("Enter first user score");
       int firstUserScore  = scores.nextInt();

       System.out.println("Enter second user name");
       String secondText = scores.next();

       System.out.println("Enter second user score");
       int secondUserScore = scores.nextInt();

       System.out.println("Enter third user name");
       String thirdText = scores.next();

       System.out.println("Enter third user score");
       int thirdUserScore = scores.nextInt();
  
       int highestScore = firstUserScore;
       String highestUser = text;

       if(highestScore < secondUserScore){
       highestScore = secondUserScore;
       highestUser = secondText;

      }

       if(highestScore<thirdUserScore){
       highestScore=thirdUserScore;
       highestUser=thirdText;

      }
           
      System.out.print("The highest score  is" + highestScore);
      System.out.print("The highest score is" + highestUser);
       
     }

   } 
       
       
       


       
       
         





           
           
           