package abstracted;

public abstract class Car {
	float height;
	float weight;
	int numberOfWheel;
	
////////////////////////////////// we created it , so the child can get it from here	
	abstract void autopilot();
	abstract void stremingServices();
	abstract void parkingSensors();
////////////////////////////////////////
	public Car(float height, float weight, int numberOfWheel) {
		super();
		this.height = height;
		this.weight = weight;
		this.numberOfWheel = numberOfWheel;
	}	
////////////////////////////////////////////	
public Car() {
		 
	}
////////////////////////////////////////
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getNumberOfWheel() {
		return numberOfWheel;
	}
	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
//////////////////////////////////////////////	
}
