package day2;

public class Day2_subsequence {
    public static boolean isSubsequence(String s, String t) {

        int s_length = s.length();
        int t_length = t.length();

        char[] array_s = s.toCharArray();
        char[] array_t = t.toCharArray();

        int i = 0;
        int j = 0;

        if (s_length < 1){
            return true;
        }


        while(i<t_length){
            if(array_t[i]==array_s[j]){
                j++;
            }
            i++;

            if(j == s_length){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        Boolean isSubsequence = isSubsequence(s, t);
    }
}
