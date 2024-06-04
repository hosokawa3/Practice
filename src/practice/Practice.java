package practice;

public class Practice {
	public static int add(int x, int y) {
		return x + y;
	}
	public static double add(double x, double y) {
		return x + y;
	}
	public static String add(String x, String y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(5, 3));
		System.out.println(add(2.5, 3.1));
		System.out.println(add("hello", "world"));
	}
}