package CountOne;

public class Solution {

    public static int hammingWeight(int n) {
        int count = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt("00000000000000000000000000001011");
        int result = hammingWeight(num);
        System.out.println(result);
    }
}
