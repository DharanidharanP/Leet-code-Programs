package BinaryPrograms;

public class Pattern132 {

	public static void main(String[] args) {
		int nums[] = { -2,1,2,-2,1,2 };
		boolean pattern = pattern(nums);
		System.out.println(pattern);
	}

	private static boolean pattern(int[] nums) {
		 for (int j = 0; j < nums.length; j++) {
			 System.out.println("j..= "+j);
	            for (int i = j + 1; i < nums.length; i++) {
	            	 System.out.println("i..= "+i);
	                for (int k = i + 1; k < nums.length; k++) {
	                	 System.out.println("k..= "+k);
	                    if (nums[j] < nums[k] && nums[k] < nums[i]) {
	                    	System.out.println("no[k]...= "+nums[k] );
							System.out.println("no[i]...= "+nums[i] );
							System.out.println("no[j]...= "+nums[j] );
	                        return true;
	                    }
	                }
	            }
	        }	       
			return false;
	}
	
	/*private static boolean pattern(int[] no) {
		for (int j = 0; j < no.length; j++) {
			int k = no.length;
			System.out.println(k);
			for (int i = j + 1; i < no.length; i++) {
				if (no[i] > no[j]) {
					while (k > i) {
						k--;
						System.out.println("k......."+k);
						if (no[k] < no[i] && no[k] > no[j]) {
							System.out.println("no[k]...= "+no[k] );
							System.out.println("no[i]...= "+no[i] );
							System.out.println("no[j]...= "+no[j] );
							return true;
						}
					}
				}
			}
		}
		return false; */
}
