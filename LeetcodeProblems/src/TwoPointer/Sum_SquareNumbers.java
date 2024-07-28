package TwoPointer;

public class Sum_SquareNumbers {

    public static void main(String[] args) {
        int c = 1000;
        boolean ans = judgeSquareSum(c);
        System.out.println(ans);
    }

    private static boolean judgeSquareSum(int c) {
        int i = 0;
        int j = 0;
        
        while (j * j <= c) {
            j++;
        }
        j--; 
        
        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true; 
            } else if (sum < c) {
                i++; 
            } else {
                j--; 
            }
        }
        return false;
    }
}
