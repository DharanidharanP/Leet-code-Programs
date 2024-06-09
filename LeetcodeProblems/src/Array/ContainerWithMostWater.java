package Array;

public class ContainerWithMostWater {

	
	    public static int maxArea1(int[] height) {
	        int left = 0;  
	        int right = height.length - 1;  
	        int maxArea = 0; 

	        while (left < right) {  
	        	System.out.println("left...= "+left+"     "+"right..= "+right);
	        	System.out.println("height[left]..="+height[left]);
	        	System.out.println("height[right]..="+height[right]);
	        	int sub=right - left;
	        	System.out.println("right - left..= "+sub);
	            int currentArea = Math.min(height[left], height[right]) * (right - left);
	            System.out.println("currentArea...="+currentArea);
	            maxArea = Math.max(maxArea, currentArea);
	            System.out.println("maxArea...="+maxArea);
	            if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return maxArea;  // Return the maximum area found
	    }
	

	
	public static void main(String[] args) {
		int height[]= {1,8,6,2,5,4,8,3,7};
		int ans=maxArea1(height);
	}
}
