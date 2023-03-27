package challenges;

import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            mainDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        
        int diagDiff = Math.abs(mainDiagonal - secondaryDiagonal);
        return diagDiff;
    }
}
