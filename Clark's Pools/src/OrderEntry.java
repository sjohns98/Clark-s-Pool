import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

public class OrderEntry extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderEntry frame = new OrderEntry();
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
	public OrderEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 500, 681, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New Order");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	//	btnNewButton.addActionListener(new ActionListener() {
	//		
//			public void actionPerformed(ActionEvent e) {
//				
//					try {
//					
//					//Class.forName("com.mysql.jdbc.Driver");
//					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "COSC*457");
//					Statement stmt = con.createStatement();
//					String sql = "Select * from department where name = '" +email.getText()+"'and Password= '"+password.getText().toString()+ "'";
//					ResultSet rs = stmt.executeQuery(sql);
//					System.out.println(sql);
//					System.out.println(rs);
//
//					
//					if(rs.next()) {
//						OrderEntry orderEntry = new OrderEntry();
//						orderEntry.setVisible(true);
//					}
//					else
//						JOptionPane.showMessageDialog(null,"Incorrect username and Password...");
//					con.close();
//					
//				} catch(Exception t){System.out.print(t);};
//				
//				
//				
//				
//			}
//				
//				
//				
//				CustomerSearch customerSearch = new CustomerSearch();
//				customerSearch.setVisible(true);
//				
//			
//			}
//		});
		btnNewButton.setBounds(44, 75, 129, 43);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Repair");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(194, 77, 129, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdmin.setBounds(349, 77, 129, 39);
		contentPane.add(btnAdmin);
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
		setUndecorated(true); //remove frame outline
	}
	

}
