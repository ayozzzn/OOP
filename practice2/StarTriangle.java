package practice2;

public class StarTriangle {
	
	private int width;
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (int i = 1; i <= width; i++) {
			result.append("[*]".repeat(i)).append("\n");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		StarTriangle small = new StarTriangle(3);
		System.out.println(small.toString());
	}
	
}
