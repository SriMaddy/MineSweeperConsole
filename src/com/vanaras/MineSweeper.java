package com.vanaras;

import java.io.IOException;
import java.util.Scanner;

public class MineSweeper {

	private static Maze maze;

	public static void main(String[] args) {

		new MineSweeper().play();
	}

	public MineSweeper() {
		// TODO Auto-generated constructor stub
		char[][] cellValues = new char[3][3];
		System.out.println("Please enter a 3 x 3 maze values");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				readChar(cellValues, i, j);
			}

		}
		MazeBuilder builder = new MazeBuilder(cellValues);
		maze = builder.build();
	}

	private void play() {
		// TODO Auto-generated method stub
		printMaze();
		Scanner scanner = new Scanner(System.in);
		while (!maze.isAllNormalCellOpened()) {
			System.out
					.println("Enter row number and column number to open a cell: ");
			open(scanner.nextInt(), scanner.nextInt());
		}
	}

	public void printMaze() {
		maze.show();
	}

	public void open(int row, int column) {
		int openedType = maze.open(row, column);
		printMaze();
		if (openedType == -1) {
			System.out.println("You Lost the Game");
			System.exit(0);
		}

	}

	private void readChar(char[][] cellValues, int i, int j) {
		try {
			cellValues[i][j] = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
