package inheritances;

public class employee {
	
	protected String name;
	protected String emailAddress;
	protected String phone;
	protected String department;
	protected String address;
	protected int  yearOfBrith;
	
	protected employee(String name, String emailAddress, String phone, String department, String address,
			int yearOfBrith) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.phone = phone;
		this.department = department;
		this.address = address;
		this.yearOfBrith = yearOfBrith;
	}

	
	
	public employee() {
		System.out.println("No parameter Constractor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYearOfBrith() {
		return yearOfBrith;
	}

	public void setYearOfBrith(int yearOfBrith) {
		this.yearOfBrith = yearOfBrith;
	}

}
