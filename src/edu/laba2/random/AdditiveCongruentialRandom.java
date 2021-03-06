package edu.laba2.random;

import edu.laba2.utils.NumberConverter;

public class AdditiveCongruentialRandom implements Randomizer {
    private final double M = 0.127;

    private double depot = 0.1234;
    private double currentNumber = 0.1234;

    @Override
    public int getRandomValue() {
        currentNumber=currentNumber*(1-M)/M;
        if (Double.isInfinite(currentNumber)) magicMethod();
        return NumberConverter.doubleToReturnedInt(currentNumber);
    }

    private void magicMethod(){
        depot+=0.0012;
        currentNumber = depot;
    }
}
