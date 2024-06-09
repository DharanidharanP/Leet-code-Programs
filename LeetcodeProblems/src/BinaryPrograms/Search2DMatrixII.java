package BinaryPrograms;

public class Search2DMatrixII {

	public static void main(String[] args) {

		int mat[][]= {{-5},{0}};
		
		boolean len =method(mat);
		System.out.println(len);
		/*
		 * int [][] mat= {{1,4,7,11,15,3}, {2,5,8,12,19}, {3,6,9,16,22},
		 * {10,13,14,17,24}, {10,13,14,17,24}, {18,21,23,26,30}};
		 */
	
	}

	private static boolean method(int[][] mat) {
	    boolean check=false;
		int len=mat.length;
		int target=-5;
		if(target==len) {
			check=true;
			return  check;
		}
		 for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[i].length; j++) {
	                if (mat[i][j] == target) {
	                    return true;
	                }
	            }
	        }
	        return false;
		
	}

}
