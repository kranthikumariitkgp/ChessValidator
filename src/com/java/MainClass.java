package com.java;

import java.util.Scanner;


public class MainClass implements ChessConstants{	
	public static void main(String[] args) {
		Move m = new Move();
		Scanner sc = new Scanner(System.in);
		//String [][]board = new String[SIZE][SIZE];
		String [][]board =  {{"WR", "WH", "WB", "WQ", "WK","WB","WH","WR"},{"WP", "WP","WP","WP","WP","WP","WP","WP"},
				{"--", "--","--","--","--","--","--","--"}, {"--", "--","--","--","--","--","--","--"}, {"--", "--","--","--","--","--","--","--"},{"--", "--","--","--","--","--","--","--"},
				{"BP", "BP","BP","BP","BP","BP","BP","BP"},
				{"BR", "BH", "BB", "BQ", "BK","BB","BH","BR"}};
//		for(int i =0;i<SIZE;i++) {
//			String row = sc.nextLine();
//            String rowArr[]=row.split(" ");
//            if(row.trim()!="")
//            for(int j=0;j<SIZE;j++) {
//                board[i][j] = rowArr[j];
//            }
//		}
		System.out.println("Board Is in Initial State:");
		displayBoard(board);
		System.out.println("Please provide Move: ");
		String move = "";
		while((move=sc.nextLine()) != null) {
			try{
			if(m.isValidMove(move, board)){
				System.out.println("Board After Move:");
				displayBoard(m.alterBoard(board, move));
			}
			else 
				System.out.println("Error Invalid move");
			System.out.println("Please provide Move: ");
		}
			catch (Exception e) {
				System.out.println("You Provided Invalid Input. Terminating Program.");
				System.exit(0);
			}
		}
}

	private static void displayBoard(String[][] board){
		for(int i =0;i<SIZE;i++) {
			for(int j =0;j<SIZE;j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
			}
		}	
}