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
        double input = 10;
        double min = Math.abs(input - 1);
        double max = Math.abs(input + 1);
        for (input = input; input > min && input < max; )
        {
            double count = Math.abs(input / 2);
            if (input > 0)
            {
                if (count >= 0)
                {
                    System.out.println(input);
                    input = input - 2;


                    min = min - 2;
                    max = max - 2;
                }
//                else
//                {
//                    break;
//                }
            }
            else if (input < 0)
            {
                if (count <= 0)
                {
                    System.out.println(input);
                    input = input + 2;

                    min = min + 2;
                    max = max + 2;
                }
            }
            else
            {
                System.out.println(0.0);
                break;
            }
        }
    }
}
