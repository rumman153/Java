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

public class CommissionEmployeeFrame extends JFrame {

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
					CommissionEmployeeFrame frame = new CommissionEmployeeFrame();
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
	public CommissionEmployeeFrame() {
		setTitle("Commission Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCommissionEmployee = new JLabel("Commission Employee:");
		lblCommissionEmployee.setBounds(20, 11, 155, 24);
		contentPane.add(lblCommissionEmployee);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(20, 59, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(122, 56, 285, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(20, 93, 46, 14);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 90, 285, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setBounds(20, 132, 88, 14);
		contentPane.add(lblDesignation);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 129, 285, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCommission = new JLabel("Commission:");
		lblCommission.setBounds(20, 168, 88, 14);
		contentPane.add(lblCommission);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 165, 285, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSales = new JLabel("Sales:");
		lblSales.setBounds(20, 203, 46, 14);
		contentPane.add(lblSales);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 200, 285, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText();
				String i=textField_1.getText();
				String d=textField_2.getText();
				double c=Double.parseDouble(textField_3.getText());
				double s=Double.parseDouble(textField_4.getText());
				ActionClass.emps.addNewEmployee(n, i, d, c, s);
				
				JOptionPane.showMessageDialog(null,"Employee added successfully");
				
				ObjectOutputStream os = null;
				try {
					os= new ObjectOutputStream (new FileOutputStream (ActionClass.fileName));
					os.writeObject(ActionClass.emps);
					
				}
				
				catch(Exception e2) {
					System.out.println("No Data Found");
				}
			}
		});
		btnEnter.setBackground(new Color(0, 250, 154));
		btnEnter.setBounds(20, 231, 88, 23);
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
		btnBackToHome.setBounds(144, 231, 161, 23);
		contentPane.add(btnBackToHome);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee frame = new AddEmployee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(new Color(0, 250, 154));
		btnBack.setBounds(343, 231, 81, 23);
		contentPane.add(btnBack);
	}

}
