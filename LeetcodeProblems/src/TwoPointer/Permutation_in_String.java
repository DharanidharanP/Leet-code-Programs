package TwoPointer;

public class Permutation_in_String {

    public static void main(String[] args) {
        String s1 = "hello", s2 = "ab";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkInclusion(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        int len1 = ch1.length;
        System.out.println(",,,,,,,,,###"+len1);
        char[] ch2 = s2.toCharArray();
        int len2 = ch2.length;
          if(len1==1) {
        	  return true;
          }
        for (int j = 0; j < len2; j++) {
            int i = 0;
            if (ch1[i] == ch2[j]) {
                i++;
                if ((i < len1 && j + 1 < len2 && ch1[i] == ch2[j + 1]) || (i < len1 && j - 1 >= 0 && ch1[i] == ch2[j - 1])) {
                    System.out.println("yes ..");
                    return true;
                }
            }
        }
        return false;
    }
}
