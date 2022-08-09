package anEmployeeRecordsystem;

public class HourlyEmployee extends Employee{

	       
		public double hourlyRate;
		public int hourWorked;
		
		public HourlyEmployee(String name, String id, String designation, double hourlyRate, int hourWorked) {
			super(name, id, designation);
			this.hourlyRate = hourlyRate;
			this.hourWorked = hourWorked;
		}
		
		@Override
		public void increaseSalary(double amt) {
			hourlyRate+=amt;
		}

		@Override
		public double getSalary() {
			return hourlyRate*hourWorked;
		}
		
		@Override
		public void display() {
			System.out.println(" Name: " + name + "\n Id: " + id + "\n Designation: " + designation);
		
		}
		@Override
		public String toString() {
			return " Name: "+ name + " Id: " + id + " Designation: " + designation + "Salary: " + hourlyRate*hourWorked;
		}
		
	}


