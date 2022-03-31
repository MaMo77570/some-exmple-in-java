package inheritances;

public class developer extends employee{ // form employee take some features
      String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public developer(String name, String emailAddress, String phone, String department, String address,
			int yearOfBrith, String projectName )  // we call the class in the employee files
	{
			
		super(name, emailAddress, phone ,department, address, yearOfBrith); // we use super to get all the(this) ad it's better than writing this.name...ets
		this.projectName= projectName;
		
	}
}
