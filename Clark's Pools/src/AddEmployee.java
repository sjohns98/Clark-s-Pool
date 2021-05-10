import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField first_name;
	private JTextField last_name;
	private JTextField department;
	private JTextField role;
	private JTextField email;
	private JTextField ID;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 500, 681, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		first_name = new JTextField();
		first_name.setFont(new Font("Tahoma", Font.PLAIN, 11));
		first_name.setColumns(10);
		first_name.setBackground(Color.WHITE);
		first_name.setBounds(34, 66, 233, 20);
		contentPane.add(first_name);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(204, 97, 76, 20);
		contentPane.add(lblPassword);
		

		password = new JTextField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 11));
		password.setColumns(10);
		password.setBackground(Color.WHITE);
		password.setBounds(201, 115, 107, 20);
		contentPane.add(password);
		
		last_name = new JTextField();
		last_name.setFont(new Font("Tahoma", Font.PLAIN, 11));
		last_name.setColumns(10);
		last_name.setBackground(Color.WHITE);
		last_name.setBounds(382, 66, 224, 20);
		contentPane.add(last_name);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(111, 38, 62, 27);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(469, 38, 62, 27);
		contentPane.add(lblLastName);
		
		department = new JTextField();
		department.setFont(new Font("Tahoma", Font.PLAIN, 11));
		department.setColumns(10);
		department.setBackground(Color.WHITE);
		department.setBounds(469, 115, 132, 20);
		contentPane.add(department);
		
		role = new JTextField();
		role.setFont(new Font("Tahoma", Font.PLAIN, 11));
		role.setColumns(10);
		role.setBackground(Color.WHITE);
		role.setBounds(331, 115, 132, 20);
		contentPane.add(role);
		
		JLabel txt = new JLabel("Department");
		txt.setBounds(469, 97, 76, 20);
		contentPane.add(txt);
		
		JLabel txtName = new JLabel("Role");
		txtName.setBounds(331, 94, 62, 27);
		contentPane.add(txtName);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 11));
		email.setColumns(10);
		email.setBackground(Color.WHITE);
		email.setBounds(34, 115, 160, 20);
		contentPane.add(email);
		
		JLabel lblEmailNumber = new JLabel("Email");
		lblEmailNumber.setBounds(44, 97, 76, 20);
		contentPane.add(lblEmailNumber);
		
		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ID.setColumns(10);
		ID.setBackground(Color.WHITE);
		ID.setBounds(469, 180, 160, 20);
		contentPane.add(ID);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
					Statement stmt = con.createStatement();
					String sql = "Select * from employee where id = '" +ID.getText()+"'";
					ResultSet rs = stmt.executeQuery(sql);
				///	table.setModel(DbUtils.resultSetToTableModel(rs));
					System.out.println(sql.toString());
					System.out.println(rs.toString());

					
					if(rs.next()) {
						String firstName = rs.getString("first_name");
						first_name.setText(firstName);
						
						String lastName = rs.getString("last_name");
						last_name.setText(lastName);
						
						String emailSetField = rs.getString("email");
						email.setText(emailSetField);
						
						String roleSetField = rs.getString("role");
						role.setText(roleSetField);
						
						String roleDepartment = rs.getString("department_name");
						department.setText(roleDepartment);
						
						
					}
					else
						JOptionPane.showMessageDialog(null,"ID not found create new user");
					con.close();
					
				} catch(Exception t){System.out.print(t);};
				
				
				
				
			}
			
		});
		btnSearch.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSearch.setBackground(new Color(169, 169, 169));
		btnSearch.setBounds(59, 179, 96, 23);
		contentPane.add(btnSearch);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(469, 159, 76, 20);
		contentPane.add(lblId);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
					
					PreparedStatement preparedStatement = con.prepareStatement("UPDATE employee SET " + "first_name = ?, last_name = ?, email = ?, role = ?, department_name =? WHERE id = ? " + ";");
					preparedStatement.setString(1,first_name.getText());
					preparedStatement.setString(2,last_name.getText());
					preparedStatement.setString(3,email.getText());
					preparedStatement.setString(4,role.getText());
					preparedStatement.setString(5,department.getText());

					preparedStatement.setString(6,ID.getText());
					preparedStatement.executeUpdate();
					
					System.out.println("Updating...");

					
	
				} catch(Exception t){System.out.print(t);};
				
				
				
				
			
			
			}
		});
		btnUpdate.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnUpdate.setBackground(new Color(169, 169, 169));
		btnUpdate.setBounds(182, 179, 96, 23);
		contentPane.add(btnUpdate);
		
		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
					
					PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO employee (first_name,last_name,email,id,password,role,department_name)"
							+ " VALUES (" + "first_name = ?, last_name = ?, email = ?, id = ?, password = ?, role = ?, department_name = ? " + ")");
					preparedStatement.setString(1,first_name.getText());
					preparedStatement.setString(2,last_name.getText());
					preparedStatement.setString(3,email.getText());
					preparedStatement.setString(4,ID.getText());
					preparedStatement.setString(5,password.getText());
					preparedStatement.setString(6,role.getText());
					preparedStatement.setString(7,department.getText());
					preparedStatement.executeUpdate();

					System.out.print("...Adding User");

					
					//ResultSet rs = stmt.executeQuery(sql);
				///	table.setModel(DbUtils.resultSetToTableModel(rs));
					System.out.println(preparedStatement.toString());
					//System.out.println(rs.toString());
					
					
					
			//		stmt.executeUpdate(sql);
//					if(rs.next()) {
//						
//						
//						
//					}
//					else
//						JOptionPane.showMessageDialog(null,"ID not found create new user");
//					con.close();
					
				} catch(Exception t){System.out.print(t);};
				
				
				
			}
		});
		btnCreateNew.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnCreateNew.setBackground(new Color(169, 169, 169));
		btnCreateNew.setBounds(304, 179, 96, 23);
		contentPane.add(btnCreateNew);
		
		
		
		
		setUndecorated(true);
	}
}
