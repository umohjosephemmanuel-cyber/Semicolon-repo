import java.util.Scanner;
       public class CalculatorTwo{

              public static void main(String [] args){

                     Scanner input = new Scanner(System.in);
                    
                     int num1,num2,option;
                     option = 0;

                     while(option!=5){

			  System.out.println("1. Addiction \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");

                          System.out.print("Enter your option: ");

                          option = input.nextInt();
                          System.out.print("Enter 1st number: ");
                          num1 = input.nextInt();

                          System.out.print("Enter 2nd number: ");
                          num2 = input.nextInt();


                          switch(option) {
                          
                          case 1: System.out.println("Addition: "+(num1+num2));
                          break;

                  
                          case 2: System.out.println("Subtraction: "+(num1-num2));
                          break;
          
                          case 3: System.out.println("Multiplication: "+(num1*num2));
                          break;

                          case 4: System.out.println("Division: "+(num1/num2));
                          break;

                          case 5: System.exit(0);
                          break;
                          
                          default: System.out.println("Invalid input");

                  }
                }
              }
            } 