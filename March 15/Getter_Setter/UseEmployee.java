public class UseEmployee{
		public static void main(String[] args){
			Employee Harry= new Employee();
			Harry.setName("ASASDASD");
			//Harry.getName();

			Harry.setID(12);
			//Harry.getID();

			Harry.setAddress("ASassa");
			//Harry.getAddress();

			Harry.setSalary(12312);
			//Harry.getSalary();


			System.out.println("ID is : "+Harry.getID());
			System.out.println("Name is :"+Harry.getName());
			System.out.println("Address is :"+Harry.getAddress());
			System.out.println("Salary us :"+Harry.getSalary());
		}

}