package TwoPointer;

public class Palindromic_Substrings {

    public static void main(String[] args) {
        String s = "aaa";
        int ans = countSubstrings(s);
        System.out.println(ans);
    }

    private static int countSubstrings(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            for (int start = 0; start <= i; start++) {
                String dummy = "";
                for (int j = start; j <= i; j++) {
                    dummy += ch[j];
                }
                
                String rev = "";
                for (int k = dummy.length() - 1; k >= 0; k--) {
                    rev += dummy.charAt(k);
                }
                
                if (dummy.equals(rev)) {
                    count++;
                }
            }
        }
        return count;
    }
}
