package TwoPointer;

public class StringCompression {

	public static void main(String[] args) {
		char [] ch= {'a','a','b','b','c','c','c'};
		String ans=compress(ch);
		System.out.println(ans);
		
	}

	private static String compress(char[] ch) {
		int count=1;
		String temp="";
		 for (int i = 0; i < ch.length; i++) {
	            if (i < ch.length - 1 && ch[i] == ch[i + 1]) {
	                count++;
	            } else {
	                temp = temp + ch[i];
	                if (count > 1) {
	                    temp = temp + count;
	                }
	                count = 1; 
	            }
	        }
		return temp;
	}
	

}
