package Problems.Problems_NEXT;

import java.util.HashSet;

//solved earlier in oldID
public class Solution_0202 {
    public boolean isHappy(int n) {

        if(n==1 || n==7 || n==10)
            return true;
        else if(n < 10)
            return false;

        HashSet<Integer> myhash = new HashSet<Integer>();
        n = newNumber(n);

        do{

            if(n==1 || n==7 || n==10)
                return true;
            else if(n < 10)
                return false;

            myhash.add(n);
            n = newNumber(n);

        }while(!(myhash.contains(n)));

        return false;

    }

    int newNumber(int n) {
        int total = 0;
        int mod;

        while(n>0) {

            mod = n%10;
            total+= mod * mod;
            n = n/10;
        }

        return total;
    }
}
