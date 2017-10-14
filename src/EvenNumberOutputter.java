/**
 * Daniel Plotzke
 * 10/14/17,
 * 10:41 AM
 * How I tested it:
 */

import java.util.Scanner;

public class EvenNumberOutputter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double input = -10;
        double min = (input - 1);
        double max = (input + 1);
        if (input > 0)
        {
            for (input = input; input > min && input < max; )
            {
                double count = (input / 2);

                if (count >= 0)
                {
                    System.out.println(input);
                    input = input - 2;


                    min = min - 2;
                    max = max - 2;
                }
                else
                {
                    break;
                }
            }
        }
//                else
//                {
//                    break;
//                }
        else if (input < 0)
        {
            for (input = input; input > min && input < max; )
            {
                double count = (input /2);

                if (count <= 0)
                {
                    System.out.println(input);
                    input = input + 2;

                    min = min + 2;
                    max = max + 2;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
