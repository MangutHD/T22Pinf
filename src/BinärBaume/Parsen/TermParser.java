package BinärBaume.Parsen;

public class TermParser {

    private String[] a;
    private String input;


    public TermParser(String input){
        this.input = input;
    }

    public String[] pars(){
        input = input.replaceAll("[\\s|\\u00A0]+","");
        input = input.replace(",", ".");
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '-' && CharacterLists.NUMBERS.contains(input.charAt(i + 1))){
                if(input.charAt(0) == '-' || CharacterLists.OPERATOR.contains(input.charAt(i -1)) ){
                    i++;
                }
            }
           // if (CharacterLists.OPERATOR.contains(input.charAt(i)) || input.charAt(i) == '(' || input.charAt(i) ==')' ){
                //input.replace(input.charAt(i)+"","");
            //}
        }



        return a;
    }


}
