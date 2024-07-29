package TwoPointer;

import java.util.Arrays;

public class FlippingImage {

	public static void main(String[] args) {
		int image[][]= {{1,1,0},{1,0,1},{0,0,0}};
		int ans[] []=flipAndInvertImage(image);
		//System.out.println(Arrays.toString(ans));

	}

	private static int[][] flipAndInvertImage(int[][] image) {
		int len = image.length;
		int[][] rev = new int[len][len];
		int[][] result = new int[len][len];

		for (int i = 0; i <len; i++) {
		    for (int j = 0; j <len; j++) {
		    	System.out.println("....j"+j);
		    	rev[i][j] = image[i][len-1 -j]; // len=3 , len-1-0 ,len-1-1,len-1-2
		        // result[i][0] = image[i][2]
		    }
		}
		for (int i = 0; i < len; i++) {
		    for (int j = 0; j < len; j++) {
		      //  System.out.print(result[i][j] + " ");
		    	if(rev[i][j]==0) {
		    		rev[i][j]=1;
		    		result[i][j]=rev[i][j];
		    	}
		    	else  { 
		    		rev[i][j]=0;
		    		result[i][j]=rev[i][j];
		    	}
		    	System.out.print(result[i][j]+" ");
		    }
		   // System.out.println();
		}
		
	    return result;
	}
}
