package DSA_Pattern_Wise.Promgramming_Basics;

import java.util.Scanner;

/*
Problem: The Ides of March

Julius Caesar was warned to beware the ides of March,
which is the 15th of March.

You are given today's date N in March.

Print:
- "Yes" if N is 15
- "No" otherwise

Input:
A single integer N

Output:
Yes or No

Example:
Input: 15
Output: Yes

Time Complexity: O(1)
Space Complexity: O(1)
*/

public class Problem2_The_Ides_of_March {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 15) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}