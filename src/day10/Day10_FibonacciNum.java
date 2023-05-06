package day10;

public class Day10_FibonacciNum {

//    F(0) = 0, F(1) = 1
//    F(n) = F(n - 1) + F(n - 2), for n > 1.

    public int fib(int n) {
        // until n ==1, the fibonacci number returns n itself.
        if(n < 2){
            return n;
        }
        //Fibonacci number is the sum of the two preceding ones.
        int prev = 0, next = 1, sum = 0;
        for(int i = 1; i<n; i++){
            sum = prev + next;
            //redeclare previous one so that it can point to the next number.
            prev = next;
            next = sum;
        }

        return sum;

    }
}
