package com.vanaras;

public class Maze {
	private Cell[][] cells;

	public Maze(Cell[][] cells) {
		this.cells = cells;
	}

	public int open(int row, int column) {
		int type = 0;
		if (!cells[row][column].isOpen())
			type = cells[row][column].open();

		return type;
	}

	public void show() {
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				System.out.print(cells[i][j].toString() + " ");
			}
			System.out.println("");
		}
	}

	public boolean isAllNormalCellOpened() {
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				if (cells[i][j].isOpen() == false)
					return false;
			}
		}
		return true;
	}
}
