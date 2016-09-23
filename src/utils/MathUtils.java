package utils;

import java.util.Collection;

public class MathUtils {
    public static int getDispersion(Collection<Double> selection){
        int sum=0;
        Double temp;
        int sampleMean = getSampleMean(selection);
        for (Double number:selection) {
            temp= number-sampleMean;
            sum+=temp*temp;
        }
        return sum/selection.size();
    }

    public static int getSampleMean(Collection<Double> selection){
        int sum = 0;
        for (Double number: selection) {
            sum+=number;
        }
        selection.size();
        return sum/selection.size();
    }
}
