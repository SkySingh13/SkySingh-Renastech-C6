package Assigements;

import java.util.Scanner;

public class Homework5_ifelse {

    public static void main(String[] args) {

        Scanner Bill = new Scanner(System.in); //Call the input function

        System.out.println("What is the total of your bill?");

        double BillA = Bill.nextDouble();   //Variable to hold the amount of the bill

        if (BillA >= 99 && BillA <= 280)    //Checking to see if the bill is more than or equal to 99 AND less than or equal to 280
        {
            System.out.println("Bill " + BillA + "\nTax " + (BillA * .15) +"\n-------------"+ "\nTotal " + (BillA + (BillA * .15)));  //if true print the bill amount then the tax and finally the total. 15%=.15
        }
        else if (BillA > 99 || BillA >280 )  //Checking to see if the bill is less than 99 OR greater than 280
        {
            System.out.println("Bill " + BillA + "\nTax " + (BillA * .20) + "\n-------------"+"\nTotal " + (BillA + (BillA * .20))); //if true print the bill amount then the tax and finally the total. 20%=.20
        }
    }
}