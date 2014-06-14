package com.testing;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vanaras.MineCell;

public class MineCellTesterTest {
	private MineCell mineCell;

	@Before
	public void setUp() throws Exception {
		mineCell = new MineCell();
	}

	@Test
	public void open() {
		Assert.assertEquals(-1, mineCell.open());
	}

	@After
	public void tearDown() throws Exception {
		mineCell = null;
	}

}
