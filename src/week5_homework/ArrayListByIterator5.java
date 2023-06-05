package week5_homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class ArrayListByIterator5
{
        public void display()
        {
            ArrayList dis= new ArrayList<>();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int no= sc.nextInt();

            for(int i=0;i<no;i++)
            {
                System.out.println("Enter Array List Elements");
                dis.add(sc.next());
            }

            Iterator it= dis.iterator();

            System.out.println("Display Using Iterator");
            while(it.hasNext())
            {
                System.out.println(it.next());
            }

        }

    public static void main(String[] args)
    {
        ArrayListByIterator5 ai = new ArrayListByIterator5();
        ai.display();
    }
}
