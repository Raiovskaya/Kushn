package edu.laba2.random;

import edu.laba2.utils.NumberConverter;

public class VonNeumannRandom implements Randomizer {
    private final double REBOUND_NUMBER = 0.123;

    private Double currentNumber = 0.9876;

    @Override
    public int getRandomValue() {
        currentNumber = createRandom(currentNumber);
        return NumberConverter.doubleToReturnedInt(currentNumber);
    }


    private double createRandom(double number){
        number*=number;
        String result = discardLevel(number);
        if(isZeroExists(result)){
            currentNumber-=REBOUND_NUMBER;
            return createRandom(currentNumber);
        }
        return NumberConverter.stringToDouble(result);
    }

    private String discardLevel(double number){
        return Double.toString(number).substring(4,8);
    }

    private boolean isZeroExists(String number){
        return number.contains("0");
    }
}
