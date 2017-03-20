public class Employee{
	private String name;
	private int employeeID;
	private String address;
	private double salary;

			//name
			//setter
			public void setName(String name){
				this.name=name;
			}

			//getter
			public String getName(){
				return this.name;
				//System.out.println(name);
			}

	//employeeID
	//setter
	public void setID(int employeeID){
		this.employeeID=employeeID;
	}

	//getter
	public int getID(){
		return this.employeeID;
		//System.out.println(employeeID);
	}




	//Address
	//setter
	public void setAddress(String address){
		this.address=address;
	}

	//getter
	public String getAddress(){
		return this.address;
	}


			//salary
			//setter
			public void setSalary(double salary){
				this.salary=salary;
			}

			//getter
			public double getSalary(){
				return this.salary;

			}




}