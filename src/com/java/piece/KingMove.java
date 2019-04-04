package com.java.piece;

import com.java.Piece;

public class KingMove implements Piece {

	@Override
	public boolean move(int srcX, int srcY, int destX, int destY, char color, String[][] board) {
		if (board[destX][destY].charAt(0) != color && (Math.pow(destX-srcX, 2)+Math.pow(destX-srcX, 2))<=2)
			return true;
		return false;
	}

}
