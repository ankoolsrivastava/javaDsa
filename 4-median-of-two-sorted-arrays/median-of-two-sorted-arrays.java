class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int[] result = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            result[k]=nums1[i];
            i++;
            k++;
        }
         while(j<n){
            result[k]=nums2[j];
            j++;
            k++;
        }
        
        if(size%2!=0){
            return result[size/2];
        }else{
            return (result[(size/2)-1]+result[size/2])/2.0;
        }

    }
}