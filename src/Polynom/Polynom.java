package Polynom;

public class Polynom {


    private final double[] coefficient;

    public Polynom(double[] coefficient){
        this.coefficient = coefficient;
    }


    public double funktionswert(double x){

        double sum = 0.0;

        for(int i = 0; i < coefficient.length; i++){
            sum += coefficient[i] * Math.pow(x, i);
        }
        System.out.println(sum);
        return sum;
    }

    public int grad(){
        for (int i = coefficient.length; i > 0; i--){
            if(coefficient[i] != 0){
                return i;
            }
        }
        return 0;
    }

    public int Symmetrie(){

        int sym = 0;
        for (int i = 0; i < coefficient.length; i++){

        }

        return sym;
    }

    public double[] ableitung(){
        double[] ableitung = new double[5];
        for (int i = 0; i < coefficient.length; i++){
            if(i == 0){
                ableitung[i] = 0;
            }else ableitung[i-1] =  coefficient[i] * i;
            System.out.println(ableitung[i]);
        }

        return ableitung;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("f(x)= ");
        for (int i = coefficient.length-1; i >= 0; i--){
            if(coefficient[i] != 0){
                stringBuilder.append(coefficient[i]);
                 if(i != 0){
                    stringBuilder.append("x");
                     if(i != 1){
                         stringBuilder.append("^").append(i).append(" + ");
                     }
                }
            }
        }

        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

}
