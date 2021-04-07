import java.awt.Color;

import javax.swing.*;

public class Login {

	public static void main(String[] args) {
		
		LoginGUI();
		
	}
	public static void LoginGUI(){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Username");
		label.setBounds(10, 20, 80, 35);
		panel.add(label);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		frame.setVisible(true);
		
		//System.out.println("Ran");
		
		
	}

}
