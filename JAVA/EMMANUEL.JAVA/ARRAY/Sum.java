import java.util.Scanner;
       
       public class Sum {
              public static void main(String [] args) {

                     Scanner sc = new Scanner(System.in);

                     System.out.print("n: ");
                     int n = sc.nextInt(),sum = 0;
                     int[] arr = new int[n];
             
                     for(int i=0; i<n; i++) arr[i] = sc.nextInt();

                     for(int val : arr) sum += val;
                     System.out.println("Sum = " + sum);
                   }
                 }