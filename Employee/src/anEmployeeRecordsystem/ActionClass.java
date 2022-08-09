package anEmployeeRecordsystem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.DefaultListModel;

public class ActionClass {
	static UapCSE emps =null;
	static Homepage frame1 = new Homepage();
	static AddEmployee frame2 = new AddEmployee();
	static SalariedEmployeeFrame frame3 = new SalariedEmployeeFrame();
	static CommissionEmployeeFrame frame4 = new CommissionEmployeeFrame();
	static HourlyEmployeeFrame frame5 = new HourlyEmployeeFrame();
	static IncreaseSalaryFrame frame6 = new IncreaseSalaryFrame();
	static IncreaseSalaryFrame frame7 = new IncreaseSalaryFrame();
	static DisplayFrame frame8 = new DisplayFrame();
	
	static DefaultListModel<String>employee=new DefaultListModel<String>();
	static String fileName="C:\\Users\\MASH\\eclipse-workspace\\Employee\\EmployeeDataBase.txt";
	
	public static void main(String[] args) {
		frame1.setVisible(true);
		
		ObjectInputStream ois = null;
		try {	
			ois = new ObjectInputStream (new FileInputStream (fileName));
			emps= (UapCSE)ois.readObject();	
		}
		catch(Exception e) {
		emps= new UapCSE();
		}
		
		
		finally {
			try {
				ois.close(); 
				
			}
			catch (Exception o) {
				System.out.println(o);
			}
		}

	}


}
