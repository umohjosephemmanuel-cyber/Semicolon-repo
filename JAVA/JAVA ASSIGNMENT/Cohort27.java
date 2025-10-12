import java.util.Scanner;
  public class Cohort27 {
    public static void main (String[]args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter user name");
            String name = input.nextLine();

            System.out.println("Enter user gmail");
            String gmail = input.nextLine();

            System.out.println("Enter user age");
            int age = input.nextInt(); 

            System.out.println("Enter user amount");
            double amount = input.nextDouble();
            
            
            System.out.println("The name is" + name);
            System.out.println("The gmail is" + gmail);
            System.out.println("The age is" + age);
            System.out.println("The amount is" + amount);
            

            }
           }