package chess.chess.model;

/**
 * Model class representing the single cell of a board. A cell has a location in
 * the grid which is represented by x and y location.
 */

public class Cell {

	private int x;

	private int y;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Piece getCurrentPiece() {
		return currentPiece;
	}

	public void setCurrentPiece(Piece currentPiece) {
		this.currentPiece = currentPiece;
	}

	private Piece currentPiece;

	public boolean isFree() {
		return currentPiece == null;
	}
}
