package TwoPointer;

public class ReverseOfVowelsString {

    public static void main(String[] args) {
        String s = "leetcode";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowel(ch[i])) {
                i++;             
            }
            if (!isVowel(ch[j])) {
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < ch.length; k++) {
            System.out.print(ch[k] );
        }
    }
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
