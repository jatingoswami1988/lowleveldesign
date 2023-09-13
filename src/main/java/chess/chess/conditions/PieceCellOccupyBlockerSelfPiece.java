package chess.chess.conditions;

import chess.chess.model.Board;
import chess.chess.model.Cell;
import chess.chess.model.Piece;
import chess.chess.model.Player;

/**
 * This tells that a cell cannot occupy a cell if that cell already has any piece from the same player.
 */
public class PieceCellOccupyBlockerSelfPiece implements PieceCellOccupyBlocker {

    @Override
    public boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player) {
        if (cell.isFree()) {
            return false;
        }
        return cell.getCurrentPiece().getColor() == piece.getColor();
    }
}
