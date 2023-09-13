package chess.gameplay.contracts;

import chess.chess.model.Cell;
import chess.chess.model.Piece;

public class PlayerMove {

	Cell toCell;
	Piece piece;

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Cell getToCell() {
		return toCell;
	}

	public void setToCell(Cell toCell) {
		this.toCell = toCell;
	}

}
