// package com.company;

public class Table {


    /*
    Logical Table
    */

        public static void main(String args[]) {

            System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

            Print(true, true);
            Print(true, false);
            Print(false, true);
            Print(false, false);

            boolean Z = true;
            char LogicalResult = (Z) ? '1' : '0';


            // System.out.println(T);
        }
        private static void Print(boolean p, boolean q){
       /* System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
*/
            char LogicalResult = (p) ? '1' : '0';
            System.out.print(LogicalResult + "\t\t" );

            LogicalResult = (q) ? '1' : '0';
            System.out.print(LogicalResult + "\t\t" );

            LogicalResult = (p & q) ? '1' : '0';
            System.out.print(LogicalResult + "\t\t" );

            LogicalResult = (p | q) ? '1' : '0';
            System.out.print(LogicalResult + "\t\t" );

            LogicalResult = (p ^ q) ? '1' : '0';
            System.out.print(LogicalResult + "\t\t" );

            LogicalResult = (!p) ? '1' : '0';
            System.out.println(LogicalResult);

        } }


