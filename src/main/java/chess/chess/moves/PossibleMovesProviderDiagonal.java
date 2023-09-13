package chess.chess.moves;


import java.util.List;

import chess.chess.conditions.MoveBaseCondition;
import chess.chess.conditions.PieceCellOccupyBlocker;
import chess.chess.conditions.PieceMoveFurtherCondition;
import chess.chess.model.Board;
import chess.chess.model.Cell;
import chess.chess.model.Piece;
import chess.chess.model.Player;

public class PossibleMovesProviderDiagonal extends PossibleMovesProvider {


    public PossibleMovesProviderDiagonal(int maxSteps, MoveBaseCondition baseCondition,
                                         PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
    }

    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        return null;
    }
}
