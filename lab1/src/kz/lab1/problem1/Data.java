package kz.lab1.problem1;

import java.util.NoSuchElementException;

public class Data {

	private double sum;
	private double max = Double.NEGATIVE_INFINITY;
	private int count;
	
	public Data() {
	}
	
	public void addValue(double value) {
		sum += value;
		if (value > max || count == 0) {
			max = value;
		}
		count++;
	}
	
	public double getAverage() {
		if (count == 0) {
			return 0.0;
		}
		return sum / count;
	}
	
	public double getMaximum() {
		if (count == 0) {
			throw new NoSuchElementException("No data available.");
		}
		return max;
	}
	
	@Override
	public String toString() {
		return String.format("Data{count=%d, sum=%.2f, max=%.2f, average=%.2f}", count, sum, max, getAverage());
	}

}
