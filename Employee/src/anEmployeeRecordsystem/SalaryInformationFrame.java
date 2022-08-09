package anEmployeeRecordsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SalaryInformationFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnBackToHome;
	private JTextField textField_1;
	private JLabel lblId;
	private JLabel lblSalary;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		     //UapCSE emp=new UapCSE();

			public void run() {
				try {
					SalaryInformationFrame frame = new SalaryInformationFrame();
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
	public SalaryInformationFrame() {
		setTitle("Salary Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterIdTo = new JLabel("Enter ID to Get Salary Information:");
		lblEnterIdTo.setBounds(10, 11, 211, 35);
		contentPane.add(lblEnterIdTo);
		
		textField = new JTextField();
		textField.setBounds(104, 51, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String i =textField.getText();
				double s=ActionClass.emps.getSalary(i);
				textField_1.setText(String.valueOf(s));

			}
		});
		btnNewButton.setBounds(50, 145, 117, 42);
		contentPane.add(btnNewButton);
		
		btnBackToHome = new JButton("Back To Home Page");
		btnBackToHome.setBackground(new Color(0, 250, 154));
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBackToHome.setBounds(234, 145, 149, 42);
		contentPane.add(btnBackToHome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 82, 158, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(36, 54, 46, 14);
		contentPane.add(lblId);
		
		lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(36, 85, 46, 14);
		contentPane.add(lblSalary);
	}

}
