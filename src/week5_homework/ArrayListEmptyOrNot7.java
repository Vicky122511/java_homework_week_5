package week5_homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class ArrayListEmptyOrNot7
{
    ArrayList elements = new ArrayList<>();
    int no1,find;
    public void isEmpty()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number for Array");
        no1 = sc.nextInt();

        for(int i=1;i<=no1; i++)
        {
            System.out.println("Enter Array Value");
            elements.add(sc.next());
        }

        if(elements.size()== 0)
        {
            System.out.println("Array List is Empty");
        }
        else
        {
            System.out.println("Array List Size is "+ elements.size());
        }
        //System.out.println(num);


        sc.close();
    }

    public static void main(String[] args)
    {
        ArrayListEmptyOrNot7 empty = new ArrayListEmptyOrNot7();
        empty.isEmpty();
    }
}
