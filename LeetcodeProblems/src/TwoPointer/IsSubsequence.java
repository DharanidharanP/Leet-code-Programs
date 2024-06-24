package TwoPointer;

public class IsSubsequence {

	public static void main(String[] args) {
		String s="axc";
		char[] ch=s.toCharArray();
		String t="ahbgdc";
		char[] ch1=t.toCharArray();		
		boolean sub= isSubsequence(ch,ch1);
		System.out.println(sub);
		

	}

	private static boolean isSubsequence(char[] ch, char[] ch1) {
		int i = 0, j = 0;
        while (i < ch.length && j < ch1.length) {
            if (ch[i] == ch1[j]) {
                i++;
            }
            j++;
        }
        return i == ch.length;
    }
}
