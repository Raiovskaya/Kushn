package randomizer;

public class NumberConverter {
    public static double stringToDouble(String number){
        return Double.parseDouble("0."+number);
    }

    public static int doubleToReturnedInt(double number){
        String str = Double.toString(number);
        int i = str.indexOf(".");
        str=str.substring(i+1);
        if(str.length()>3) str = str.substring(0,3);
        return Integer.parseInt(str);
    }
}
