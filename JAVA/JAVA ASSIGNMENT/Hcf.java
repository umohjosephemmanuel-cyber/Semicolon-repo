import java.util.Scanner;
     public class Hcf {
            public static void main(String [] args) {
                   Scanner input = new Scanner(System.in);

                   System.out.print("Enter a number");
                   int number = input.nextInt();
                   
                   int total=0;
                   int division=2;

              while(number !=1) {
                 if(number%division==0){
                   total=total+division;
                   number=number/division;
                 } else {
                   division++;
                  } 
                   System.out.println(total);
                  }
                  }
                  }