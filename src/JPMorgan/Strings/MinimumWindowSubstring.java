package JPMorgan.Strings;

public class MinimumWindowSubstring {

    void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minimumWindow(s, t));

    }

    public static String minimumWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }
        // Store the required frequency of each character
        int[] frequency = new int[128];
        for (char ch : t.toCharArray()) {
            frequency[ch]++;
        }
        int left = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        // Number of characters still required
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // If this character is needed, reduce required
            if (frequency[current] > 0) {
                required--;
            }
            // Decrease its frequency
            frequency[current]--;

            // When required == 0, the window is valid

            while (required == 0) {
                // Update the smallest window
                int windowLength = right - left + 1;
                if (windowLength < minLength) {
                    minLength = windowLength;
                    start = left;
                }

                // Try removing the leftmost character
                char leftChar = s.charAt(left);
                frequency[leftChar]++;

                // If removing it makes a required character missing
                if (frequency[leftChar] > 0) {
                    required++;
                }
                left++;

                // No valid window found

                if (minLength == Integer.MAX_VALUE) {
                    return "";
                }

            }
        }
        return s.substring(start, start + minLength);
    }
}