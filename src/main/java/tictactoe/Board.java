package tictactoe;

public class Board {

	public int size;
	public PlayingPiece[][] board;

	public Board(int size) {
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}

	public boolean addPiece(int row, int col, PlayingPiece playingPiece) {

		if (board[row][col] != null) {
			return false;
		}

		board[row][col] = playingPiece;
		return true;
	}

	public void printBoard() {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print("|");
				System.out.print(board[i][j]);
				System.out.print("|");
			}
			System.out.println("");
		}
	}

	public boolean getFreeSpace() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == null) {
					return true;
				}
			}
			System.out.println("");
		}
		return false;
	}

}
