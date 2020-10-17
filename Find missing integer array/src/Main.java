
public class Main {
	/*
	 * You have array of subsequent non-repeating integers, 
	 * one is substituted with zero, then array is mixed, 
	 * describe algorithm to sort array and find missing 
	 * integer, its complexity.
	 */
	public static void main(String[] args) {		
		System.out.println("The missing number is : "	+ 
				findMissingNumber( new int[] { 3, 0, 6, 5, 1, 7, 2 }));	
		
		System.out.println("The missing number is : "	+
				findMissingNumber(new int[] { 11, 12, 5, 1, 7, 2, 4, 0, 9, 8, 10, 3, 6}));
		
		System.out.println("The missing number is : " +
				findMissingNumber( new int[] { 3, 4, 6, 5, 8, 10, 0, 1, 7, 2 }));	
		
		System.out.println("The missing number is : " + 
				findMissingNumber(new int[] { 11, 12, 5, 1, 0, 2, 4, 9, 8, 10, 3, 6}));
		
		System.out.println("The missing number is : " + 
				findMissingNumber(new int[] { 0 }));
	}

	private static Integer findMissingNumber(int[] numbers) {
		int posZero = -1;
		
		for (int i = 0; i < numbers.length; i++) {			
			
			int value = numbers[i];		
		
			while (value > 0 && value != i+1 ) {
				int aux = numbers[value-1];
				numbers[value-1] = value;
				numbers[i] = aux;
				value = numbers[i];
			}
			
			if (value == 0) {
				posZero = i;
			}			
			
		}		
		
		return posZero+1;
	}

}

