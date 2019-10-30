
/*
Given a list of three-digit numbers as input,
write a function that prints the unique combinations of
digits as well as the sum of the digits

Example:
Input: 111, 213, 123, 111, 456
Output: 111:3, 213:6, 123:6, 456:15

*/

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Amazon {
    public static void main(String arg[]) {

        int[] Input = {111, 213, 123, 111, 456};

        //Print out the Input (without the last comma)
        System.out.print("Input: ");
        System.out.print(Arrays.toString(Input).replace('[',' ').replace(']',' '));
        System.out.println();

        //Create an Linked Hash Set and put into it distinct numbers to remain the order
        LinkedHashSet<Integer> InputNoDuplicates = new LinkedHashSet<>();
        for (Integer number : Input) {
            InputNoDuplicates.add(number);
        }

        //Convert a LinkedHashList to an Array
        Integer [] numbersArraty = InputNoDuplicates.toArray(new Integer[0]);

       //Create an integer array which will hold the sum of numbers' digits
        int [] sumArray = new int [numbersArraty.length];

        //Iterate trough array to convert distinct numbers to a String and split it to separated digits
        for (int c = 0; c < numbersArraty.length; c++){
            //Convert numbers to a String
            String stringNumber = Integer.toString(numbersArraty[c]);

            //Split a string to separate digits
            String [] NumbersSplit = stringNumber.split("");

            //Create a temporary array with integers to be able to calculate the sum
            int [] digits = new int [NumbersSplit.length];

            //Calculate the sum
            int sum = 0;
            for (int i =0; i< digits.length; i++){

                digits[i]= Integer.parseInt(NumbersSplit[i]);
                sum = sum + digits[i];
            }

            //Add the sum to the array
            sumArray[c]=sum;
        }

        //Print out the expected result (without the last comma)
        System.out.print("Output: ");
        for (int i=0; i<numbersArraty.length-1; i++) {
            System.out.print (numbersArraty[i] + ":" + sumArray[i] + ", ");
            }
            System.out.print (numbersArraty[numbersArraty.length-1] + ":" + sumArray[numbersArraty.length-1]);
    }
}




