import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {

    public static List<String> approach1(String input, List<String> dictionary) {
        String sortedInput = sortString(input);
        List<String> result = new ArrayList<>();

        for (String word : dictionary) {
            if (word.length() == input.length() + 1) {
                if (isStepWord(sortedInput, sortString(word))) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean isStepWord(String shorter, String longer) {
        int i = 0, j = 0, mismatch = 0;
        while (i < shorter.length() && j < longer.length()) {
            if (shorter.charAt(i) == longer.charAt(j)) {
                i++;
                j++;
            } else {
                mismatch++;
                j++;
            }
            if (mismatch > 1)
                return false;
        }
        return true;
    }

    
    public static List<String> approach2(String input, List<String> dictionary) {
        int[] inputFreq = buildFreq(input);
        List<String> result = new ArrayList<>();
        
        for (String word : dictionary) {
            if (word.length() == input.length() + 1) {
                int[] wordFreq = buildFreq(word);
                if (isStepWordFreq(inputFreq, wordFreq)) {
                    result.add(word);
                }
            }
        }
        
        return result;
    }
    private static boolean isStepWordFreq(int[] base, int[] candidate) {
        int extra = 0;

        for (int i = 0; i < 26; i++) {
            if (candidate[i] < base[i])
                return false;
            extra += candidate[i] - base[i];
        }

        return extra == 1;
    }
    
    private static int[] buildFreq(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
List<String> dictionary = Arrays.asList("appeal", "apply", "pepla", "papple", "apples");
    String inputWord = "apple";

    System.out.println(approach1(inputWord, dictionary));
    System.out.println(approach2(inputWord, dictionary));
    }
}
