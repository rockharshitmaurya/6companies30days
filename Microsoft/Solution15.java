class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0, i = 0, arr[] = new int[3];

        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                arr[s.charAt(i++) - 'a']--;
            }
            ans += i;
        }
        return ans;
    }
}
