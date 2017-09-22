package SummitTraining;
import java.util.ArrayList;
import java.util.Arrays;

//Currently Incomplete
public class SummitTraining {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] y = {1, 2, 2, 5, 9, 5, 4, 4, 1, 6};
		int[] y = {4, 9, 4, 9, 9, 8, 2, 9, 0, 1};
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>(0);
		ArrayList<Integer> idealPath = new ArrayList<Integer>(0);
		ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>(0);
		int topScore = 0;
		
		for(int i = y.length - 1; i >= 0; i--) {
			int score = 1;
			ArrayList<Integer> pathway = new ArrayList<Integer>(0);
			pathway.add(y[i]);
			for(int x = i + 1; x < y.length; x++) {
				if(y[x] < pathway.get(pathway.size()-1 )) {
					score = score + 1;
					pathway.add(y[x]);
				}
			}
			scoreList.add(score);
			if(score > topScore) {
				topScore = score;
				idealPath = pathway;
			}
			paths.add(pathway);
		}
		
		System.out.println(Arrays.toString(scoreList.toArray()));
		System.out.println(Arrays.toString(paths.toArray()));
		System.out.println(Arrays.toString(idealPath.toArray()));
	}
	
}
