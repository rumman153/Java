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
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;

public class IncreaseSalaryFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncreaseSalaryFrame frame = new IncreaseSalaryFrame();
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
	public IncreaseSalaryFrame() {
		setTitle("Increase Salary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(84, 67, 25, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(136, 64, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(84, 120, 50, 14);
		contentPane.add(lblSalary);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=textField.getText();
				double s=Double.parseDouble(textField_1.getText());
				ActionClass.emps.increaseSalary(i,s);
				JOptionPane.showMessageDialog(null,"Successfully Updated");
			}
		});
		btnEnter.setBackground(new Color(0, 250, 154));
		btnEnter.setBounds(50, 185, 141, 43);
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
		btnBackToHome.setBounds(239, 185, 165, 43);
		contentPane.add(btnBackToHome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 117, 206, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
