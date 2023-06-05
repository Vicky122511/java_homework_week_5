package week5_homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Colour4
{
    ArrayList<String> color = new ArrayList<String>();
    int no1;
    public void displayColours()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number times for add Colours");
        no1 = sc.nextInt();

        for(int i=0;i<no1; i++)
        {
            System.out.println("Enter Colour Name");
            color.add(sc.next());
        }
        sc.close();

        for(int j=0;j<color.size();j++)
        {
            System.out.println(color.get(j));
        }
    }

    public static void main(String[] args)
    {
        Colour4 c1 = new Colour4();
        c1.displayColours();
    }

}
