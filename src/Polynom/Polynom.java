package Polynom;

public class Polynom {


    private final double[] arr;

    public Polynom(double[] arr){
        this.arr = arr;
    }

    public void koeffizient(){
        System.out.print("f(x)=");
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                i++;
            }
            System.out.print(arr[i]+"x^"+i+" ");
    }

    }

    public double funktionswert(double x){

        float sum = 0.0f;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i] * Math.pow(x, i);
        }
        System.out.println(sum);
        return sum;
    }

    public void grad(){

    }

    public void achsensymmetrisch(){

    }

    public void punktsymmetrisch(){

    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.arr.length; i++){

        }
        return stringBuilder.toString();
    }

}
