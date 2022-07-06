package Assigements;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class Homework2_Max_number {

    public static void main(String[] args) {

        int num1=100;
        int num2=101;
        int num3=99;
        String line ="The largest number is";

        if(num1 >= num2 && num1 >=num3)
        {

            System.out.println(line+" " +num1 );

        }
        else if (num2 >= num1 && num2 >= num3)
        {
            System.out.println(line+" " +num2 );
        }
        else if (num3 >= num1 && num3 >= num2)
        {
            System.out.println(line+" " +num3 );
        }


    }
}
