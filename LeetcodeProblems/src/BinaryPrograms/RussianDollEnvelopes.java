package BinaryPrograms;

public class RussianDollEnvelopes {

	public static void main(String[] args) {
		int[][] envelopes = {
			{5, 4},
			{6, 4},
			{6, 7},
			{2, 3}  
				
				
		};
		for (int i = 0; i < envelopes.length - 1; i++) {
			for (int j = 0; j < envelopes.length - 1 - i; j++) {
				if (envelopes[j][0] >= envelopes[j + 1][0]  
				    &&
				   envelopes[j][1] >= envelopes[j + 1][1]) {
					int[] temp = envelopes[j];
					envelopes[j] = envelopes[j + 1];
					envelopes[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < envelopes.length; i++) {
			for (int j = 0; j < envelopes[i].length; j++) {
				System.out.print(envelopes[i][j] + " ");
			}
			System.out.println(); 
		}
	}
}
