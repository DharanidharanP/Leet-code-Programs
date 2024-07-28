package TwoPointer;

public class Palindrome_II {

	public static void main(String[] args) {
	 String s="abca";
	 
	 boolean ans =validPalindrome(s);
	 System.out.println(ans);

	}

	private static boolean validPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		 while(i<j){
	            if(s.charAt(i) == s.charAt(j)){
	                i++;
	                j--;
	            } else{
	                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
	            }
	        }
	        
	        return true ;
	    }

	private static boolean isPalindrome(String s, int i, int j) {
		System.out.println("i..."+i+"  i value ="+s.charAt(i));
		System.out.println("j..."+i+"  j value ="+s.charAt(j));
		 while(i<j) {
			 if(s.charAt(i)==s.charAt(j)) {
				 i++;
				 j--;
			 }else {
				 return false;
			 }
	}
		return true;

	}
}
