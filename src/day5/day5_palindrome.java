package day5;

import java.util.HashSet;

public class day5_palindrome {
    public int longestPalindrome(String s) {
        //Decalre a variable that indicates length of Palindrome
        int length = 0;
        //Create HashSet object.
        HashSet<Character> hset = new HashSet<Character>();
        //Traverse through the string.
        for(int idx = 0; idx < s.length(); idx++){
            char character = s.charAt(idx);
            //If character is already in the set, they are even sets of character.
            if(hset.contains(character)){
                //Two sets => add 2 length
                length += 2;
                //there are set, remove the character in hset; This will live only odd number in the hset.
                hset.remove(character);
            }else{
                //If there is no character in the hset, add the character.
                hset.add(character);
            }
        }

        //hset.size()>0 meaning there are some odd number of character.
        //Only one is available for palindrome so add one to the length.
        if(hset.size()>0){
            length+=1;
        }

        return length;

    }
}
