package week5_homework;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class HashsetFindFrom1to10Num8
{
    HashSet<Integer> num = new HashSet<>();
    int noAdd;

    public void findFrom1To10()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Number for Add Integer Values in Array");
        noAdd=sc.nextInt();

        for(int i=0;i<noAdd;i++)
        {
            System.out.println("Enter Integer Value");
            num.add(sc.nextInt());
        }

        for ( Integer j :num)
        {
            if(j>=0 && j<=10)
            {
                System.out.println(j);
            }
            else
            {
                System.out.println("Not in Array  "+ j);
            }
        }

    }

    public static void main(String[] args)
    {
        HashsetFindFrom1to10Num8 hs = new HashsetFindFrom1to10Num8();
        hs.findFrom1To10();
    }
}
