package chess.chess.conditions;

import chess.chess.model.Board;
import chess.chess.model.Cell;
import chess.chess.model.Piece;
import chess.chess.model.Player;

/**
 * This check tells whether a piece can occupy a given cell in the board or not.
 */
public interface PieceCellOccupyBlocker {

    boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player);
}
