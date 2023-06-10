package com.Microservice.limitservice.bean;

public class Limits {
	private int mininum;
	private int maximum;

	public int getMininum() {
		return mininum;
	}

	public void setMininum(int mininum) {
		this.mininum = mininum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Limits(int mininum, int maximum) {
		super();
		this.mininum = mininum;
		this.maximum = maximum;
	}

}
