package my_package;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.. ");
        int n = scan.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }

    public static long factorial(int n) {
        if(n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
