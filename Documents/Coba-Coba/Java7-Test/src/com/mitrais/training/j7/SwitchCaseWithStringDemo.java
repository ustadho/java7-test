package com.mitrais.training.j7;

import java.util.Scanner;

public class SwitchCaseWithStringDemo {
    public static void main(String[] args) {
        System.out.println("Enter a day. E.g MON/TUE..");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day){
            case "SUN":
                System.out.println("User entered day is SUNDAY");
                break;
            case "MON":
                System.out.println("User entered day is MONDAY");
                break;
            case "TUE":
                System.out.println("User entered day is TUESDAY");
                break;
            case "WED":
                System.out.println("User entered day is WEDNESDAY");
                break;
            case "THU":
                System.out.println("User entered day is THURSDAY");
                break;
            case "FRI":
                System.out.println("User entered day is FRIDAY");
                break;
            case "SAT":
                System.out.println("User entered day is SATURDAY");
                break;
            default:
                System.out.println("User entered Invalid day");

            scanner.close();
        }
    }
}
