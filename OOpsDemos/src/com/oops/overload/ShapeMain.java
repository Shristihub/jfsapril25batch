package com.oops.overload;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(10);
//		shape.area((int)10.88);
		shape.area(10.88);
		
		int rect =(int)shape.area(10, 20);
		System.out.println("Rect"+ rect);
		
		float tri=shape.area(10, (int)10.16f);
		System.out.println("Tri... "+tri);
	}

}
