package edu.laba2.utils;

import java.util.Collection;

public class MathUtils {
    public static double getDispersion(Collection<Double> selection){
        double sum=0;
        Double temp;
        double sampleMean = getSampleMean(selection);
        for (Double number:selection) {
            temp= number-sampleMean;
            sum+=temp*temp;
        }
        return sum/selection.size();
    }

    public static double getSampleMean(Collection<Double> selection){
        double sum = 0;
        for (Double number: selection) {
            sum+=number;
        }
        selection.size();
        return sum/selection.size();
    }
}
