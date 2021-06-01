package DAY_4;

public class AbstractionAudi {
	int fuel = 20;
	int maxFuelCapacity = 25;

	public static void main(String[] args) {
		AbstractionAudi audi = new AbstractionAudi();
		audi.fuelAudi();
		audi.fuelAudi();
		audi.fuelAudi();
		audi.fuelAudi();
		audi.fuelAudi();
		audi.runAudi();
	}

	void fuelAudi() {
		if (maxFuelCapacity > fuel) {
			fuel += 1;
			System.out.println("Fuel: " + fuel);
		} else {
			System.out.println("Fuel Capacity is reached: " + fuel);
		}
	}

	void runAudi() {
		for (int i = fuel; i > 0; i--) {
			if (i > 1) {
				fuel--;
				System.out.println("Fuel: " + fuel);
			} else {
				System.out.println("Please Fuel Up Car. ");
				break;
			}
		}
	}
}
