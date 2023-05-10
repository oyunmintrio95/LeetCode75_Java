package day11;

public class Day11_MinCountingStairs {
    public int minCostClimbingStairs(int[] cost) {

        //Declare variables of starting from zero index and starting from one index
        int prev = cost[0];
        int prev2 = 0;
        int current;

        //Use Math Method to find the minimum.
        for(int i=1; i<cost.length; i++ ){
            current = Math.min(prev+cost[i], prev2+cost[i]);
            prev2 = prev;
            prev = current;
        }

        return Math.min(prev, prev2);

    }
}
