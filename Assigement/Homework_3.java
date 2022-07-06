package Assigements;

public class Homework_3 {

    public static void main(String[] args) {

        String[] name = {"Jack", "Sarah", "Jonat"};     //Creating String Array to hold the names

        int[] age = {24, 30, 19};            //Creating the Int Array to hold the age

        Double[] gpa = {2.8, 3.0, 1.9};    //Creating the Double Array to hold the gpa


        for (int i = 0; i < name.length; i++) //Print out each of the variable in each of the array

        {

            System.out.println("Name: "+ name[i] +"\t\t"+"Age: " +age[i]+ "\t\t"+"GPA: " + gpa[i]  );  //print the names, ages and GPAs of each  student

        }

    }
}
