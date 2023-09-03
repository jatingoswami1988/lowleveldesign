package tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

	Deque<Player> players;
	Board gameBoard;

	public TicTacToeGame() {
		initializeGame();
	}

	private void initializeGame() {

		players = new LinkedList<>();

		PlayerX playerX = new PlayerX();
		Player p1 = new Player("Player1", playerX);

		PlayerO playerO = new PlayerO();
		Player p2 = new Player("Player2", playerO);

		players.add(p1);
		players.add(p2);

		gameBoard = new Board(3);

	}

	@SuppressWarnings("resource")
	public String startGame() {
		boolean noWinner = true;
		while (noWinner) {
			Player playerTurn = players.removeFirst();
			gameBoard.printBoard();
			if(!gameBoard.getFreeSpace()) {
				noWinner = false;
				continue;
			}
			System.out.println("Player:" + playerTurn.getName() + " Enter row , column ");
			Scanner inputScanner = new Scanner(System.in);
			String input = inputScanner.nextLine();
			String[] value = input.split(",");
			int row = Integer.valueOf(value[0]);
			int col = Integer.valueOf(value[1]);

			boolean pieceAddedSuccessfully = gameBoard.addPiece(row, col, playerTurn.playingPiece);
			if (!pieceAddedSuccessfully) {
				System.out.println("Incorrect position entered, try again");
				players.add(playerTurn);
			}
			players.addLast(playerTurn);
			if (isWinner(row, col, playerTurn.playingPiece.pieceType)) {
				return playerTurn.name;
			}
		}
		return "TIE";
	}

	// can use n queen problem
	private boolean isWinner(int row, int col, PieceType pieceType) {
		
		return false;
	}

}
