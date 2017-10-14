/**
 * Daniel Plotzke
 * 10/14/17,
 * 10:41 AM
 * How I tested it: Used breakpoint for step-by-step debugging, and then testing whole program using all possible
 * types.
 * Note: Works with any number! (Not just positive integers!)
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenNumberOutputter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number here!: ");
        double input = in.nextDouble();
        double remainderCheck = input % 2;
        DecimalFormat df = new DecimalFormat("#");
        if (remainderCheck > 0)
        {
            if (input > 0)
            {
                System.out.println(df.format(input));
                input = input - 1;
            }
            else
            {
                System.out.println(df.format(input));
                input = input + 1;
            }
        }
        double min = (input - 1);
        double max = (input + 1);
        for (; input > min && input < max; )
        {
            double count = (input / 2);
            if (count >= 0 && input > 0)
            {
                if (input != 1)
                {
                    {
                        System.out.println(df.format(input));
                        input = input - 2;


                        min = min - 2;
                        max = max - 2;
                    }
                }
                else
                {
                    break;
                }
            }
            else if (count <= 0 && input < 0)
            {
                if (input != -1)
                {
                    System.out.println(df.format(input));
                    input = input + 2;

                    min = min + 2;
                    max = max + 2;
                }
                else
                {
                    break;
                }
            }
            else
            {
                System.out.println(0);
                break;
            }
        }
//        else if (input < 0)
//        {
//            for (input = input; input > min && input < max; )
//            {
//                double count = (input /2);
//
//                if (count <= 0)
//                {
//                    System.out.println(input);
//                    input = input + 2;
//
//                    min = min + 2;
//                    max = max + 2;
//                }
//                else
//                {
//                    break;
//                }
//            }
//        }
    }
}
