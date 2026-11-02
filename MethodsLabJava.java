package methodslab.java;

import java.util.Scanner;

public class MethodsLabJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, welcome to math program! :D");
        System.out.println("Please enter two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        int ans1 = PrintMultiplication(number1, number2);
        System.out.println("Multiplication: " + ans1);

        int ans2 = PrintAddition(number1, number2);
        System.out.println("Addition: " + ans2);

        int ans3 = PrintSubtraction(number1, number2);
        System.out.println("Subtraction: " + ans3);

        if (number2 != 0) {
            double answ4 = PrintDivision(number1, number2);
            System.out.println("Division: " + answ4);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Enter a number for factorial (0-12):");
        int factorialNumber = input.nextInt();

        if (factorialNumber >= 0 && factorialNumber <= 12) {
            System.out.println("Factorial: "
                    + PrintFactorial(factorialNumber));
        } else {
            System.out.println("Please enter a number from 0 to 12.");
        }

        int[] numbers = {10, 15, 20, 12, 18};

        System.out.println("Sum of array: " + PrintSumArray(numbers));
        System.out.println("Largest number in array: "
                + PrintMaxInArray(numbers));

        System.out.println("Enter a number to check if it is prime:");
        int primeNumber = input.nextInt();

        if (PrintPrime(primeNumber)) {
            System.out.println(primeNumber + " is a prime number.");
        } else {
            System.out.println(primeNumber + " is not a prime number.");
        }

        System.out.println("Enter two positive numbers for GCD and LCM:");
        int nam1 = input.nextInt();
        int nam2 = input.nextInt();

        if (nam1 > 0 && nam2 > 0) {
            System.out.println("GCD: " + PrintGCD(nam1, nam2));
            System.out.println("LCM: " + PrintLCM(nam1, nam2));
        } else {
            System.out.println("Both numbers must be positive.");
        }

        input.close();
    }

    static int PrintMultiplication(int multiply1, int multiply2) {
        return multiply1 * multiply2;
    }

    static int PrintAddition(int add1, int add2) {
        return add1 + add2;
    }

    static int PrintSubtraction(int subtract1, int subtract2) {
        return subtract1 - subtract2;
    }

    static double PrintDivision(double divide1, double divide2) {
        return divide1 / divide2;
    }

    static int PrintFactorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    static int PrintSumArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    static boolean PrintPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int PrintMaxInArray(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    static int PrintGCD(int number1, int number2) {
        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        return number1;
    }

    static int PrintLCM(int number1, int number2) {
        return (number1 / PrintGCD(number1, number2)) * number2;
    }


    }

