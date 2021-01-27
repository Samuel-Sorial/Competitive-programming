using System;

namespace LeetCode
{
    // Solution to https://leetcode.com/problems/palindrome-number
    public class PalindromeNumber
    {
        public bool IsPalindrome(int x)
        {
            if (x < 0)
            {
                return false;
            }
            if (x == 0)
            {
                return true;
            }
            int cursorInteger = x;
            int rev = 0;
            while (cursorInteger != 0)
            {
                rev = (rev * 10) + (cursorInteger % 10);
                cursorInteger /= 10;
                if (rev == x)
                {
                    return true;
                }
            }
            return false;
        }
    }
}