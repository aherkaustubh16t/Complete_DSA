package DSA_Pattern_Wise.Promgramming_Basics;

import java.util.Scanner;

/*
Problem: Good Turn

Chef and Chefina roll their dice together.

A turn is considered good if the sum of the numbers
on both dice is greater than 6.

Given X and Y, determine whether the turn is good.

Input:
- First line contains integer T (number of test cases)
- Each test case contains two integers X and Y

Output:
- Print "YES" if X + Y > 6
- Otherwise print "NO"

Example:
Input:
4
1 4
3 4
4 2
2 6

Output:
NO
YES
NO
YES

Time Complexity: O(T)
Space Complexity: O(1)
*/

public class Problem3_Good_Turn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X + Y > 6) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}