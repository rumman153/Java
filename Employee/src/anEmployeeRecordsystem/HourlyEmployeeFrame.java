package anEmployeeRecordsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HourlyEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HourlyEmployeeFrame frame = new HourlyEmployeeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HourlyEmployeeFrame() {
		setTitle("Hourly Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHourlyEmployee = new JLabel("Hourly Employee:");
		lblHourlyEmployee.setBounds(33, 11, 98, 20);
		contentPane.add(lblHourlyEmployee);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(33, 53, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(105, 50, 303, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(33, 89, 46, 14);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 86, 303, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setBounds(33, 119, 71, 14);
		contentPane.add(lblDesignation);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 117, 303, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblHourlyrate = new JLabel("HourlyRate:");
		lblHourlyrate.setBounds(33, 154, 71, 14);
		contentPane.add(lblHourlyrate);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 151, 303, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHourlyWorked = new JLabel("Hourly Worked:");
		lblHourlyWorked.setBounds(33, 185, 71, 14);
		contentPane.add(lblHourlyWorked);
		
		textField_4 = new JTextField();
		textField_4.setBounds(105, 182, 303, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText();
				String i=textField_1.getText();
				String d=textField_2.getText();
				double hr=Double.parseDouble(textField_3.getText());
				int hw=Integer.parseInt(textField_4.getText());
				ActionClass.emps.addNewEmployee(n, i, d,hr,hw);
				JOptionPane.showMessageDialog(null,"Employee added successfully");
				
				
				ObjectOutputStream os = null;
				try {
					os= new ObjectOutputStream (new FileOutputStream (ActionClass.fileName));
					os.writeObject(ActionClass.emps);
					
				}
				
				catch(Exception e1) {
					System.out.println("No Data Found");
				}
			}
				
				
		});
		btnEnter.setBackground(new Color(0, 250, 154));
		btnEnter.setBounds(21, 210, 98, 40);
		contentPane.add(btnEnter);
		
		JButton btnBackToHome = new JButton("Back To Home Page");
		btnBackToHome.setBackground(new Color(0, 250, 154));
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBackToHome.setBounds(159, 210, 148, 40);
		contentPane.add(btnBackToHome);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 250, 154));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee frame = new AddEmployee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(335, 210, 89, 40);
		contentPane.add(btnBack);
	}

}
