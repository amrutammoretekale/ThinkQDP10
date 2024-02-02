package com.methodoverloading;
//overloading cannot be done only on the basis of return type

// If the method is already overloaded on the basis of parameters
// then it does not matter what the return type is

class Shape {
//	int void area(int side) {
//		System.out.println("Area of Sqr:" + (side * side));
//	}

	static void area(int length, int breadth) {
		System.out.println("Area of Rect:" + (length * breadth));
	}

	protected static float area(float radius) {
		// System.out.println("Area of circle:"+(3.14*radius*radius));
		return (float) (3.14 * radius * radius);

	}

	public class DemoPoly1 {

//	 we can not call ouside the class
		void area(float base, float height) {
			System.out.println("Area of rect:" + (0.5 * base * height));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Shape s1 = new Shape();
     		Shape.area(9);
//   	        s1.area(7.5f);
//   	        s1.area(6, 4);
			System.out.println("Area of circle:" + Shape.area(7.5f));
			Shape.area(6, 7);
			System.out.println("-------------------");
			DemoPoly1.main(90);
		}

		// we can overload main method because main method is static and loaded during
		// compile time
		// But JVM alaways call main method with String argmennts
		// if we want to call other main methd we call it explicitly
		public static void main(int Data) {
			System.out.println("Overloaded main");
			System.out.println("Data:" + Data);
		}

	}
}
