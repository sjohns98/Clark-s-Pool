import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CustomerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(29, 90, 233, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(272, 90, 131, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(413, 90, 224, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(29, 143, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(125, 143, 252, 20);
		contentPane.add(textField_4);
		
		JList list = new JList();
		list.setBounds(581, 143, 68, 20);
		contentPane.add(list);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(479, 143, 92, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(387, 143, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(109, 62, 62, 27);
		contentPane.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setBounds(301, 62, 62, 27);
		contentPane.add(lblMiddleName);
		
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
		
		JLabel lblState = new JLabel("County");
		lblState.setBounds(509, 121, 62, 27);
		contentPane.add(lblState);
		
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
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(29, 195, 160, 20);
		contentPane.add(textField_7);
		
		JLabel lblEmailNumber = new JLabel("Email Number");
		lblEmailNumber.setBounds(29, 174, 76, 20);
		contentPane.add(lblEmailNumber);
		
		setUndecorated(true); //remove frame outline

	}
}
