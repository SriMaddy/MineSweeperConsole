package com.vanaras;

public class NormalCell implements Cell {

	private boolean status;

	@Override
	public int open() {
		setStatus(true);
		return 0;
	}

	private void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return status;
	}
	
	public String toString(){
		if(isOpen()) return "O";
		return "X";
	}

}
