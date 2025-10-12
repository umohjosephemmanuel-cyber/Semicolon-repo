import java.util.Scanner;
  public class Scores {
    public static void main (String []args) {     
   Scanner input = new Scanner(System.in);
      
       System.out.println("Enter first student name: ");
       int Studentname  = input.nextInt();

       System.out.println("Enter student score: ");
       int Studentscore = input.nextInt();

       if(Studentscore <= Studentname){
       Studentname = Studentscore;

	}

	if(Studentname <= Studentscore){
	Studentscore = Studentname;

       }
           
       System.out.print("The studentname is: " + Studentscore);
       
       }
      } 
       
       
       


       
       
         





           
           
           