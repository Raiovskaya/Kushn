package edu.laba2.random;

import java.util.Random;

public class ClassicRandom implements Randomizer {
    final Random random = new Random();

    @Override
    public int getRandomValue() {
        return random.nextInt(100);
    }
}
