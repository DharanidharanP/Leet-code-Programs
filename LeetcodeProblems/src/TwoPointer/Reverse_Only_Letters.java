package TwoPointer;

public class Reverse_Only_Letters {

	public static void main(String[] args) {
         String s="a-bC-dEf-ghIj";
         //       "j-Ih-gfE-dCba"
         String ans=reverseOnlyLetters(s);
	}

	private static String reverseOnlyLetters(String s) {
		char ch[]=s.toCharArray();
		int len=ch.length-1;
		int index=0;
		System.out.println(len);
		String rev="";
		String remove="";
		/*
		  if(ch[i]=='-') {
				index=i;
				System.out.println();
			}
		 */
		for(int i=len;i>=0;i--) {
			rev=rev+ch[i];			
		}
		
		System.out.println(rev);
		System.out.println(s);
		return null;
	}

}
