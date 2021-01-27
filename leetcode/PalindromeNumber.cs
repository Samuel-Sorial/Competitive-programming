using System;

namespace LeetCode
{
    // Solution to https://leetcode.com/problems/palindrome-number
    public class PalindromeNumber
    {
        public bool IsPalindrome(int x)
        {
            if (x == 1)
            {
                return true;
            }
            int cursorInteger = x;
            int[] digits = new int[31];
            int i = 0;
            decimal number = (decimal)cursorInteger;
            while (number > 1)
            {
                number /= 10;
                cursorInteger /= 10;
                digits[i] = (int)((number - cursorInteger) * 10);
                i++;
            }
            int newNumber = 0;
            for (int j = i - 1; j >= 0; j--)
            {
                newNumber += digits[j] * (int)Math.Pow(10, i - j - 1);
            }
            return newNumber == x;
        }
    }
}