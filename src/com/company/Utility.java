package com.company;

import java.util.Random;

public class Utility {
    public static int getRandom() {
        Random r = new Random();
        return 1 + r.nextInt(1000 - 1 + 1);
    }
}
