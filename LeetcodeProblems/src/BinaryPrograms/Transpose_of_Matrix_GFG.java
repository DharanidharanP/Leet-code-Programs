package BinaryPrograms;

public class Transpose_of_Matrix_GFG {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int temp = a[i][j];
				System.out.println(a[i][j] = a[j][i]);
				System.out.println(a[j][i] = temp);
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=0;j<arr.length;j++) {
		 * System.out.print(arr[i][j]+" "); } System.out.println(); } int b[][]=new int
		 * [3][3]; for(int i=0;i<b.length;i++) { for(int j=0;j<b.length;j++) {
		 * b[i][j]=0;
		 * 
		 * for(int k=0;k<b.length;k++) { b[i][j]=arr[j][i]; }
		 * System.out.print(b[i][j]+" "); } System.out.println(); }
		 */
	}

}
