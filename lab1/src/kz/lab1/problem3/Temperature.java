package kz.lab1.problem3;

public class Temperature {
	
	private double value;
	private char scale;
	
	public Temperature() {
		this.value = 0;
		this.scale = 'C';
	}
	
	public Temperature(double value) {
		this.value = value;
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0;
		this.scale = scale;
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public double getCelsius() {
		if (scale == 'C') return value;
		return 5 * (value - 32) / 9;
	}
	
	public double getFahrenheit() {
		if (scale == 'F') return value;
		return (9 * (value / 5)) + 32;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
		this.scale = Character.toUpperCase(scale);
	}
	
	public void setBoth(double value, char scale) {
		this.value = value;
		this.scale = Character.toUpperCase(scale);
	}
	
	public char getScale() {
		return scale;
	}
	
	@Override
	public String toString() {
		return String.format("%.1f°%c", value, scale);
	}
}