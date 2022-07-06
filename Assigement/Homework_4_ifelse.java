package Assigements;

import java.util.Scanner;

public class Homework_4_ifelse {

    public static void main(String[] args) {

        Scanner getTemp = new Scanner(System.in);


        System.out.println("what's is the current temperature in Fahrenheit?");  //Asking the user for an input

        double TempF = getTemp.nextInt();   //Variable to hold the temperature in fahrenheit

        double TempC = ((TempF - 32) / 1.8); //Converting fahrenheit to celsius

        System.out.println(TempC);

        if (TempC < -10)
        {
            System.out.println("Its cold too out side!!!");
        }
        else if (TempC >= -10 && TempC < 0)
        {
            System.out.println("it's cold");
        }
        else if (TempC >= 0 && TempC < 15)
        {
            System.out.println("it's not cold");
        }
        else if (TempC >= 15 && TempC < 40)
        {
            System.out.println("Its Warm!!!");
        }
        else if (TempC >= 40 && TempC < 60)
        {
            System.out.println("Its extremely hot!!!!");
        }
        else if (TempC >= 60)
        {
            System.out.println("Its hot as hell !!!!");
        }


    }
}
