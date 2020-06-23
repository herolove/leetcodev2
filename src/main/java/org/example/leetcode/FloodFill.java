package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/15
 **/
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc,oldColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor){
        //边界
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length){
            return;
        }
        int c = image[sr][sc];

        if (c != newColor && c == oldColor){
            image[sr][sc] = newColor;
            //上下左右
            dfs(image, sr, sc+1,oldColor, newColor);
            dfs(image, sr, sc-1,oldColor, newColor);
            dfs(image, sr+1, sc,oldColor, newColor);
            dfs(image, sr-1, sc,oldColor, newColor);
        }
    }
}
