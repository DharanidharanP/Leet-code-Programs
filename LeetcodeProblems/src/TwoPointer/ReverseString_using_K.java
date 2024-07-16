package TwoPointer;

public class ReverseString_using_K {

	public static void main(String[] args) {
		String s = "abcdef";
		int k = 2;
		String ans = reverseStr(k, s);
		System.out.print(ans+" ");
	}

	private static String reverseStr(int k, String s) {
		char[] ch = s.toCharArray();
		String str="";
		int i=0;
		int j=0;
		while(i<j) {		
			 char temp = ch[i];
             ch[i] = ch[j];
             ch[j] = temp;
             i++;
             j++;
		}
		for(int i1=0;i1<ch.length;i1++) {
			str=str+ch[i1];
		}
		return str;
	}

}
