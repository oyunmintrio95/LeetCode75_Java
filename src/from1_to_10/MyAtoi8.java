package from1_to_10;

public class MyAtoi8 {
    public int myAtoi(String s) {
        // //Read in and ignore any leading whitespace.
        // String temp = s.replace(" ","");

        // //Check if the next character is '-' or '+'
        // char op = '+';
        // if(temp.charAt(0) == '+' || temp.charAt(0) == '-'){
        //     op = temp.charAt(0);
        //     //Can we assume the rsult here?
        //     // the string without the operation
        //     temp = temp.substring(1);
        // }

        // //Read in next the characters until the next non-digit character
        // for(int i=0; i<temp.length();i++){
        //     if(!Character.isDigit(temp.charAt(i))){
        //         temp = temp.substring(0,i);
        //     }
        // }

        // //Convert these digits into an integer
        // int finalNum = Integer.parseInt(temp);

        // //Decide wheter the digit is positive or negative
        // if(op == '-') finalNum = (-1) * finalNum;

        // //Check if the number is in the range
        // if(finalNum >Integer.MAX_VALUE){
        //     finalNum = Integer.MAX_VALUE;
        // }else if(finalNum < Integer.MIN_VALUE){
        //     finalNum = Integer.MIN_VALUE;
        // }

        // return finalNum;

        int len = s.length();
        if( len == 0){
            return 0;
        }
        double num = 0;
        int i = 0;
        while (i< len && s.charAt(i) == ' '){
            i++;
        }
        if (i == len){
            return 0;
        }
        boolean positive = s.charAt(i) == '+';
        boolean negative = s.charAt(i) == '-';

        if(positive){
            i++;
        }
        if(negative){
            i++;
        }
        while(i<len && s.charAt(i) >= '0' && s.charAt(i) <='9'){
            num = num*10 + (s.charAt(i)-'0');
            i++;
        }
        num = negative? -num:num;
        num = (num>Integer.MAX_VALUE) ? Integer.MAX_VALUE : num;
        num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE: num;
        return (int) num;




    }
}
