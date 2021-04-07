import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

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
			}
		});
		btnExistingOrder.setBounds(194, 75, 129, 43);
		contentPane.add(btnExistingOrder);
		
		JButton btnCustomerMaintenance = new JButton("Customer Maintenance");
		btnCustomerMaintenance.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCustomerMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCustomerMaintenance.setBounds(347, 75, 149, 43);
		contentPane.add(btnCustomerMaintenance);
	}

}
