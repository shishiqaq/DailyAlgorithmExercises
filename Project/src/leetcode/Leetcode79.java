package leetcode;

public class Leetcode79 {
	public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0) && bfs(board, i, j, 0, word)) 
                    return true;
            }
        }
        return false;
    }
    
    public boolean bfs(char[][] board, int i, int j, int count, String word){
        if(count == word.length())
            return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(count))
            return false;
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean flag = bfs(board, i+1, j, count+1, word)
            || bfs(board, i, j+1, count+1, word)
            || bfs(board, i-1, j, count+1, word)
            || bfs(board, i, j-1, count+1, word);
        board[i][j] = temp;
        return flag;
    }
}
