package chess.chess.moves;


import java.util.ArrayList;
import java.util.List;

import chess.chess.conditions.MoveBaseCondition;
import chess.chess.conditions.PieceCellOccupyBlocker;
import chess.chess.conditions.PieceMoveFurtherCondition;
import chess.chess.model.Board;
import chess.chess.model.Cell;
import chess.chess.model.Piece;
import chess.chess.model.Player;

public class PossibleMovesProviderHorizontal extends PossibleMovesProvider {

    public PossibleMovesProviderHorizontal(int maxSteps, MoveBaseCondition baseCondition,
                                           PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
    }

    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, final Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> result = new ArrayList<>();
        result.addAll(findAllNextMoves(piece, board::getLeftCell, board, additionalBlockers, player));
        result.addAll(findAllNextMoves(piece, board::getRightCell, board, additionalBlockers, player));
        return result;
    }
}
