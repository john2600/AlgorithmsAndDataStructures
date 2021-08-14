package com.datastructures.stack;

import java.util.Stack;

public class StackChallenge {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A la catalana banal, atacala"));
    }
    public static boolean isPalindrome(String origin){
        Stack<Character> list = new Stack<>();
        origin = formatText(origin);

        char[] values = origin.toCharArray();
        for(int i=0; i<values.length; i++){
            list.push(values[i]);
        }

        StringBuilder st = new StringBuilder();
        int i = 0;
        char[] original = origin.toCharArray();
        while (!list.isEmpty()){
           Character ch = list.pop();
           if(!ch.equals(original[i])){
               return false;
           }
           i++;
           //st.append(ch);
        }
        return true;
        //return origin.equals(st.toString());
    }

    public static String formatText(String ch){
        StringBuilder stringBuilder = new StringBuilder();
        char[] characters = ch.toCharArray();
        for (int i=0; i<ch.length(); i++){
            if(!(characters[i] >= 'A' && characters[i] <= 'Z') && !(characters[i] >= 'a' && characters[i] <= 'z')){
                continue;
            }else {
                stringBuilder.append(characters[i]);
            }
        }
        return stringBuilder.toString().toLowerCase().trim();
    }

}
