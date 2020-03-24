/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */

public class Solution001 {

    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }
        int cols = array[0].length;
        if (cols == 0) {
            return false;
        }
        // 右上
        int row = 0;   //注意
        int col = cols - 1;    //注意
        while (row < rows && col >= 0) {    //注意
            if (array[row][col] < target) {
                row++;        //注意
            } else if (array[row][col] > target) {
                col--;      //注意
            } else {
                return true;
            }
        }
        return false;
    }

}
