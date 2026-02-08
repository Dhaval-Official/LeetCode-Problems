package Problems.Problems_NEXT;

import java.util.ArrayList;

public class Solution_2243 {

    public String digitSum(String s, int k) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            nums.add(s.charAt(i)-'0');
        }

        ArrayList<Integer> ans = new ArrayList<>();



        return "69";
    }
}


/*
* ArrayList<Integer> nums= new ArrayList<Integer>();

        for (int i = 0; i < s.length(); i++) {
            nums.add(s.charAt(i)-'0');
        }
        System.out.println(nums);

        while (nums.size() > k) {

            ArrayList<Integer> temp= new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {
                for (int j = i; j < i+k; j++) {
                    System.out.print(nums.get(j));
                }
                i+=k-1;
                System.out.println();
            }


            break;


        }



        return nums.toString();
    }*/
