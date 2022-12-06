package Polynom;

import java.util.ArrayList;
import java.util.List;

public class Polynom {

    private final double[] coefficient;
    private int derivationCounter = 0;

    public Polynom(double[] coefficient){
        this.coefficient = coefficient;
    }
    private Polynom(double[] coefficient, int derivationCounter){
        this.coefficient = coefficient;
        this.derivationCounter = derivationCounter;
    }
    public int getDegree(){
        for (int i = coefficient.length-1; i >= 0; i--){
            if(coefficient[i] != 0){
                return i;
            }
        }
        return 0;
    }

    public boolean isAxissymmetric() {
        for (int i = 0; i < coefficient.length; i++) {

            if (coefficient[i] != 0 && i % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPointsymmetric() {
        for (int i = 0; i < coefficient.length; i++) {

            if (coefficient[i] != 0 && i % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public double functionValue(double x){
        double sum = 0.0;

        for(int i = 0; i < coefficient.length; i++){
            sum += coefficient[i] * Math.pow(x, i);
        }

        return sum;
    }

    public double[] derivationCoefficients(){
        double[] derivation = { 0.0, 0.0, 0.0, 0.0, 0.0 };
        for (int i = 0; i < coefficient.length-1; i++){
            derivation[i] = (i+1) * coefficient[i+1];
            System.out.println(derivation[i]);
        }

        return derivation;
    }

    public Polynom derivationPolynom() {
        return new Polynom(derivationCoefficients(), (derivationCounter+1));
    }

    public ArrayList<Double> getZeropoints(){

        if(getDegree() == 4){

        }
        if(getDegree() == 3){

        }
        if(getDegree() == 2) {
            return getNullQuadratic();

        }
        if(getDegree() == 1) {
            return getNullLinear();
        }
        return new ArrayList<>();
    }

    private ArrayList<Double> getNullLinear() {
        return new ArrayList<>(List.of((coefficient[0] * -1) / coefficient[1]));
    }

    private ArrayList<Double> getNullQuadratic() {
        ArrayList<Double> list = new ArrayList<>();

        double p = coefficient[1] / coefficient[2];
        double q = coefficient[0] / coefficient[2];


        double sqrt = Math.sqrt(Math.pow((p / 2), 2) - q);
        double x1 = -(p / 2) + sqrt;
        double x2 = -(p / 2) - sqrt;

        if (!Double.isNaN(x1)) {
            list.add(x1);
        }

        if (!Double.isNaN(x2) && list.get(0) != x2) {
            list.add(x2);
        }

        return list;
    }

    public ArrayList<Double> getNull(){

        return null;
    }


    private String getOperator(int i) {
        // If number is negative
        if (coefficient[i] < 0) {
            return "-";
        }
        // If number is the last
        if (i >= getDegree()) {
            return "";
        }
        // If number is positive
        return "+";
    }

    private String getNumber(int i) {
        // If number is 1 --> (1) not (1x)
        if (coefficient[i] == 1 && i >= 1) {
            return "";
        }
        // If number is an integer --> (3x) not (3.0x)
        if (coefficient[i] % 2 == 0 || coefficient[i] % 2 == 1) {
            return String.valueOf((int) Math.abs(coefficient[i]));
        }
        // Default --> (4.56x)
        return String.valueOf(Math.abs(coefficient[i]));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("f" + ("'".repeat(derivationCounter)) + "(x) = ");

        for (int i = coefficient.length-1; i >= 0; i--) {
            if (coefficient[i] != 0) {
                // Get the right operator in front of the value
                if (i < getDegree()) {
                    builder.append(" ").append(getOperator(i)).append(" ");
                } else {
                    builder.append(getOperator(i));
                }

                builder.append(getNumber(i));

                // If exponent is 0 --> (3) not (3x^0)
                if (i == 0){
                    continue;
                }
                builder.append("x");
                // If exponent is 1 --> (3x) not (3x^1)
                if (i == 1){
                    continue;
                }
                // Default --> (3x^2)
                builder.append("^").append(i);
            }
        }
        return builder.toString();
    }

}
