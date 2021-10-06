package com.dnigen;
import java.util.Scanner;

public class niegen{
    public static void main(String args[]) {


        Scanner ad = new Scanner(System.in);
        String NIE = "hello";

        do {
            System.out.println("Please enter your NIE including the first letter.");
            while (!NIE.startsWith("X")) {
                System.out.println("Please include the first letter.");
                ad.next(); // this is important!
            }
            NIE = ad.next();
        } while (NIE.startsWith("X") || (NIE.startsWith("Y")));
        System.out.println("Thank you, give me a second.");





    }
}
