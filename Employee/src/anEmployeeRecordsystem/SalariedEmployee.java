package anEmployeeRecordsystem;

public class SalariedEmployee extends Employee{

		public double monthlySalary;

		public SalariedEmployee(String name, String id, String designation, double monthlySalary) {
			super(name, id, designation);
			this.monthlySalary = monthlySalary;
		}
		

		public void increaseSalary(double amt) {
			monthlySalary+=amt;
		}

		public double getSalary() {
			return monthlySalary;
		}
		
		/*public void display() {
			System.out.println(" Name: " + name + "\n Id: " + id + "\n Designation: " + designation);
		}*/
		public String toString() {
			return " Name: "+ name + " Id: " + id + " Designation: " + designation + "Salary: " + monthlySalary;
		}

	}

