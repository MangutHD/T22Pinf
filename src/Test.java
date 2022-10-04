import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {


    public static void main(String[] args) throws IOException {

        System.out.println("Hello World");

        System.out.println("Wie ist dein Name?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();

        System.out.println("Hello " + name);


            String wort = "WHATISTHEMATRIX";

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < wort.length(); i += 3) {

                list.add(wort.substring(i, i + 3));

            }

            for (String s : list) {

                System.out.println(s);

            }

       double a =  1;
       double b =  2;
       double max = maximum(a,b);

        System.out.println(max);

    }

    public static double maximum(double a, double b){
        double out = 0;
          if(a > b){
            out = a ;
        }else{
            out = b;
        }
        return out;
    }

    public static int faculty(){

        faculty();
        return 0;
    }
}
