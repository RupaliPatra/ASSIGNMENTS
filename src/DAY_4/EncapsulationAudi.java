package DAY_4;

public class EncapsulationAudi {
	int speed = 0;
	String color = "black";

	public static void main(String[] args) {
		EncapsulationAudi audi = new EncapsulationAudi();
		audi.color = "black";
		System.out.println("Audi's Current Speed: "+ audi.speed);
		audi.accelrateSpeed();
		audi.accelrateSpeed();
//		car.breakCar();
		audi.stopAudi();
	}
	
	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}
	
	void breakCar() {
		speed--;
		System.out.println("Break Speed: "+speed);
	}

	void stopAudi() {
		speed = 0;
		System.out.println("Audi Stopped & speed is "+speed);
	}
}
