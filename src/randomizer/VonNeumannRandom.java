package randomizer;

public class VonNeumannRandom implements MyRandom {
    private final double REBOUND_NUMBER = 0.123;

    private Double currentNumber = 0.9876;

    @Override
    public int getRandom() {
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
        if(number.contains("0")) return true;
        return false;
    }
}
