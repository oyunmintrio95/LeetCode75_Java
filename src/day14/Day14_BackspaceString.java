package day14;

import java.util.Stack;

public class Day14_BackspaceString {
    public static boolean  backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            if( c!= '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean same = backspaceCompare(s,t);

        System.out.println(same);
    }
}
