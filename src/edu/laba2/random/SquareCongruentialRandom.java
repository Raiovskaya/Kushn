package edu.laba2.random;

import edu.laba2.utils.NumberConverter;

public class SquareCongruentialRandom implements Randomizer {
    private final double A = 0.33;
    private final double B = 0.233;
    private final double C = 0.5;
    private final double M = 1;


    private double depot = 1;
    private double currentNumber = 2;

    @Override
    public int getRandomValue() {
        currentNumber = M*((A*currentNumber*currentNumber)+(B*currentNumber)+C);
        if (Double.isInfinite(currentNumber)) magicMethod();
        return NumberConverter.doubleToReturnedInt(currentNumber);
    }

    private void magicMethod(){
        depot++;
        currentNumber = depot;
    }
}
