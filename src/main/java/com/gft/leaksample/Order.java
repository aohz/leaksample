package com.gft.leaksample;

import java.util.Arrays;


public class Order {

	private final int id;

	private final String code;

	private final int amount;

	private final double price;

	private final long time;

	private final long[] padding;

	/**
	 * @param id The order id
	 * @param code The stock code
	 * @param amount The number of shares
	 * @param price The price of the share
	 * @param time The transaction time
	 */
	public Order(int id, String code, int amount, double price, long time) {
		super();
		this.id = id;
		this.code = code;
		this.amount = amount;
		this.price = price;
		this.time = time;
		// This only makes the Order object bigger so that
		// the heap problem appears more quickly.
		this.padding = new long[3000];
		Arrays.fill(padding, 0, padding.length - 1, -2);
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public int getAmount() {
		return amount;
	}

	public double getPrice() {
		return price;
	}

	public long getTime() {
		return time;
	}

}
