class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        // Assuming the input contains only lowercase English letters

        // Iterate through the string and count the occurrence of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i; // Found the first non-repeating character, return its index
            }
        }

        return -1; // No non-repeating character found
    }
}
