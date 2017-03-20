public class Box{
	private int length;
	private int breadth;
	private int height;
	private float radius;

	//private int Area;
	//private float Area;


	//AREA OF SQUARE
	public Box(){
		int length=5;
		int Area=length*length;
		System.out.println("Area of Square with length is " + Area);
	}

	//AREA OF RECTANGLE
	public Box(int length, int breadth){
		int Area=length*breadth;
		System.out.println("Area of Rectangle  is " + Area);
	}

	//AREA OF CIRCLE
	public Box(float radius){
		float Area=(3.14f)*radius*radius;
		System.out.println("Area of Circle : " + Area);
	}

	//VOLUME OF BOX
	public Box(int length, int breadth , int height){
		int Vol=length*breadth*height;
		System.out.println("Volume of Rectangle : " +Vol);
	}

}