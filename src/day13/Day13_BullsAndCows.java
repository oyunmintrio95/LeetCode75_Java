package day13;

import java.util.HashMap;

public class Day13_BullsAndCows {
    public static String getHint(String secret, String guess) {
        char secretChar[] = secret.toCharArray();
        char guessChar[] = guess.toCharArray();
        int bulls=0, cow=0, n = secret.length(), m=guess.length();
        String ans = "";

        // Checking for bulls(same digit, correct position)
        for(int i=0; i<n; i++){
            if(secretChar[i] == guessChar[i]){
                bulls++;
                secretChar[i]='@'; guessChar[i]='@';
            }
        }

        //A hashmap for guess; To avoid duplicate element, set Character as a key of hashmap.
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<m; i++){
            if(hm.containsKey(guessChar[i])==false && guessChar[i]!='@'){
                hm.put(guessChar[i],1);
            }else if(guessChar[i]!='@'){
                hm.put(guessChar[i], hm.get(guessChar[i])+1);
            }
        }

        //Check for cow hint
        for(int i=0; i<n; i++){
            if(hm.containsKey(secretChar[i])){
                int key = hm.get(secretChar[i]);
                if(key>0){
                    cow ++;
                    hm.put(secretChar[i],hm.get(secretChar[i])-1);
                }
            }
        }

        ans = Integer.toString(bulls)+"A"+Integer.toString(cow)+"B";

        return ans;

    }

    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";

        String hint = getHint(secret,guess);
        System.out.println(hint);
    }
}
