package com.flipkart.piece;

import com.flipkart.Piece;

public class RookMove implements Piece {

	@Override
	public boolean move(int srcX, int srcY, int destX, int destY, char color, String[][] board) {
		if((board[destX][destY].charAt(0) != color && srcX == destX) || (board[destX][destY].charAt(0) != color && srcY == destY) )
			return true;
		return false;
	}

}
