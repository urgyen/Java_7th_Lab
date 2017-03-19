public class CreditCard{
	public String name;
	//public String address;
	public double number;

		   String items;

	private int pin_no;
	private int ccvi;




public void buyStuff(String items){
	this.items=items;

}

public void buy(String name, double number){
	this.name=name;
	this.number=number;
}

public void printPublic(){

		System.out.println("You bought : "+items);
		System.out.println("Name : "+name);
		System.out.println("Number : "+number);
}

public void pay(int pin_no, int ccvi){
	this.pin_no=pin_no;
	this.ccvi=ccvi;

}

public void printPrivate(){

		System.out.println("Pin no : "+pin_no);
		System.out.println("ccvi no : "+ccvi);

}
//end of class
}