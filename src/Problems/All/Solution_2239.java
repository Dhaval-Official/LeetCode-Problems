package Problems.All;

public class Solution_2239 {

    public int findClosestNumber(int[] nums) {

        int dist;
        int absN = Integer.MAX_VALUE;
        int absP = Integer.MAX_VALUE;

        for (int i: nums) {
//            abs = Math.min(abs, Math.abs(i));
            dist = Math.abs(i);

//            System.out.println(dist);
            if(i > 0) {
                absP = Math.min(absP, dist);
            } else if(i < 0){
                absN = Math.min(absN, dist);
            } else {
                return 0;
            }

        }

//        System.out.println(absN+" "+absP);

        if (absN == absP) {
            return absP;
        } else {
            if (absN < absP){
                return absN*-1;
            } else {
                return absP;
            }
        }

    }

}
