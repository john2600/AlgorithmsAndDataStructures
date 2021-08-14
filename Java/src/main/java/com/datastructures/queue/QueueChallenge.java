package com.datastructures.queue;

import java.util.LinkedList;

public class QueueChallenge {

    public static void main(String[] args) {

        System.out.println(checkIsPalindrome("A la catalana banal, atacala"));
    }

    public static boolean checkIsPalindrome(String word){
        LinkedList<Character> charactersQueue = new LinkedList<>();
        LinkedList<Character> characterStack = new LinkedList<>();
        char [] chars = word.toLowerCase().toCharArray();
        for (int i=0; i<chars.length; i++){
            if((chars[i] >= 'a' && chars[i] <= 'z')) {
                charactersQueue.addLast(chars[i]);
                characterStack.push(chars[i]);
            }
        }

        while(!characterStack.isEmpty()) {
            if (!charactersQueue.pop().equals(characterStack.removeFirst())){
                return false;
            }

        }
        return true;
    }
}
