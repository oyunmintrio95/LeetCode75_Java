package day7;

public class day7_binarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while ( start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target) return mid;
            else if (target < nums[mid]){
                //trget exist left side of the middle index, redeclare the end.
                end = mid - 1;
            }else{
                //trget exist right side of the middle index, redeclare the start.
                start = mid+1;
            }
        }
        return -1;

    }
}
