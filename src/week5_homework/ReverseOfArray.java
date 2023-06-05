package week5_homework;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOfArray
{
    //int [] num = new int[5];
    ArrayList<Integer> num = new ArrayList<>();
    int no1;
    public void reverse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number for Array");
        no1 = sc.nextInt();

        for(int i=0;i<no1; i++)
        {
            System.out.println("Enter Array Value");
            num.add(sc.nextInt());
        }
        //System.out.println(num);
        sc.close();
        int last= num.size();

        for(int j=last-1;j>=0;j--)
        {
            System.out.println(num.get(j));
        }
    }

    public static void main(String[] args)
    {
        ReverseOfArray r1 =new ReverseOfArray();
        r1.reverse();
    }

}
