package com.dnigen;
import java.util.Scanner;

public class dnigen {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String args[]) {
        int DNI;
        char letter = 'Ñ';
        int check;

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a valid DNI without the letter.");
            while (!sc.hasNextInt()) {
                System.out.println(ANSI_YELLOW + "That's not a DNI number, please introduce the DNI without letter." + ANSI_RESET);
                sc.next(); // this is important! Loophole till you get a valid DNI.
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Thank you, give me a second.");

        DNI = number;

        {
            check = DNI % 23;
        }


        switch (check) {
            case 0 -> letter = 'T';
            case 1 -> letter = 'R';
            case 2 -> letter = 'W';
            case 3 -> letter = 'A';
            case 4 -> letter = 'G';
            case 5 -> letter = 'M';
            case 6 -> letter = 'Y';
            case 7 -> letter = 'F';
            case 8 -> letter = 'P';
            case 9 -> letter = 'D';
            case 10 -> letter = 'X';
            case 11 -> letter = 'B';
            case 12 -> letter = 'N';
            case 13 -> letter = 'J';
            case 14 -> letter = 'Z';
            case 15 -> letter = 'S';
            case 16 -> letter = 'Q';
            case 17 -> letter = 'V';
            case 18 -> letter = 'H';
            case 19 -> letter = 'L';
            case 20 -> letter = 'C';
            case 21 -> letter = 'K';
            case 22 -> letter = 'E';
        }
        System.out.println("------------------------");
        System.out.println(ANSI_CYAN + "Your DNI letter is '" + ANSI_RED + letter + ANSI_CYAN + "'. You're welcome!" + ANSI_RESET);
    }
}

