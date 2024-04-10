package ExamProblems;

import java.util.*;
import java.util.List;

public class WordMinimumLen {
	public static  int minMoves1(String word) {
		String [] charWords = word.split("");
		List<String> listWords = new ArrayList<>(Arrays.asList(charWords));
		//System.out.println((listWords));
		int valInd = 0;
		int move = 0;
		while(listWords.size()>valInd){
			List<String> subListChar = new ArrayList<>(listWords.subList(valInd+1, listWords.size()));
			int indexOfVal = subListChar.indexOf(listWords.get(valInd));
			if(indexOfVal>=0) {
				int indexOfMiddle = valInd+indexOfVal+1;
				List<String> subListChar2 = new ArrayList<>(listWords.subList(indexOfMiddle+1, listWords.size()));
				indexOfVal = subListChar2.indexOf(listWords.get(indexOfMiddle));
				//System.out.println("Value middle "+indexOfVal);
				
				if(indexOfVal>=0) {
					int nextIndex = indexOfMiddle+indexOfVal+1;
					listWords.remove(nextIndex);	
				}
				listWords.remove(valInd);
				
				move++;
				valInd=0;
//				System.out.println("Size of both ");
//				System.out.println(valInd+1+subListChar.size());
//				System.out.println(listWords.size());
				continue;
				
			}
			valInd++;
		}
		
		return move;
	}
	
	public static int minMoves(String word) {
        char[] chars = word.toCharArray();
        int moves = 0;

        // Iterate until no character can be removed from both halves
        boolean found;
        do {
            found = false;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < chars.length / 2; i++) {
                char c = chars[i];
                if (set.contains(c) && i != chars.length - 1 - i && set.contains(chars.length - 1 - i)) {
                    moves++;
                    removeChar(chars, c);
                    found = true;
                    break; // Exit the inner loop after removing one character
                }
                set.add(c);
            }
        } while (found);

        return moves;
    }

    private static void removeChar(char[] chars, char c) {
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (chars[i] == c && chars[j] == c) {
                // Remove the character from both ends
                i++;
                j--;
            } else if (chars[i] == c) {
                // Remove the character from the left end
                i++;
            } else if (chars[j] == c) {
                // Remove the character from the right end
                j--;
            } else {
                // If neither end contains the character, exit the loop
                break;
            }
        }
    }
	 public static void main(String[] args) {
	        String[] examples = {"baabacaa", "babbaaa", "abaaa"};

	        for (String word : examples) {
	            int minMoves = minMoves(word);
	            System.out.println("Word: " + word + ", Minimum number of moves: " + minMoves);
	        }
	    }

}
