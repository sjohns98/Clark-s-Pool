import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerSearch customerSearch = new CustomerSearch();
				customerSearch.setVisible(true);
				
			
			}
		});
		btnNewButton.setBounds(44, 75, 129, 43);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Repair");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(44, 158, 129, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdmin.setBounds(194, 158, 129, 39);
		contentPane.add(btnAdmin);
		
		JButton btnExistingOrder = new JButton("Existing Order");
		btnExistingOrder.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExistingOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerInfo customerInfo = new CustomerInfo();
				customerInfo.setVisible(true);
			}
		});
		btnExistingOrder.setBounds(194, 75, 129, 43);
		contentPane.add(btnExistingOrder);
		
		JButton btnCustomerMaintenance = new JButton("Customer Maintenance");
		btnCustomerMaintenance.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCustomerMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerInfo customerInfo = new CustomerInfo();
				customerInfo.setVisible(true);
			}
		});
		btnCustomerMaintenance.setBounds(347, 75, 149, 43);
		contentPane.add(btnCustomerMaintenance);
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
