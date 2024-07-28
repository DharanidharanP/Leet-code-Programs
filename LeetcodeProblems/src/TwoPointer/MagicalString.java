package TwoPointer;

public class MagicalString {

	public static void main(String[] args) {
		  int n = 8;
	        System.out.println(magicalString(n) + " final ");
	    }

	    public static int magicalString(int n) {
	        if (n <= 0) return 0;
	        if (n <= 3) return 1;

	        StringBuilder sb = new StringBuilder("122");
	        int pointer = 1; 
	        
	        int index = 2;
	        char nextChar = '1'; 
	        while (sb.length() < n) {
	            int count = sb.charAt(index) - '0';
	            System.out.println(count+" count");
	            for (int i = 0; i < count; i++) {
	                sb.append(nextChar);
	                if (sb.length() <= n && nextChar == '1') {
	                    pointer++;
	                }
	            }
	            if (nextChar == '1') {
	                nextChar = '2';
	            } else {
	                nextChar = '1';
	            }
	            index++;
	        }
	        System.out.println(sb);
	        return pointer;
	    }

	}

