package anEmployeeRecordsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddEmployee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}/*

	/**
	 * Create the frame.
	 */
	public AddEmployee() {
		setTitle("Add Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalariedEmployee = new JButton("Salaried Employee");
		btnSalariedEmployee.setBackground(new Color(0, 250, 154));
		btnSalariedEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SalariedEmployeeFrame frame = new SalariedEmployeeFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSalariedEmployee.setBounds(138, 11, 189, 37);
		contentPane.add(btnSalariedEmployee);
		
		JButton btnNewButton = new JButton("Hourly Employee");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HourlyEmployeeFrame frame = new HourlyEmployeeFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(138, 59, 189, 37);
		contentPane.add(btnNewButton);
		
		JButton btnCommissionEmployee = new JButton("Commission Employee");
		btnCommissionEmployee.setBackground(new Color(0, 250, 154));
		btnCommissionEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CommissionEmployeeFrame frame = new CommissionEmployeeFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCommissionEmployee.setBounds(138, 110, 189, 37);
		contentPane.add(btnCommissionEmployee);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBackground(new Color(0, 250, 154));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(138, 158, 189, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnBackToHome = new JButton("Back To Home Page");
		btnBackToHome.setBackground(new Color(0, 250, 154));
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBackToHome.setBounds(138, 206, 189, 34);
		contentPane.add(btnBackToHome);
	}

}
