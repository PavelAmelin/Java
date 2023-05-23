package java_seminar_5;
public class task_3 {
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0}};
        SetQueen(board, 0);
        }
    private static boolean CanGo(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (arr[i][j] == 1)
                return false;
        }
        return true;
    }
    private static void SetQueen(int[][] b, int row) {
        if (row == 8) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.printf("%d ",b[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int i = 0; i < b.length; i++) {
            if (CanGo(b, row, i)) {
                b[row][i] = 1;
                SetQueen(b, row + 1);
                b[row][i] = 0;
            }
        }
    }
}

