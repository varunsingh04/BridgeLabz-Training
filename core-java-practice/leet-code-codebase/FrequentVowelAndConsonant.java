

public class FrequentVowelAndConsonant {
    public static void main(String[] args) {
        FrequentVowelAndConsonant fvac = new FrequentVowelAndConsonant();
        String s = "leetcode";
        int result = fvac.maxFreqSum(s);
        System.out.println("Max Frequency Sum of Vowel and Consonant: " + result);
    }
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel = 0, maxConso = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            freq[i]++;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                maxVowel = Math.max(maxVowel, freq[i]);
            else
                maxConso = Math.max(maxConso, freq[i]);
        }
        return maxVowel + maxConso;
    }

}
