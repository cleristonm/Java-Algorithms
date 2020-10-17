
public class FindMaxSum {

	
	public static void main(String[] args) {
		int a[] = { -2, -19, 4, 8, -20, 1, 5, 3 }; 
        maxSubArraySum(a); 
	}
	private static void maxSubArraySum(int[] a) {
		int maxSum = Integer.MIN_VALUE,
		currentMax = 0,
		start = 0,
		end = 0,
		aux = 0;
		
		for (int i=0; i < a.length; i++) {
			currentMax += a[i];
			
			if (currentMax > maxSum) {
				maxSum = currentMax;
				start = aux;
				end = i;
			}
			
			if (currentMax < 0) {
				currentMax = 0;
				aux = i + 1;
			}
		}
		
		System.out.println("Max sum "+maxSum);
		System.out.println("Starting index "+start);
		System.out.println("Ending index "+end);
	}

}
