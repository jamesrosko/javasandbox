package com.jamesrosko.patterns.wrapper;

public class CupImpl implements Cup {

	boolean hasLiquid;

	public void fill() {
		hasLiquid = true;
	}

	public void drink() {
		hasLiquid = false;

	}

	public boolean isEmpty() {
		return !hasLiquid;
	}

}
