package com.Aditya;

import java.sql.SQLOutput;

public class Patterns {
    public static void main(String[] args) {
        Pattern5(5);
    }

    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    static void Pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    static void Pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*           * * * * *
                 * * * *
                 * * *
                 * *
                 *
     */

    static void Pattern3(int n) {
        for (int row = n; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
     */
    static void Pattern4(int n) {
        for (int row= 0; row<=n ; row++)
        {
            for (int col=0; col<row; col++) {
                System.out.print("*"+ " ");
            }
            System.out.println(""); }
        for (int row=n-1; row>=0; row--)
        {
            for(int col=0; col <= row-1;col++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
    /*
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
    //asdfghjkjhgfdsa
                  *
                * * *
              * * * * *
            * * * * * * *
     */
    static void Pattern5(int n)
    {
        {
            for (int row=0; row<n; row++)
                { for (int col=n-row; col>1; col--)
            {
                System.out.print(" ");
            }
            for (int col=0; col<=row; col++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
}