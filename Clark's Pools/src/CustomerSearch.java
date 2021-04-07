import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class CustomerSearch extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtX;

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
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(194, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 82, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Name");
		rdbtnNewRadioButton.setBounds(0, 50, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Phone Number");
		rdbtnNewRadioButton_1.setBounds(0, 81, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Last Name ");
		lblNewLabel.setBounds(115, 54, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(115, 85, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(0, 174, 434, 20);
		contentPane.add(editorPane);
		
		JButton btnNewButton = new JButton("Create User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(188, 205, 109, 31);
		contentPane.add(btnNewButton);
		
		txtX = new JTextField();
		txtX.setForeground(new Color(0, 0, 0));
		txtX.setBackground(UIManager.getColor("Button.background"));
		txtX.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtX.setHorizontalAlignment(SwingConstants.RIGHT);
		txtX.setText("X");
		txtX.setBounds(624, 11, 47, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		setUndecorated(true); //remove frame outline
	}
}
