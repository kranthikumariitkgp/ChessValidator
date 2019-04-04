package com.flipkart.piece;

import com.flipkart.Piece;

public class PawnMove implements Piece{

	@Override
	public boolean move(int srcX, int srcY, int destX, int destY, char color, String [][]board) {
			switch(color) {
			case 'W':
				if ((destX == srcX + 1 && destY == srcY) && board[destX][destY] == "--")
					return true;
				else if((destX == srcX + 1 && destY == srcY - 1 && board[destX][destY].charAt(0) == 'B')
					|| (destX == srcX + 1 && destY == srcY + 1 && board[destX][destY].charAt(0) == 'B'))
				   return true;
				else return false;
			case 'B':
				if ((destX == srcX - 1 && destY == srcY) && board[destX][destY] == "--")
					return true;
				else if((destX == srcX - 1 && destY == srcY + 1 && board[destX][destY].charAt(0) == 'W')
					|| (destX == srcX - 1 && destY == srcY - 1 && board[destX][destY].charAt(0) == 'W'))
				   return true;
				else return false;
			default:
				return false;
		}
	}

}
