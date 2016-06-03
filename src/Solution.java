
public class Solution {

	public static void main(String[] args) {
	
		int[] input = {2,3,1,5};
		int result = solution(input);
		System.out.print(result);

	}

	public static int solution(int[] A) {
		
		int[] elementAsIndex = new int[A.length + 2];
		
		for (int j=0; j<A.length; j++){
			elementAsIndex[A[j]] = 1;
		}
		
		int missingElement = 0;
		for (int z=0; z<elementAsIndex.length; z++) {
			if (elementAsIndex[z] == 0) missingElement = z; 
		}
			
		return missingElement;
	}
	
}
