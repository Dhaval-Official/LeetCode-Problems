package Problems.All;

public class Solution_2283 {

    public boolean digitCount(String num) {

        for(int i=0;i<num.length();i++) {
            if(!(checkInstances(num, i, num.charAt(i)-'0'))) {
                return false;
            }

        }

        return true;
    }

    public boolean checkInstances(String s, int key, int instances) {

        int instance = 0;
        // System.out.println(s+" "+key+" "+instances);

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)-'0' == key) {
                instance++;
            }
        }

        // System.out.println(key+" "+instance+" "+instances);
        if(instance != instances)
            return false;

        return true;
    }
}
