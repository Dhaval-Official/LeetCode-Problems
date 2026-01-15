package Problems.All;

public class Solution_2379 {

    public int minimumRecolors(String blocks, int k) {

        int whitesFound;
        int min = k;

        for (int i = 0; i < blocks.length()-k+1 ; i++) {

            whitesFound = 0;

            for (int j = i; j < i+k; j++) {
                if (blocks.charAt(j) == 'W') {
                    whitesFound++;
                    if (whitesFound >= min) {
                        break;
                    }

                }
            }

            if (whitesFound < min) {
                min = whitesFound;
            }

        }

        return min;
    }

}
