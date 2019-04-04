package com.java;

public abstract class AbstractClass implements ChessConstants {

	public boolean isColorValid(String input) {
		boolean temp = false;
		if (input.equalsIgnoreCase(WHITE_COLOR) || input.equalsIgnoreCase(BLOCK_COLOR))
			temp = true;
		return temp;
	}

	public boolean isPieceValid(String input) {
		boolean temp = false;
		if (input.equalsIgnoreCase(ROOK_PIECE) || input.equalsIgnoreCase(Bishop_PIECE)
				|| input.equalsIgnoreCase(HORSE_PIECE) || input.equalsIgnoreCase(KING_PIECE)
				|| input.equalsIgnoreCase(Queen_PIECE) || input.equalsIgnoreCase(PAWN_PIECE))
			temp = true;
		return temp;
	}

	public boolean checkSourceNotEmpty(String input) {
		boolean temp = false;
		if (input.charAt(0) != '-' && input.charAt(1) != '-')
			temp = true;
		return temp;
	}

	public boolean checkDestinationInBoard(String input) {
		boolean temp = false;
		int x = Character.getNumericValue(input.charAt(0));
		int y = Character.getNumericValue(input.charAt(1));
		if((x >= 0 && x<8) && (y >= 0 && y<8))
			temp = true;
		return temp;
	}
}
