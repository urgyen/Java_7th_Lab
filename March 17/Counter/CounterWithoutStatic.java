public class CounterWithoutStatic{
static	int Count=0;

	public CounterWithoutStatic(){
		Count++;

	}

	private void showCount(){
		System.out.println(Count);
	}

	public static void main(String[] args){


		//cant access Private class
		//CounterWithoutStatic cs1 = new CounterWithoutStatic();
		//CounterWithoutStatic cs2 = new CounterWithoutStatic();
		//CounterWithoutStatic cs3 = new CounterWithoutStatic();

		//cs1.showCount();
		//cs2.showCount();
		//cs3.showCount();

		// constructor class wala logic
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
		new CounterWithoutStatic().showCount();
	}
}