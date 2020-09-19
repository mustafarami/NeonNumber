import java.util.Scanner;

/*
What is Neon Number?
 A neon number is a number where the sum of digits is square of the number is equal to the number itself.

Example:
 9 is a neon number.
 Its square is 9*9 = 81 and sum of that digits 8+1 = 9.

Note:
 Except 1 and 9 there are no more neon numbers between 1 to n.
 
 */
public class NeonNumber {

    public static void main(String[] args) {
        int number, square, sum = 0;
        String result;

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter a Number: ");
        number = input.nextInt();
        square = number * number;

        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }

        result = sum == number ? " is a Neon Number" : " is not a Neon Number";
        System.out.println(number + result);

    }

}