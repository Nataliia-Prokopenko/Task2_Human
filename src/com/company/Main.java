package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Gender (M / F): ");
        String genderHuman1String = new Scanner(System.in).nextLine();
        String genderHuman2String = new Scanner(System.in).nextLine();

        String firstNameHuman1 = "Mark";
        String lastNameHuman1 = "FatherLastName";
        float highHuman1 = 5.23f;
        float weightHuman1 = 95.0f;

        String firstNameHuman2 = "Nata";
        String lastNameHuman2 = "MotherLastName";
        float highHuman2 = 1.33f;
        float weightHuman2 = 45.6f;

        System.out.println("Baby Name: ");
        String babyFirstName = new Scanner(System.in).nextLine();

        Human human1;
        Human human2;

        if (genderHuman1String.equalsIgnoreCase("M")) {
            human1 = new Man(firstNameHuman1, lastNameHuman1, highHuman1, weightHuman1);
        } else {
            human1 = new Woman(firstNameHuman1, lastNameHuman1, highHuman1, weightHuman1);
        }

        if (genderHuman2String.equalsIgnoreCase("M")) {
            human2 = new Man(firstNameHuman2, lastNameHuman2, highHuman2, weightHuman2);
        } else {
            human2 = new Woman(firstNameHuman2, lastNameHuman2, highHuman2, weightHuman2);
        }

        human1.relationship(human1, human2, babyFirstName);
    }
}
