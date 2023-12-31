package chess.chess.model;


import java.util.List;

import chess.chess.exceptions.PieceNotFoundException;
import chess.gameplay.contracts.PlayerMove;
import lombok.Getter;

/**
 * Abstract model class representing a player. This is abstract because we are not sure how player is going to make his
 * move. If the player is a local player, then he can move locally. A player can also be a network based player.
 * So, depending on the type of player, he can make move in its own way.
 */
public abstract class Player {
    List<Piece> pieces;

    public List<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

	public Player(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public Piece getPiece(PieceType pieceType) {
        for (Piece piece : getPieces()) {
            if (piece.getPieceType() == pieceType) {
                return piece;
            }
        }
        throw new PieceNotFoundException();
    }

    abstract public PlayerMove makeMove();
}
