import java.util.Scanner;
       public class Multiple {
              public static void main(String [] args){
                     Scanner input = new Scanner(System.in);
                     
                     System.out.print("Enter a number");
                     int number = input.nextInt();
             
                     int count = 0;
                     int multiple = 0;
                     int result = 0;
   
                   while(count < 12){
		     result = number * count;
                     count++;
                   System.out.printf(" %d * %d = %d %n", number,count,result);
                   }

                   }
                   }    

                    
                        
                                   