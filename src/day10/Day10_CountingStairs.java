package day10;

import java.util.Arrays;

public class Day10_CountingStairs {
    public int climbStairs(int n) {
        // Create an array to store the results of subproblems
        int memo[] = new int[n+1];
        // Fill the array with -1 to indicate that the corresponding subproblem hasn't been solved yet
        Arrays.fill(memo, -1);

        // Call the helper function to solve the problem
        return helper(n, memo);
    }

    public int helper(int n, int memo[]){
        // Base cases: if there are 0 or 1 stairs, there's only one way to climb them
        if(n == 0 || n == 1){
            return 1;
        }

        // If we've already solved this subproblem, return the result from the memoization array
        if(memo[n] != -1){
            return memo[n];
        }

        // Solve the subproblem recursively by calling the helper function on n-1 and n-2 stairs,
        // and add the results together to get the final answer
        memo[n] =  helper(n-1, memo) + helper(n-2, memo);
        return memo[n];
    }
}
