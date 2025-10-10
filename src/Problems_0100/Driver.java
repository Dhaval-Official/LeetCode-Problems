package Problems_0100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {

        Solution s = new Solution();
//        int[] nums = new int[50000];
        try {

//            File myFile = new File("testAR.txt");
//            FileReader fileReader = new FileReader(myFile);
//            BufferedReader reader = new BufferedReader(fileReader);

            // for(int i=0;i<nums.length;i++) {
            // nums[i] = Integer.parseInt(reader.readLine());
            // }
            // System.out.println(nums[45155]);

//            reader.close();

        } catch(Exception ex) {ex.printStackTrace();}
        //				0  1  2 3 4 5 6 7
        int[] nums1 = {-8,-4,-1,0,1,3,5,6};
        int[] nums2 = {-2147483648,1,1};
        int[] nums3 = {1,2,-2147483648};

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] ans;
        ans = s.twoSum(nums,target);
        // s.thirdMax(nums1);

//         System.out.print("\nANS = "+ans);
         System.out.print("[");
         for(int i=0;i<ans.length;i++) {
//          while(ans!=null) {
            System.out.print(ans[i]+", ");
        // ans = ans.next;
         }
         System.out.print("]");
//        System.out.println(ans);
    }

}
