package inheritence;

public abstract class Employee {

	String name;
	String id;

	void pay() {
		System.out.println("Pay an Employee");

	}

	void terminate() {
		System.out.println("Terminate the Employee");
	}

	void bonus() {
		System.out.println("Pay 3.5% Bonus");
	}

}
