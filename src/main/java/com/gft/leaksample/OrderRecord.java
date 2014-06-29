package com.gft.leaksample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;


public class OrderRecord implements Runnable {

	private final BlockingQueue<Order> orderQueue;

	public OrderRecord(BlockingQueue<Order> orderQueue) {
		this.orderQueue = orderQueue;
	}

	public void start() {

		Thread thread = new Thread(this, "Order Database Recorder");
		thread.start();
	}

	@Override
	public void run() {

		while (true) {

			try {
				Order order = orderQueue.take();
				recordOrder(order);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @Description Mocking insertion of records/orders in the database.
         * It pauses the thread for a second simulating the database operation.
	 * @param order The order
	 * @throws InterruptedException
	 */
	public void recordOrder(Order order) throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
	}

}
