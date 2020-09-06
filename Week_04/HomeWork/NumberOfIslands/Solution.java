package HomeWork.NumberOfIslands;


/**
 * L200. 岛屿数量 （Easy）
 * 463. 岛屿的周长 （Easy）
 * 695. 岛屿的最大面积 （Medium）
 * 827. 最大人工岛 （Hard）
 * 解法:将孤岛变为海洋
 * 处理思路, 先遍历处理, 将连着的岛(上下左右递归置0, 只留下1)唯一, 然后进行计数
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') {
                    DFSMarking(grid, i, j, n, m);
                    ++count;
                }
        }
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j, n, m);
        DFSMarking(grid, i - 1, j, n, m);
        DFSMarking(grid, i, j + 1, n, m);
    }
}