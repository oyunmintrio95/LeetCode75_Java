package from1_to_10;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1){
            return 1;
        }

        Set<Character> alphaSet = new HashSet<Character>();
        int lengthest = 0;
        int left=0;

        for(int right=0; right<s.length(); right++){
            if(alphaSet.contains(s.charAt(right))){
                while(s.charAt(left)!=s.charAt(right)){
                    alphaSet.remove(s.charAt(left));
                    left++;
                }
                alphaSet.remove(s.charAt(left));
                left++;
                alphaSet.add(s.charAt(right));
            }else{
                lengthest = Math.max(lengthest, right-left+1);
                alphaSet.add(s.charAt(right));
            }


        }
        return lengthest;


    }
}
