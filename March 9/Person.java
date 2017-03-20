public class Person{

	private String name;
	private String address;

	public void getDetails(String name, String address){
			this.name=name;
			this.address=address;
	}

	public void printDetails(){
			System.out.println("Name:"+this.name);
			System.out.println("Address:"+this.address);
	}

}