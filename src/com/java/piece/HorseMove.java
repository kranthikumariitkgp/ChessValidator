package com.java.piece;

import com.java.Piece;

public class HorseMove implements Piece{

	@Override
	public boolean move(int srcX, int srcY, int destX, int destY,  char color, String[][] board) {
		boolean temp = false;
		if ((destX == srcX + 2 && destY == srcY +1) || (destX == srcX + 2 && destY == srcY - 1)
				|| (destX == srcX + 1 && destY == srcY + 2) || (destX == srcX + 1 && destY == srcY - 2)
				|| (destX == srcX -1 && destY == srcY - 2) || (destX == srcX - 2 && destY == srcY - 1)
				|| (destX == srcX + 2 && destY == srcY + 1) || (destX == srcX - 2 && destY == srcY + 1)){
			temp = true;
		}
		return temp;
	}
}
