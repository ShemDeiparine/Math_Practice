//SHEM DEIPARINE
//sdeipar1@umbc.edu

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Shem Deiparine");
        System.out.println("sdeipar1@umbc.edu");

        System.out.println("************************************");
        System.out.println("Part 1");
        System.out.println("************************************");

        int first = 8;
        int second = 3;

        int plus = first + second;
        System.out.println("Using + operator " + plus);

        int minus = first - second;
        System.out.println("Using - operator " + minus);

        int multiplication = first * second;
        System.out.println("Using * operator " + multiplication);

        int division = first / second;
        System.out.println("Using / operator " + division);

        int remainder = first % second;
        System.out.println("Using % operator " + remainder);

        int increment = ++first;
        System.out.println("Using ++ operator " + increment);

        int decrement = --first;
        System.out.println("Using -- operator " + decrement);

        System.out.println("************************************");
        System.out.println("Part 2");
        System.out.println("************************************");

        int third = 8;
        int fourth = 10;

        boolean x = (third == fourth);
        System.out.println("Using == operator " + x);

        boolean y = (third != fourth);
        System.out.println("Using != operator " + y);

        boolean z = (third > fourth);
        System.out.println("Using > operator " + z);

        boolean a = (third < fourth);
        System.out.println("Using < operator " + a);

        boolean b = (third <= fourth);
        System.out.println("Using <= operator " + b);

        boolean c = (third >= fourth);
        System.out.println("Using >= operator " + c);

        System.out.println("************************************");

    }
}