package calculate;

public class Calculator
{
    public void addition (int a, int b){
        int result = a+b;
        System.out.println(result);
    }

    public void subtraction (int a, int b){
        int result = a-b;
        System.out.println(result);
    }

    public void division (int a, int b){
        int result = a/b;
        System.out.println(result);
    }
    public void multiplication (int a, int b){
        int result = a*b;
        System.out.println(result);
    }

    public void calculateResult (int a, int b, char symbol ) {


        if (symbol == '+')
        {
            System.out.println("Addition of " +  a  + " and " + b +" :" + (a + b));
        } else if (symbol == '-') {
            System.out.println("Subtraction of " +  a  + " and " + b +" :" + (a - b));
        } else if (symbol == '/') {
            System.out.println("Division of " + a + " and " + b + " :" + (a / b));
        } else if (symbol == '*') {
            System.out.println("Multiplication of " + a + " and " + b + " :" + (a * b));
        } else
        {
            System.out.println("Invalid Symbol");
        }
    }


}

