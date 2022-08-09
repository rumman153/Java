package anEmployeeRecordsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SalariedEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalariedEmployeeFrame frame = new SalariedEmployeeFrame();
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
	public SalariedEmployeeFrame() {
		setTitle("Salaried Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(86, 39, 316, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 78, 316, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 115, 318, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(30, 11, 46, 14);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 42, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 81, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setBounds(10, 118, 66, 14);
		contentPane.add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(10, 166, 46, 14);
		contentPane.add(lblSalary);
		
		textField_3 = new JTextField();
		textField_3.setBounds(86, 163, 316, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBackToHome = new JButton("Back to Home Page");
		btnBackToHome.setBackground(new Color(0, 250, 154));
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBackToHome.setBounds(145, 212, 159, 38);
		contentPane.add(btnBackToHome);
		
		JLabel lblSalariedEmployee = new JLabel("Salaried Employee");
		lblSalariedEmployee.setBounds(10, 0, 125, 32);
		contentPane.add(lblSalariedEmployee);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n=textField.getText();
				String i=textField_1.getText();
				String d=textField_2.getText();
				double s=Double.parseDouble(textField_3.getText());
				ActionClass.emps.addNewEmployee(n, i, d, s);
				JOptionPane.showMessageDialog(null,"Employee added successfully");
				ObjectOutputStream os = null;
				try {
					os= new ObjectOutputStream (new FileOutputStream (ActionClass.fileName));
					os.writeObject(ActionClass.emps);
					
				}
				
				catch(Exception e) {
					System.out.println("No Data Found");
				}
			}
		});
		btnNewButton.setBounds(10, 212, 101, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddEmployee frame = new AddEmployee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 250, 154));
		btnNewButton_1.setBounds(335, 212, 89, 38);
		contentPane.add(btnNewButton_1);
	}
}
