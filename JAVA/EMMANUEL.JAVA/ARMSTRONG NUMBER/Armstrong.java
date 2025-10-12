import java.util.Scanner;
       
       public class Armstrong {
              public static void main(String [] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter a number: ");
              int n = sc.nextInt(),temp = n, sum = 0, digits =

              String.valueOf(n).length();

              while(temp > 0) {
            
              int rem = temp % 10;
    
              sum +=Math.pow(rem,digits);
              temp /= 10;
              }
              System.out.println(n + (sum == n?" is": " is not")+" an Armstrong number");
             }
           }