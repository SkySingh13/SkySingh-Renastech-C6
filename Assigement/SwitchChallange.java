package Assigements;

import java.awt.*;
import java.util.Scanner;

public class SwitchChallange {
    public static void main(String[] args)
    {
        Scanner Shop = new Scanner(System.in); //Call the input function


        int total=0;


        for (int i=0; i<3; i++)
        {
            if (i==0)
            {
             System.out.println("Please select one of the option below");
            }
            else
                System.out.println("Make another choice");

            System.out.println("Select 1: Shirt ||"+" Select 2: Pants ||"+" Select 3: Dress ||"+" Select 4: Hat ||"+" Select 5: Shoes ");
            int pick = Shop.nextInt();
            switch (pick)
            {
                case 1:
                    System.out.println("You Selected a shirt it cost $40\n");
                    total = total + 40;
                    break;
                case 2:
                    System.out.println("You Selected a Pants it cost $60\n");
                    total = total + 60;
                    break;
                case 3:
                    System.out.println("You Selected a Dress it cost $100\n");
                    total = total + 100;
                    break;
                case 4:
                    System.out.println("You Selected a Hat it cost $10\n");
                    total = total + 10;
                    break;
                case 5:
                    System.out.println("You Selected a Shoes it cost $120\n");
                    total = total + 120;
                    break;

                default:
                    System.out.println("Your selection is not an options, Please try again\n");
                      i = --i;
                     break;
            }
        }
     if(total >= 200)
            {
                 System.out.println("Your total is " + (total-(total*.20))+ " You got a discount of 20% which was "+(total*.20));
            }
     else if (total >=150 && total > 100)
            {
                 System.out.println("Your total is " + (total-(total*.15))+ " You got a discount of 15% which was "+(total*.15));
            }

     else if (total <= 100)
            {
                 System.out.println("Your total is " + (total-(total*.05))+ " You got a discount of 5% which was "+(total*.05));
            }

    }
}
