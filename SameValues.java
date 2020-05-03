

import java.util.Scanner;

class SameValues {
	
    public static void main(String[] args) {
    	int num1;
        double num2;
    	Scanner input = new Scanner(System.in);

        
        
        System.out.print("Enter an Integer number: ");
        num1 = input.nextInt();

        System.out.print("Enter a double number: ");
        num2 = input.nextDouble();
               
      

        System.out.println("divided by 5: " + ((double)num1/5));

        System.out.println("divided by 5: " + (num2/5));

    }
}