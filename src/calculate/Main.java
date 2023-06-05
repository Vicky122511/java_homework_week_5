package calculate;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        char choice;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.print( " Enter first Number:   ");
            int num1 = scanner.nextInt();
            System.out.print( " Enter second Number:   ");
            int num2 = scanner.nextInt();
            System.out.print(" Please enter one of symbol +,-,*, /:   ");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(num1,num2,symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' && choice == 'y');
        scanner.close();
        System.out.println(" Program Terminated");
    }
}

