package Assigements;

import java.security.PublicKey;
import java.util.Scanner;

public class Homework_5_phone_bill {
    public static void main(String[] args) {

        Scanner Call = new Scanner(System.in); //Call the input function

        System.out.println("How many call did you make this month?");

        int CallB= Call.nextInt();   //Variable to hold the amount of the bill

        double monthlyBill= 200;  //flat

        if (CallB >= 0 && CallB <= 100)   //If the user use less than 100 class
             {
                     System.out.println("Your total of your bill is "+ monthlyBill);
             }

                else if(CallB > 100 && CallB <= 150)   //setting the rule for any calls above the 100 and less than or equal  150
                     {
                        System.out.println("Your total of your bill is "+(monthlyBill+((CallB-100)*.60))); //removing the 100 cals cover by the monthly flat fee leaving  a number between 1 & 50
                     }
                         else if(CallB>150 && CallB <= 200) //setting the rules if the user makes above 150 calls but less than 200
                             {
                                 System.out.println("Your total of your bill is "+(monthlyBill+((50)*.60)+((CallB-150)*.50))); //50*.60 is going to cover amount used before 150.
                             }
                                else if(CallB > 200)
                                    {
                                        System.out.println("Your total of your bill is "+(monthlyBill+(50*.60)+(50*.50)+((CallB-200)*.40))); //after 200 its 50 @ 50c and 50 @ 60c and the rest at @ 40c

                                    }




    }
}