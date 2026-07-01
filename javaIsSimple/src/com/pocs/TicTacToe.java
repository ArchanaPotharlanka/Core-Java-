package com.pocs;

import java.util.Scanner;

public class TicTacToe {
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char currentPlayer = 'x';
		while (true) {
			printingBoard();
			System.out.println(currentPlayer + " turn");
			System.out.println("Enter the row :");
			int row = sc.nextInt();
			System.out.println("Enter the column :");
			int col = sc.nextInt();

			if (row > 2 || col > 2 || row < 0 || col < 0) {
				System.out.println("Invalid positions");
				continue;

			} else {
				if (board[row][col] != ' ') {
					System.out.println("Cell is already occupied. Choose another position.");
					continue;
				}
				board[row][col] = currentPlayer;

			}
			if (checkWinner(currentPlayer)) {
				System.out.println(currentPlayer + " is winner ");
				break;
			}

			if (isBoardFull()) {
				System.out.println("Draw");
				break;
			}
			currentPlayer = currentPlayer == 'x' ? 'o' : 'x';
		}

	}

	static boolean checkWinner(char currentPlayer) {
		boolean status = false;
		// for columns
		for (int i = 0; i < 3; i++) {
			if ((board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
				status = true;
				break;
			}

		}
		// for rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				status = true;
				break;
			}

			// for diagonals
			if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
				status = true;
				break;
			}

			if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
				status = true;
				break;
			}

		}
		return status;
	}

	static boolean isBoardFull() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}

		}
		return true;

	}

	static void printingBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.print("---------");
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " |");

			}
			System.out.println();

		}
		System.out.println("---------");
	}

}
