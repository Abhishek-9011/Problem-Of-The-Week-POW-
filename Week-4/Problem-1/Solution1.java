import java.util.*;

public class Solution1 {

    public static Character approach1(String str) {
        int minSecondIndex = str.length();
        Character result = null;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (j < minSecondIndex) {
                        minSecondIndex = j;
                        result = str.charAt(i);
                    }
                    break;
                }
            }
        }

        return result;
    }

    public static Character approach2(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return null;
    }

    public static void main(String[] args) {
        String s = "acbbac";
        System.err.println(approach1(s));
        System.err.println(approach2(s));
    }
}
