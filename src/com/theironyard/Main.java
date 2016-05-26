package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please answer the following questions about your vehicle.");
        System.out.println("1. Is your vehicle a car or a truck?");
        System.out.println("2. What color is your vehicle?");
        System.out.println("3. What year is your vehicle?");
        System.out.println("4. What make is your vehicle?");
        System.out.println("5. How many doors does your vehicle have?");
        System.out.println("6. List vehicle details.");

        String option = scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println("Enter your vehicle type");
        }
    }
}
