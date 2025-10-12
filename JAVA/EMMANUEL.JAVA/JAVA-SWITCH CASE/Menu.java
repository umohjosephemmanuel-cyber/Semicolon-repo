import java.util.Scanner;
       public class Menu{

              public static void main(String [] args){

                     Scanner input = new Scanner(System.in);
                   
                     int n;

                     System.out.println("Menu:");
		     System.out.println("1. Pepsi");
	             System.out.println("2. 7up");
		     System.out.println("3.Coco cola");


                     System.out.println("Enter your choice (1-3): ");
                     n=input.nextInt();


                     switch (n){
                        case 1:
                            System.out.println("Pepsi");
                            break;

                        case 2:
			    System.out.println("7up");
                            break;

                        case 3:
		            System.out.println("Coca cola");
                            break;
                            
                        default:
                            System.out.println("Error");

                       }
                      }
                    }
