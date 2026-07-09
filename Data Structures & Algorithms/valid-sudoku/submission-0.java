class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen =  new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                if (!seen.add(c + "at row" + i) || !seen.add(c + "at col" + j)
                    || !seen.add(c + "at" + i / 3 + "-" + j / 3)) {
                    return false;
                }
            }
        }
        return true;
    }
}
