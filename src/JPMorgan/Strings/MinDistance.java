package JPMorgan.Strings;

public class MinDistance {
    void main(String[] args){
        String word1 = "horse";
        String word2 = "ros";
        System.out.println("MinDistance : "+ minDistance(word1,word2));
    }

    public static int minDistance(String word1,String word2) {

        // Step 1: Keep word2 as the shorter string to optimize space
        if (word1.length() < word2.length()) {
            String temp = word1;
            word1 = word2;
            word2 = temp;
        }
        int m = word1.length();
        int n = word2.length();
        // Step 2: Store DP values using only one array
        int[] dp = new int[n + 1];
        // Step 3: Base case: convert empty string to a prefix of word2
        for (int j = 0; j <= n; j++) {
            dp[j] = j;
        }
        // Step 4: Process each character of word1
        for (int i = 1; i <= m; i++) {

            // Save the previous row's first value
            int diagonal = dp[0];
            // Convert the first i characters of word1 to empty string
            dp[0] = i;
            // Step 5: Process each character of word2
            for (int j = 1; j <= n; j++) {
                // Save the old value before overwriting it
                int above = dp[j];
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // Matching characters need no additional operation
                    dp[j] = diagonal;
                } else {
                    // Insert: dp[j - 1]
                    // Delete: above
                    // Replace: diagonal

                    dp[j] = 1 + Math.min(
                            // Insert a character
                            dp[j - 1],
                            Math.min(above, diagonal)
                    );
                    // Update diagonal for the next column
                    diagonal = above;
                }

            }
        }
        // Final answer
        return dp[n];
    }
}
