package day1;

public class day1_pivot {
    public int pivotIndex(int[] nums) {
        int pivot = 0;
        int totalSum = 0;
        int leftSum = 0;
        int len = nums.length;

        for(int n: nums){
            totalSum+= n;
        }

        for(int i=0; i<len; i++){
            pivot = i;
            totalSum -= nums[i];
            if(leftSum == totalSum){
                return pivot;
            }
            leftSum += nums[i];
        }
        return -1;


    }
}
