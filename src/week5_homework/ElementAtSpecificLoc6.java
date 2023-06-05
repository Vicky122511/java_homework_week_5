package week5_homework;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ElementAtSpecificLoc6
{
    //int [] num = new int[5];
    ArrayList elements = new ArrayList<>();
    int no1,find;
    public void specificElement()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number for Array");
        no1 = sc.nextInt();

        for(int i=0;i<no1; i++)
        {
            System.out.println("Enter Array Value");
            elements.add(sc.next());
        }
        //System.out.println(num);


        System.out.println("Enter Index number which you find from Array List");
        find=sc.nextInt();

        System.out.println("Specified Element At Index is "+elements.get(find));
        sc.close();
    }

    public static void main(String[] args)
    {
        ElementAtSpecificLoc6 esp= new ElementAtSpecificLoc6();
        esp.specificElement();
    }

}
