public class StaticMethodDemo{
	int rollno;
	String name;

	static String college="ABC";

	static void change(){
		college="Samriddhi";
	}

	public StaticMethodDemo(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}

	public void display(){
		System.out.println(this.name + " has a roll number " +this.rollno + " who study a t " +this.college);
	}

}