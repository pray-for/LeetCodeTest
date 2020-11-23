package StringEquals;

public class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = new String();
        String str2 = new String();
        for (int i = 0; i < word1.length; i++){
            str1 = str1 + word1[i];
        }
        for (int j = 0; j < word2.length; j++){
            str2 = str2 + word2[j];
        }
//        System.out.println("str1 " + str1);
//        System.out.println("str2 " + str2);
        if (str1.equals(str2)){
            return  true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "be"};
        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println(result);
    }
}
