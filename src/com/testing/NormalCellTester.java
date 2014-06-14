package com.testing;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vanaras.NormalCell;

public class NormalCellTester {
	private NormalCell normalCell;

	@Before
	public void setUp() throws Exception {
		normalCell = new NormalCell();
	}

	@Test
	public void open() {
		Assert.assertEquals(0, normalCell.open());
	}

	@After
	public void tearDown() throws Exception {
		normalCell = null;
	}

}
