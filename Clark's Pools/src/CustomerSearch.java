import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

public class CustomerSearch extends JFrame {

	private JPanel contentPane;
	private JTextField first_name;
	private JTextField last_name;
	private JTextField txtX;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSearch frame = new CustomerSearch();
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
	public CustomerSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 500, 681, 471);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		first_name = new JTextField();
		first_name.setBounds(67, 51, 86, 20);
		contentPane.add(first_name);
		first_name.setColumns(10);
		
		last_name = new JTextField();
		last_name.setBounds(67, 82, 86, 20);
		contentPane.add(last_name);
		last_name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Last Name ");
		lblNewLabel.setBounds(10, 85, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(10, 54, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton createUser = new JButton("Create Customer");
		createUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerInfo customerInfo = new CustomerInfo();
				customerInfo.setVisible(true);
			}
		});
		createUser.setBounds(129, 146, 109, 31);
		contentPane.add(createUser);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(248, 39, 408, 270);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		int column = 1; 
		int row = table.getSelectedRow();
		

		JButton findUser = new JButton("Find Customer");
		findUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
					Statement stmt = con.createStatement();
					String sql = "Select * from customer where first_name = '" +first_name.getText()+"'and last_name ='"+last_name.getText().toString()+ "'";
					ResultSet rs = stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					System.out.println(sql.toString());
					System.out.println(rs.toString());

					
//					if(rs.next()) {
//						System.out.println("exists");
//						CustomerInfo customerInfo = new CustomerInfo();
//						customerInfo.setVisible(true);
//					}
//					else
//						JOptionPane.showMessageDialog(null,"Customer not found create new user");
//					con.close();
					table.getSelectedRow();
					
				} catch(Exception t){System.out.print(t);};
//				String value = table.getModel().getValueAt(row, column).toString();
//				System.out.print(value);
				table.getSelectedRow();

				
				

				
				
				
			}
				
			
		});
		findUser.setBounds(10, 146, 109, 31);
		contentPane.add(findUser);
	
		
		
		setUndecorated(true); //remove frame outline
	}
}
