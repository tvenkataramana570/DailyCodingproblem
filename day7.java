/*
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

*/

import java.util.*;
class Main {
    static int countDecoding(char[] digits, int n)
    {
        if (n == 0 || n == 1)
            return 1;
            
        if (digits[0] == '0')
            return 0;
            
        int count = 0;
        
        if (digits[n - 1] > '0')
            count = countDecoding(digits, n - 1);
 
        if (digits[n - 2] == '1'
            || (digits[n - 2] == '2'
                && digits[n - 1] < '7'))
            count += countDecoding(digits, n - 2);
 
        return count;
    }
    static int countWays(char[] digits, int n)
    {
        if (n == 0 || (n == 1 && digits[0] == '0'))
            return 0;
        return countDecoding(digits, n);
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char digits[] = s.toCharArray();
        int n = digits.length;
        System.out.printf("Count is %d",
                          countWays(digits, n));
    }
}
