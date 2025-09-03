package practice_outside;

import java.util.*;

public class Problem1 {
	
	
		 public static void main(String[] args) {
		 List<Integer> scores = Arrays.asList(95, 40, 85, 70, 40);
		 Set<Integer> passedScores = new LinkedHashSet<>();

		 for (int score : scores) {
		 if (score >= 50) {
		 passedScores.add(score);
		 } else {
		 passedScores.add(-1);
		 }
		 }

		 System.out.println(passedScores);
		 }
		


}
