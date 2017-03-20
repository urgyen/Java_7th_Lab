public class Static101{
	//static int a=80;
	public static  void main(String[] args){

	//a=90;
	//System.out.println(a);

	//Static1.num2=5;
	System.out.println(Static1.num2);

	//Static1.num2=44;

		Static1 obj1=new Static1();
		Static1 obj2=new Static1();
		Static1 obj3=new Static1();

		obj1.num1=11;
		obj2.num1=12;
		obj3.num1=99;

		System.out.println(Static1.num2);

		System.out.println("__________________________________________");
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		System.out.println(obj3.num1);
	}
}