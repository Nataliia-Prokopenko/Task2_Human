package com.company;

public class Woman extends Human {

    public Woman(String firstName, String lastName, float height, float weight) {
        super(false, firstName, lastName, height, weight);
    }

    public Human giveABirth(Human human1, Human human2, String babyFirstName) {
        Human baby;

        if (Utility.getRandom() <= 500) {
            baby = new Man(babyFirstName, getBabyLastName(human1, human2), getBabyHigh(human1, human2), getBabyWeight(human1, human2));
        } else {
            baby = new Woman(babyFirstName, getBabyLastName(human1, human2), getBabyHigh(human1, human2), getBabyWeight(human1, human2));
        }

        System.out.println("Name: " + baby.firstName);
        System.out.println("Gender: " + baby.gender);
        System.out.println("Last Name: " + getBabyLastName(human1, human2));
        System.out.println("Height: " + baby.height);
        System.out.println("Weight: " + baby.weight);
        return baby;
    }

    private String getBabyLastName(Human human1, Human human2) {
        if (gender = true) {
            return human1.lastName;
        } else {
            return human2.lastName;
        }
    }

    private float getBabyHigh(Human human1, Human human2) {
        if (this.gender = human1.gender) {
            return (float) (human1.height + 0.1 * (human2.height - human1.height));
        } else {
            return (float) (human2.height + 0.1 * (human1.height - human2.height));
        }
    }

    private float getBabyWeight(Human human1, Human human2) {
        if (this.gender = human1.gender) {
            return (float) (human1.weight + 0.1 * (human2.weight - human1.weight));
        } else {
            return (float) (human2.weight + 0.1 * (human1.weight - human2.weight));
        }
    }
}

