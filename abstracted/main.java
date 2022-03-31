package abstracted;

public class main {
    
	 static void function(Car obj) {
			obj.autopilot();
		}
///////////////////////////////////////	 
	public static void main(String[] args) {
		
		Car car1 = new SUV();
		function(car1);
		
		car1= new Hatchback();
		function(car1);
	}

}
