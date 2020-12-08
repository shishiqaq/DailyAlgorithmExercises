package leetcode;

public class Leetcoce36 {
	public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.' && !isValid(board, i, j))
                    return false;
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col){
        for(int i = 0; i < board.length; i++){
            if(i != row && board[i][col] == board[row][col])
                return false;
            if(i != col && board[row][i] == board[row][col])
                return false;
        }
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for(int i = boxRow; i < boxRow+3; i++){
            for(int j = boxCol; j < boxCol+3; j++){
                if(i != row && j != col && board[i][j] == board[row][col])
                    return false;
            }
        }
        return true;
    }
}
