package com.vanaras;

public class MazeBuilder {
	private char[][] cellValues;
	private Maze maze;
	private Cell[][] cells;

	public MazeBuilder(char[][] cellValues) {
		// TODO Auto-generated constructor stub
		this.cellValues = cellValues;

	}

	public Maze build() {
		if (maze != null)
			return maze;
		cells = new Cell[cellValues.length][cellValues[0].length];
		for (int i = 0; i < cellValues.length; i++) {
			for (int j = 0; j < cellValues[0].length; j++) {
				switch (cellValues[i][j]) {
				case 'X':
					cells[i][j] = new NormalCell();
					break;

				case 'M':
					cells[i][j] = new MineCell();
					break;
				}
			}

		}
		maze = new Maze(cells);
		return maze;
	}

}
