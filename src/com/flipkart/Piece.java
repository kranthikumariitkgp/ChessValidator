package com.flipkart;

public interface Piece {

	boolean move(int srcX, int srcY, int destX, int destY, char color, String[][] board);
}
