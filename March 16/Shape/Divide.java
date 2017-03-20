public class Divide{
	private int a;
	private  float b;
		private float c;

	public void div(){
		a=20;
		b=0;
		c=a/b;
		System.out.println(c);
	}

	public void div(int a){
		//a=20;
		b=40.0;
		c=a/b;
		System.out.println(c);
	}

	public void div(int a, float b){
		//a=20;
		//b=40;
		c=a/b;
		System.out.println(c);
	}

}