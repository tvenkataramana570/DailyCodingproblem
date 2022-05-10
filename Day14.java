/*
The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is x2 + y2 = r2.
*/

import java.util.*;
public class Day14
{
	public static void main(String[] args) {
		int i;
        int nThrows = 0;
        int nSuccess = 0;

        double x, y;

        for (i = 0; i < 1000000 ; i++)
        {
            x = Math.random();
            y = Math.random();

            nThrows++;

            if ( x*x + y*y <= 1 )
                nSuccess++;
        }

        System.out.println("Pi/4 = " + (double)nSuccess/(double)nThrows );
        System.out.println("Pi = " + 4*(double)nSuccess/(double)nThrows );
	}
}
