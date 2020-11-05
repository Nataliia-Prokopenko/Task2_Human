package com.company;

public abstract class Human {

    public boolean gender;
    public String firstName;
    public String lastName;
    public float height;
    public float weight;

    public Human(boolean gender, String firstName, String lastName, float height, float weight) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    static int random = Utility.getRandom();

    public boolean getTalkative(Human human1, Human human2) {
        if ((!human1.gender && !human2.gender) || (!human1.gender && human2.gender) || (human1.gender && !human2.gender)) {
            return true;
        } else if ((human1.gender && human2.gender) && (random <= 500)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getTolerate(Human human1, Human human2) {
        if ((!human1.gender && !human2.gender) && (random <= 50)) {
            return true;
        } else if ((!human1.gender && human2.gender) && (random <= 700)) {
            return true;
        } else if ((human1.gender && !human2.gender) && (random <= 700)) {
            return true;
        } else if ((human1.gender && human2.gender) && (random <= 560)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getTimeTogether(Human human1, Human human2) {
        if ((human1.height > human2.height * 1.1) && (random <= 850)) {
            return true;
        }
        if ((human1.height < human2.height * 1.1) && (human1.height > human2.height) && (random <= 950)) {
            return true;
        } else {
            return false;
        }
    }

    public Human relationship(Human human1, Human human2, String babyFirstName) {
        boolean talkative = getTalkative(human1, human2);
        boolean tolerate = getTolerate(human1, human2);
        boolean timeTogether = getTimeTogether(human1, human2);

        if (talkative && tolerate && timeTogether && (human1.gender != human2.gender)) {
            System.out.println("Говорить: " + talkative);
            System.out.println("терпеть/выдерживать общество : " + tolerate);
            System.out.println("проводить время вместе : " + timeTogether);
            System.out.println("");
            System.out.println("Создан новый человек:");
            return getWoman(human1, human2).giveABirth(human1, human2, babyFirstName);
        } else {
            System.out.println("");
            System.out.println("ничего не вышло... разбежались");
            return null;
        }
    }

    private Woman getWoman(Human human1, Human human2) {
        if (human1.gender) {
            return (Woman) human2;
        } else {
            return (Woman) human1;
        }
    }
}
