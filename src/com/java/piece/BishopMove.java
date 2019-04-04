package com.java.piece;

import com.java.Piece;

public class BishopMove implements Piece {

	@Override
	public boolean move(int srcX, int srcY, int destX, int destY, char color, String[][] board) {
		if(board[destX][destY].charAt(0) != color && Math.abs(destX - srcX) == Math.abs(destY - srcY))
			return true;
		return false;
	}

}
