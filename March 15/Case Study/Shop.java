public class Shop{
	public static void main(String[] args){

		CreditCard t1= new CreditCard();

		t1.buyStuff("Apple");
		t1.buy("asasd",12300);

		//System.out.println("Item Bought :" +this.itmes);

		t1.printPublic();
		t1.pay(111,222);
		t1.printPrivate();


	}
}