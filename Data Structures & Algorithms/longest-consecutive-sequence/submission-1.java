class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int len = 1;

                while (set.contains(current + 1)) {
                    current++;
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
