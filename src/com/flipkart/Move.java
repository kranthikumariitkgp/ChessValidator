package com.flipkart;

public class Move extends AbstractClass {

	PieceSelector ps = new PieceSelector();
	
	public boolean isValidMove(String move, String [][]board) {
		String[] moveArray = move.trim().split(" ");
		String type = moveArray[0];
		String source = moveArray[1];
		String destination = moveArray[2];
		int srcX = Character.getNumericValue(source.charAt(0));
		int srcY = Character.getNumericValue(source.charAt(1));
		int destX = Character.getNumericValue(destination.charAt(0));
		int destY = Character.getNumericValue(destination.charAt(1));

		if (isColorValid(String.valueOf(type.charAt(0))) && isPieceValid(String.valueOf(type.charAt(1)))
				&& checkSourceNotEmpty(source) && checkDestinationInBoard(destination)) {
			char piece = type.charAt(1);
			char color = type.charAt(0);
			return ps.pieceSelector(piece, srcX, srcY, destX, destY, color, board);
		}
		return false;

	}

	public String[][] alterBoard(String[][] board, String move) {
		String[] moveArray = move.trim().split(" ");
		String type = moveArray[0];
		String source = moveArray[1];
		String destination = moveArray[2];
		int srcX = Character.getNumericValue(source.charAt(0));
		int srcY = Character.getNumericValue(source.charAt(1));
		int destX = Character.getNumericValue(destination.charAt(0));
		int destY = Character.getNumericValue(destination.charAt(1));
		
		board[srcX][srcY] = "--";
		board[destX][destY] = type;
		
		return board;
	}

}
