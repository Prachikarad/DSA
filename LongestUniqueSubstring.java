import java.util.HashSet;

public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String text) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < text.length(); right++) {
            while (window.contains(text.charAt(right))) {
                window.remove(text.charAt(left));
                left++;
            }

            window.add(text.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }

    public static void main(String[] args) {
        String text = "abcabcbb";
        System.out.println("Longest unique substring length: "
                + lengthOfLongestSubstring(text));
    }
}