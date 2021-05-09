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
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CustomerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField street_number;
	private JTextField street_name;
	private JTextField city;
	private JTextField email;
	private JTextField phone_type;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInfo frame = new CustomerInfo();
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
	public CustomerInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 500, 681, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstName = new JTextField();
		firstName.setBackground(Color.WHITE);
		firstName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		firstName.setColumns(10);
		firstName.setBounds(29, 90, 233, 20);
		contentPane.add(firstName);
		
		lastName = new JTextField();
		lastName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lastName.setColumns(10);
		lastName.setBackground(Color.WHITE);
		lastName.setBounds(413, 90, 224, 20);
		contentPane.add(lastName);
		
		street_number = new JTextField();
		street_number.setFont(new Font("Tahoma", Font.PLAIN, 11));
		street_number.setColumns(10);
		street_number.setBackground(Color.WHITE);
		street_number.setBounds(29, 143, 86, 20);
		contentPane.add(street_number);
		
		street_name = new JTextField();
		street_name.setFont(new Font("Tahoma", Font.PLAIN, 11));
		street_name.setColumns(10);
		street_name.setBackground(Color.WHITE);
		street_name.setBounds(125, 143, 252, 20);
		contentPane.add(street_name);
		
		city = new JTextField();
		city.setFont(new Font("Tahoma", Font.PLAIN, 11));
		city.setColumns(10);
		city.setBackground(Color.WHITE);
		city.setBounds(387, 143, 86, 20);
		contentPane.add(city);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(109, 62, 62, 27);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(479, 62, 62, 27);
		contentPane.add(lblLastName);
		
		JLabel lblStreetNumber = new JLabel("Street Number");
		lblStreetNumber.setBounds(29, 124, 76, 20);
		contentPane.add(lblStreetNumber);
		
		JLabel lblStreetName = new JLabel("Street Name");
		lblStreetName.setBounds(210, 121, 62, 27);
		contentPane.add(lblStreetName);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(423, 121, 62, 27);
		contentPane.add(lblCity);
		
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
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 11));
		email.setColumns(10);
		email.setBackground(Color.WHITE);
		email.setBounds(29, 195, 160, 20);
		contentPane.add(email);
		
		JLabel lblEmailNumber = new JLabel("Email");
		lblEmailNumber.setBounds(29, 174, 76, 20);
		contentPane.add(lblEmailNumber);
		
		phone_type = new JTextField();
		phone_type.setFont(new Font("Tahoma", Font.PLAIN, 11));
		phone_type.setColumns(10);
		phone_type.setBackground(Color.WHITE);
		phone_type.setBounds(210, 195, 160, 20);
		contentPane.add(phone_type);
		
		JLabel p = new JLabel("phone type");
		p.setBounds(210, 174, 76, 20);
		contentPane.add(p);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(397, 195, 160, 20);
		contentPane.add(textField);
		
		JLabel phone_number = new JLabel("phone number");
		phone_number.setBounds(397, 174, 76, 20);
		contentPane.add(phone_number);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(483, 143, 86, 20);
		contentPane.add(textField_1);
		
		JLabel state = new JLabel("State");
		state.setBounds(495, 121, 62, 27);
		contentPane.add(state);
		
		JButton Next = new JButton("Next");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
					Statement stmt = con.createStatement();
					System.out.println("Inserting records into table...");
					
					String sql = "INSERT INTO `customer` (`first_name`, `last_name`, `email`, `phone_type`, `phone_number`, `street_number`, `street_name`, `city`, `state`, `customer_id`) VALUES ('" 
					+firstName.getText()+"','"+lastName.getText().toString()+"',"+"'"+ email.getText()+"',"+"'"
					+phone_type.getText()+"',"+ "'"+ phone_number.getText()+"',"+"'"+street_number.getText()+"'," +"'"+street_name.getText()+"',"+ "'"+city.getText()+"'," + "'"+ state.getText()+"'" +","+ null+")";
					//ResultSet rs = stmt.executeQuery(sql);
					System.out.println(sql);
					stmt.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"customer successfully added to the database");
					
					Pool pool = new Pool();
					pool.setVisible(true); 
					//System.out.println(rs);

					
//					if(rs.next()) {
//						OrderEntry orderEntry = new OrderEntry();
//						orderEntry.setVisible(true);
//					}
//					else
//						JOptionPane.showMessageDialog(null,"Incorrect username and Password...");
//					con.close();
					
				} catch(Exception t){System.out.print(t);};
				
				
				
				
			}
		});
				
				
				
		
		Next.setBorder(new EmptyBorder(0, 0, 0, 0));
		Next.setBackground(new Color(169, 169, 169));
		Next.setBounds(281, 247, 96, 23);
		contentPane.add(Next);

		
		setUndecorated(true); //remove frame outline

	}
}
