package RotateString;

public class Solution {
    public static String reverseLeftWords(String s, int n) {
        String s1 = s.replaceAll(s.substring(0, n), "");
        String s2 = s1.concat(s.substring(0, n));
        return s2;
    }

    public static void main(String[] args) {
        String str = new String("abcdefg");
        int n = 2;
        String str2 = reverseLeftWords(str, n);
        System.out.println(str2);
    }
}
