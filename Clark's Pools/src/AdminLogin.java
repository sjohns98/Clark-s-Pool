import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 500, 681, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 11));
		email.setColumns(10);
		email.setBounds(183, 96, 335, 40);
		contentPane.add(email);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(625, 11, 46, 23);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(114, 109, 62, 27);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(114, 169, 62, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
				Statement stmt = con.createStatement();
				String sql = "Select * from employee where email= '" +email.getText()+"'and password= '"+password.getText().toString()+ "'and role= 'supervisor'";
				ResultSet rs = stmt.executeQuery(sql);
				
				
				System.out.println(sql);
				System.out.println(rs);

				
				if(rs.next()) {
					AddEmployee addEmployee = new AddEmployee();
					addEmployee.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null,"Incorrect username and Password...");
				con.close();
				
			} catch(Exception t){System.out.print(t);
			
			}
			}
			
			
			});
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setBounds(296, 231, 96, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(309, 51, 62, 32);
		contentPane.add(lblNewLabel_2);
		
		password = new JPasswordField();
		password.setBounds(183, 169, 335, 40);
		contentPane.add(password);
		
		setUndecorated(true);
	}
}
