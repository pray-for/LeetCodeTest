package SpaceReplace;

public class Solution {

    public static String replaceSpace(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' '){
                String plus = "%20";
                result = result.concat(plus);
            }else {
                result = result.concat(String.valueOf(c));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "we are happy";
        String result = replaceSpace(str);
        System.out.println(result);
    }

}
