class Solution {
    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            String str = strs.get(i); // Hello
            st.append(str.length() + "#" + str);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int j = 0, i = 0;

        while (i < str.length()) {
            j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            String s = str.substring(i, j);
            int len = Integer.parseInt(s);
            String word = str.substring(j + 1, len + j + 1);
            res.add(word);
            i = len + j + 1;
        }
        return res;
    }
}
