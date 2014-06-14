package com.vanaras;

public class MineCell implements Cell {
	private boolean status = false;

	@Override
	public int open() {
		// TODO Auto-generated method stub
		setStatus(true);
		return -1;
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
		if(isOpen()) return "*";
		return "M";
	}
}
