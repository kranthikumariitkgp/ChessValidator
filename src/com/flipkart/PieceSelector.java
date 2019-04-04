package com.flipkart;

import com.flipkart.piece.*;

public class PieceSelector {
	
	PawnMove p = new PawnMove();
	HorseMove h = new HorseMove();
	BishopMove b = new BishopMove();
	KingMove k = new KingMove();
	RookMove r = new RookMove();
	
	public boolean pieceSelector(char c, int srcX, int srcY, int destX, int destY, char color, String [][]board) {
		if(c == 'P')
			return p.move(srcX, srcY, destX, destY, color, board);
		else if (c == 'H')
			return h.move(srcX, srcY, destX, destY, color, board);
		else if (c == 'B')
			return b.move(srcX, srcY, destX, destY, color, board);
		else if (c == 'K')
			return k.move(srcX, srcY, destX, destY, color, board);
		else if (c == 'Q')
			//Queen Move is similar to either RookMove or Bishop Move
			return r.move(srcX, srcY, destX, destY, color, board)||b.move(srcX, srcY, destX, destY, color, board);
		else if (c == 'R')
			return r.move(srcX, srcY, destX, destY, color, board);
		return false;	
	}
}