package my_package;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base Value: ");
        int base = s.nextInt();
        System.out.println("Enter Power Value: ");
        int pwr = s.nextInt();
        long power = PowerToBase(base, pwr);
        System.out.println("The power is: "+power);
    }

    public static long PowerToBase(int base, int pwr) {
        long power = 1;
        while (pwr > 0) {
            if (pwr % 2 == 0) {
                base = base * base;
                pwr = pwr / 2;
            } else {
                power = power * base;
                pwr = pwr - 1;
            }
        }
        return power;
    }

}
