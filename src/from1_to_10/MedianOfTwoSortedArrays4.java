package from1_to_10;

import java.util.Arrays;

public class MedianOfTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int result[] = new int[m+n];
        double median = 0;

        //merging arrays
        int i = 0, j = 0, k = 0;
        while(i < m){
            result[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            result[k] = nums2[j];
            j++;
            k++;
        }

        //sorting the array
        Arrays.sort(result);

        //decalre result's length.
        int l = result.length;

        if(l%2 == 0){
            median = (result[(l/2)-1]+result[l/2])/2.0;
        }else{
            median = result[(l-1)/2];
        }

        return median;



    }
}
