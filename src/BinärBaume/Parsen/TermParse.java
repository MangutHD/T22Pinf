package BinärBaume.Parsen;

import java.util.Arrays;
import java.util.Stack;

public class TermParse {

    private static char[] arr;

    public static String parse(String input){
        //input = arr;
        input = input.replaceAll("[\\s|\\u00A0]+","");
        input = input.replace(",", ".");
        Stack<Character> operatorsStack = new Stack<>();


        for (int i = 0; i < arr.length; i++){
            char currentChar = arr[i];

            if(CharacterLists.OPERATOR.contains(arr[i])) {
                if (arr[i] == '-' && CharacterLists.NUMBERS.contains(arr[i + 1])) {
                    i++;
                }
                operatorsStack.push(currentChar);
            }
            if(CharacterLists.NUMBERS.contains(arr[i])){
            }
            if(CharacterLists.CHARACTERS.contains(arr[i])){
            }
        }

        return Arrays.toString(arr);
    }

}
