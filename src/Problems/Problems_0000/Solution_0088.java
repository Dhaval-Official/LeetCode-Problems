package Problems.Problems_0000;

public class Solution_0088 {

    void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n==0) {return;}

        if(m==0) {
            for(int i=0;i<n;i++) { nums1[i] = nums2[i];}
            return;
        }


        int loc = 0, i=0;
        while(i<n) {

            if(loc >= m && nums1[loc] == 0 ) { break;}

            if(nums1[loc] <= nums2[i]) {
                loc++;
                continue;
            } else {
                nums1 = pushRight(nums1, loc, nums2[i++]);
                m++;
            }

        }

        if(i != n)  {
            for(int j=loc;j<nums1.length;j++) {
                nums1[j] = nums2[i++];
            }
        }

    }

    int[] pushRight(int[] nums1, int start, int val) {

        for(int i=nums1.length-1; i>start; i--) {
            nums1[i] = nums1[i-1];
        }
        nums1[start] = val;

        return nums1;
    }
}