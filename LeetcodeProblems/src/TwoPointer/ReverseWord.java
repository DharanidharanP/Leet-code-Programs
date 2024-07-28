package TwoPointer;

public class ReverseWord {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String ans=reverseWords(s);
		System.out.println(ans);
		
	}

	private static String reverseWords(String s) {
		String str[] = s.split(" ");
		String rev = "";
		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			char[] ch=word.toCharArray();
			System.out.println(word+" ....");
			for (int j = ch.length-1; j >= 0; j--) {
				rev = rev + ch[j]+ "";
			}
			rev = rev + " ";
		}
		return rev.trim();
	}
}
