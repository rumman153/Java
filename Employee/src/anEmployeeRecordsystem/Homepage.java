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

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Homepage() {
		setTitle("Employee Record System By Rumman Ahmed Prodhan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.setBounds(45, 34, 165, 48);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddEmployee frame = new AddEmployee();
				frame.setVisible(true);
				dispose();
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnSalaryInformation = new JButton("Salary Information");
		btnSalaryInformation.setBackground(new Color(0, 250, 154));
		btnSalaryInformation.setBounds(42, 108, 168, 48);
		btnSalaryInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SalaryInformationFrame frame = new SalaryInformationFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnSalaryInformation);
		
		JButton btnIncreaseSalary = new JButton("Increase Salary");
		btnIncreaseSalary.setBackground(new Color(0, 250, 154));
		btnIncreaseSalary.setBounds(45, 183, 165, 48);
		btnIncreaseSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IncreaseSalaryFrame frame = new IncreaseSalaryFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnIncreaseSalary);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayFrame frame = new DisplayFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		btnDisplay.setBackground(new Color(0, 250, 154));
		btnDisplay.setBounds(237, 34, 157, 48);
		contentPane.add(btnDisplay);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(0, 250, 154));
		btnExit.setBounds(239, 108, 155, 48);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnExit);
	}
}
