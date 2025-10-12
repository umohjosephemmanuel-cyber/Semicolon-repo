import java.util.Scanner;
   public class Interest {
      public static void main(String [] args) {
         
        Scanner input = new Scanner(System.in);
        
        double p = 1000;
        double r = 0.07;

        int [] years = {10,20,30};

     for(int n : years) {
        
        double amount = p * math.pow(1.0 + r, n);
        System.out.printf("%d years: $%2f%n",n,amount);
       }
      }
     }
        