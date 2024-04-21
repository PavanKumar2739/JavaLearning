package ExamProblems;

import java.util.*;

public class Parity {
	public static void main(String[] args) {
		int []arrayNums = {17, 46, 151, 77, 28, 68, 255, 27, 326, 3,2, 20, 12, 8, 97, 75, 779, 123, 30, 22, 18, 2,8, 30, 90, 89, 19, 22, 27, 23, 15, 67, 24, 1,53, 79, 311};
		
		int a = arrayDel(arrayNums);
		System.out.println(a);
		Arrays.sort(arrayNums);
		List<Integer> eve = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		sepEveOdd(arrayNums, eve, odd);
		//boolean falg = false;
		while(eve.size()>0||odd.size()>0) {
			if(eve.size()>0) {
				eve.remove(eve.size()-1);
			}else {
				break;
			}
			if(odd.size()>0) {
				odd.remove(odd.size()-1);
			}else {
				break;
			}
			
		}
		System.out.println(eve);
		System.out.println(odd);
		int sum = 0;
		if(odd.size()>1) {
			sum = odd.subList(0,odd.size()-1).stream().reduce(0,(i,j) -> i+j );
		}
		if(eve.size()>1) {
			sum = eve.subList(0,eve.size()-1).stream().reduce(0,(i,j) -> i+j );
		}
		System.out.println(sum);
		
	}
	
	public static int arrayDel(int[] c) {
        // Separate elements into even and odd ArrayLists
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int num : c) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        // Determine the parity of the first element
        int startParity = c[0] % 2;
        
        // Initialize variables
        int sumSelected = 0;
        int currentParity = startParity;
        
        // Iterate until no more moves can be made
        while (true) {
            // Select element based on current parity
            int selected;
            if (currentParity == 0) {
                if (even.isEmpty()) {
                    break;
                }
                selected = even.remove(even.size() - 1);
            } else {
                if (odd.isEmpty()) {
                    break;
                }
                selected = odd.remove(odd.size() - 1);
            }
            
            // Update sum of selected elements
            sumSelected += selected;
            
            // Toggle current parity
            currentParity = 1 - currentParity;
        }
        
        return sumSelected;
    }

	
	static void sepEveOdd(int []arr,List<Integer> eve,List<Integer> odd ) {
		for(int num:arr) {
			if(num%2==0) {
				eve.add(num);
			}else {
				odd.add(num);
			}
		}
		
	}
	static boolean hasEvenParity(int x) 
	{ 
	    int y = x ^ (x >> 1); 
	    y = y ^ (y >> 2); 
	    y = y ^ (y >> 4); 
	    y = y ^ (y >> 8); 
	    y = y ^ (y >> 16); 

	    // Rightmost bit of y holds the parity value 
	    // if (y&1) is 1 then parity is odd else even 
	    return (y & 1) == 0;
	} 

}
