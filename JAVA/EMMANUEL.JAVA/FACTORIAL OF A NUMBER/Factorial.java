import java.util.Scanner;
       
       public class Factorial {
              public static void main(String [] args) {

                     Scanner sc = new Scanner(System.in);

                     System.out.print("Enter a number: ");
                     int n = sc.nextInt();

                     long fact = 1;
             
                     for(int i = 2; i<=n; i++) {
                        fact*=1;
                     }
                     System.out.println("Factorial: " + fact);
                   }
                 }