package Problems.Problems_0000;

public class Solution_0066 {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--) {
            // System.out.print(digits[i]+" ");
            if(digits[i] == 9) {
                digits[i] = 0;
                if(i==0) {
                    break;
                }
            } else {
                digits[i]+=1;
                return digits;
            }
        }
        System.out.println("gotta");
        int[] digits2 = new int[digits.length+1];
        digits2[0] = 1;
        // for(int i=0;i<digits2.length;i++) {
        //     System.out.print(digits2[i]+" ");
        // }
        return digits2;
    }
}
