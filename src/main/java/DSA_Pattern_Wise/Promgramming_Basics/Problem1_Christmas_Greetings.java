package DSA_Pattern_Wise.Promgramming_Basics;

import java.util.Scanner;

/*
Problem: Christmas Greetings

Christmas is celebrated on 25th December every year.

You are given a day X in December.
Determine whether it is Christmas.

Print:
- "CHRISTMAS" if X == 25
- "ORDINARY" otherwise.

Input:
A single integer X

Output:
CHRISTMAS or ORDINARY

Example:
Input: 25
Output: CHRISTMAS
*/

public class Problem1_Christmas_Greetings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X == 25) {
            System.out.println("CHRISTMAS");
        } else {
            System.out.println("ORDINARY");
        }

        sc.close();
    }
}