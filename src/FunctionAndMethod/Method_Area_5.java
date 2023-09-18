package FunctionAndMethod;

public class Method_Area_5 {

	public static void main(String[] args) {
		
		int area = area2(10,100);
		System.out.println("Print out the area's value: " + area);
		if(area > 50) {
			System.out.println("Huge room");
		}
		else {
				System.out.println("Standard room size");
		}
		
		
	}
	public static int area2(int width, int length) {
		int area = width*length;
		return area;
	}

}
