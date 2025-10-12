import java.util.Scanner;
  public class Scores{
    public static void main(String [] args) {   
   Scanner scores = new Scanner (System.in);

   System.out.println("enter first user name");
   String text=scores.nextLine();

   System.out.println("enter first user score");
   int firstUserScore=scores.nextInt();


   System.out.println("enter second user name");
   String secondText=scores.next();

   System.out.println("enter second user score");
   int secondUserScore=scores.nextInt();


   System.out.println("enter third user name");
   String thirdText=scores.next();

   System.out.println("enter third user score");
   int thirdUserScore=scores.nextInt();
   
   String highestUser=text;
   int highestScore=firstUserScore;

   if(highestScore<secondUserScore){
   highestScore=secondUserScore;
   highestUser=secondText;
}
   if (highestScore<thirdUserScore){      
   highestScore=thirdUserScore;
   highestUser=thirdText;
   


 }
   System.out.print("the highest score is "+highestScore);
   System.out.print("the highest score is "+ highestUser);












}
}