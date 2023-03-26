package day2;

import java.util.HashMap;
import java.util.Map;

public class day2_isomorphism {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null ||  t == null || s.length() != t.length()){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            if(map.containsKey(char_s)){
                if(map.get(char_s) != char_t){
                    return false;
                }
            }else{
                if(map.containsValue(char_t)){
                    return false;
                }
                map.put(char_s,char_t);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        Boolean check =  isIsomorphic(s,t);

        System.out.println(check);

    }

}




