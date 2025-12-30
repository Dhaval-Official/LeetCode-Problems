package Problems.Problems_1700;

public class Solution_1725 {
    public int countGoodRectangles(int[][] rectangles) {

        int squareCurr;
        int squareMax=0;
        int maxSquaresCaught = 0;

        for (int i = 0; i < rectangles.length; i++) {

            squareCurr = Math.min(rectangles[i][0], rectangles[i][1]);

            if (squareCurr > squareMax) {
                squareMax = squareCurr;
                maxSquaresCaught = 1;
            } else if (squareCurr == squareMax) {
                maxSquaresCaught++;
            }

        }

        return maxSquaresCaught;
    }

}
