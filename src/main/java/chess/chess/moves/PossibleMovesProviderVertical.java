package chess.chess.moves;


import static chess.chess.moves.VerticalMoveDirection.BOTH;
import static chess.chess.moves.VerticalMoveDirection.DOWN;
import static chess.chess.moves.VerticalMoveDirection.UP;

import java.util.ArrayList;
import java.util.List;

import chess.chess.conditions.MoveBaseCondition;
import chess.chess.conditions.PieceCellOccupyBlocker;
import chess.chess.conditions.PieceMoveFurtherCondition;
import chess.chess.model.Board;
import chess.chess.model.Cell;
import chess.chess.model.Piece;
import chess.chess.model.Player;;

public class PossibleMovesProviderVertical extends PossibleMovesProvider {
    private VerticalMoveDirection verticalMoveDirection;

    public PossibleMovesProviderVertical(int maxSteps, MoveBaseCondition baseCondition,
                                         PieceMoveFurtherCondition moveFurtherCondition, PieceCellOccupyBlocker baseBlocker,
                                         VerticalMoveDirection verticalMoveDirection) {
        super(maxSteps, baseCondition, moveFurtherCondition, baseBlocker);
        this.verticalMoveDirection = verticalMoveDirection;
    }


    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> result = new ArrayList<>();
        if (this.verticalMoveDirection == UP || this.verticalMoveDirection == BOTH) {
            result.addAll(findAllNextMoves(piece, board::getUpCell, board, additionalBlockers, player));
        }
        if (this.verticalMoveDirection == DOWN || this.verticalMoveDirection == BOTH) {
            result.addAll(findAllNextMoves(piece, board::getDownCell, board, additionalBlockers, player));
        }
        return result;
    }
}
