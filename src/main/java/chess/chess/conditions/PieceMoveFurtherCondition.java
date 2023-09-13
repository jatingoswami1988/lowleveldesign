package chess.chess.conditions;

import chess.chess.model.Board;
import chess.chess.model.Cell;
import chess.chess.model.Piece;

/**
 * Condition interface to tell whether a piece can further move from a cell.
 */
public interface PieceMoveFurtherCondition {

    boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board);
}
