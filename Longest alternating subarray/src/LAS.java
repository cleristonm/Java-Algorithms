import java.util.Arrays;

public class LAS {
	public static void main(String[] args) {
		int[] iarray = { 3, 2, 36, 3, -1, 2, -3, 8, 2, -2, 5, 3 };
		findLongestSubArray(iarray);
	}

	private static void findLongestSubArray(int[] iarr) {
		//Armazena a maior qtde da sequencia
		int maxLen = 1;
		// Armazena o ultimo indice 
		int endIndex = 0;
		// stores length of longest alternating subarray ending at current position
		int currLen = 1;
		// traverse the given array starting from the second index
		for (int i = 1; i < iarr.length; i++)
		{
			// if current element has opposite sign than the previous element
			if (iarr[i] * iarr[i - 1] < 0)
			{
				// include current element in longest alternating subarray ending at
				// previous index
				currLen++;	
				// update result if current sub-array length is found to be greater
				if (currLen > maxLen)
				{
					maxLen = currLen;
					endIndex = i;
				}
			}
			// reset length if current element has same sign as previous element
			else {
				currLen = 1;
			}
		}

		int[] subarray = Arrays.copyOfRange(iarr, (endIndex - maxLen + 1), endIndex + 1);
		System.out.println("The longest alternating subarray is "
							+ Arrays.toString(subarray));
	}
}
