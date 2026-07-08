class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ret[]= new int[k];
        for (int c : nums) {
            if (map.containsKey(c)) {
                int freq;
                freq = map.get(c);
                map.put(c, freq + 1);
            } else {
                map.put(c, 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(
            list, (entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));
        for(int i=0;i<k;i++)
        {
           ret[i] = list.get(i).getKey();
        }

        return ret;
    }
}
