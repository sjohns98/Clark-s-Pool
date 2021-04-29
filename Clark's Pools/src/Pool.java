import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pool extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pool frame = new Pool();
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
	public Pool() {
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
		lblNewLabel_3.setBounds(609, 11, 46, 23);
		contentPane.add(lblNewLabel_3);
		
		JList list = new JList();
		list.setBounds(234, 33, -52, 23);
		contentPane.add(list);
		
		JComboBox material = new JComboBox();
		material.addItem("Choose");
		material.addItem("Vinyl");
		material.addItem("Concrete");
		material.addItem("Fiberglass");
		material.addItem("Spa");
		material.setBounds(27, 34, 82, 22);
		contentPane.add(material);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Pool Tile Pattern's");
		comboBox_1.addItem("Pool Tile Pattern's2");
		comboBox_1.addItem("Pool Tile Pattern's3");

		comboBox_1.setBounds(133, 34, 65, 22);
		//contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("Colors");
		comboBox_2.setBounds(230, 34, 74, 22);
		//contentPane.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.addItem("Sizes");
		comboBox_2_1.setBounds(322, 33, 74, 22);
		//contentPane.add(comboBox_2_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.addItem("Sand");
		comboBox_2_2.addItem("De");
		comboBox_2_2.addItem("Cartridge");
		comboBox_2_2.setBounds(525, 176, 74, 22);
		contentPane.add(comboBox_2_2);
		
		JComboBox comboBox_2_2_1 = new JComboBox();
		comboBox_2_2_1.addItem("FManufacturers");
		comboBox_2_2_1.setBounds(525, 33, 74, 22);
		///contentPane.add(comboBox_2_2_1);
		
		JComboBox comboBox_2_2_1_1 = new JComboBox();
		comboBox_2_2_1_1.addItem("FModels");
		comboBox_2_2_1_1.setBounds(124, 77, 74, 22);
		contentPane.add(comboBox_2_2_1_1);
		
		JComboBox comboBox_2_2_1_2 = new JComboBox();
		comboBox_2_2_1_2.addItem("FSizes");
		comboBox_2_2_1_2.setBounds(230, 77, 74, 22);
		contentPane.add(comboBox_2_2_1_2);
		
		JComboBox comboBox_2_2_1_3 = new JComboBox();
		comboBox_2_2_1_3.addItem("MPVBrands");
		comboBox_2_2_1_3.setBounds(322, 77, 74, 22);
		contentPane.add(comboBox_2_2_1_3);
		
		JComboBox comboBox_2_2_1_4 = new JComboBox();
		comboBox_2_2_1_4.addItem("MPVSizes");
		comboBox_2_2_1_4.setBounds(426, 77, 74, 22);
		contentPane.add(comboBox_2_2_1_4);
		
		JComboBox comboBox_2_2_1_5 = new JComboBox();
		comboBox_2_2_1_5.addItem("PumpBrands");
		comboBox_2_2_1_5.setBounds(525, 77, 74, 22);
		contentPane.add(comboBox_2_2_1_5);
		
		JComboBox comboBox_2_2_1_6 = new JComboBox();
		comboBox_2_2_1_6.addItem("PumpModels");
		comboBox_2_2_1_6.setBounds(124, 110, 74, 22);
		contentPane.add(comboBox_2_2_1_6);
		
		JComboBox comboBox_2_2_1_7 = new JComboBox();
		comboBox_2_2_1_7.addItem("PumpSize's");
		comboBox_2_2_1_7.setBounds(230, 110, 74, 22);
		contentPane.add(comboBox_2_2_1_7);
		
		JComboBox comboBox_2_2_1_8 = new JComboBox();
		comboBox_2_2_1_8.addItem("#Pumps");
		comboBox_2_2_1_8.setBounds(322, 110, 74, 22);
		contentPane.add(comboBox_2_2_1_8);
		
		JComboBox comboBox_2_2_1_9 = new JComboBox();
		comboBox_2_2_1_9.addItem("Chlorine Dispenser");
		comboBox_2_2_1_9.addItem("Salt Generator");
		comboBox_2_2_1_9.addItem("Floating Dispenser");
		comboBox_2_2_1_9.setBounds(426, 110, 74, 22);
		contentPane.add(comboBox_2_2_1_9);
		
		JComboBox comboBox_2_2_1_10 = new JComboBox();
		comboBox_2_2_1_10.addItem("ChlorineBrands");
		comboBox_2_2_1_10.setBounds(525, 110, 74, 22);
		contentPane.add(comboBox_2_2_1_10);
		
		JComboBox comboBox_2_2_1_11 = new JComboBox();
		comboBox_2_2_1_11.addItem("ChlorineModels");
		comboBox_2_2_1_11.setBounds(124, 143, 74, 22);
		contentPane.add(comboBox_2_2_1_11);
		
		JComboBox comboBox_2_2_1_12 = new JComboBox();
		comboBox_2_2_1_12.addItem("#skimers");
		comboBox_2_2_1_12.setBounds(230, 143, 74, 22);
		contentPane.add(comboBox_2_2_1_12);
		
		JComboBox comboBox_2_2_1_13 = new JComboBox();
		comboBox_2_2_1_13.addItem("#returns");
		comboBox_2_2_1_13.setBounds(322, 143, 74, 22);
		contentPane.add(comboBox_2_2_1_13);
		
		JComboBox comboBox_2_2_1_14 = new JComboBox();
		comboBox_2_2_1_14.addItem("#poollights");
		comboBox_2_2_1_14.setBounds(426, 143, 74, 22);
		contentPane.add(comboBox_2_2_1_14);
		
		JComboBox comboBox_2_2_1_15 = new JComboBox();
		comboBox_2_2_1_15.addItem("poollightbrands");
		comboBox_2_2_1_15.setBounds(525, 143, 74, 22);
		contentPane.add(comboBox_2_2_1_15);
		
		JComboBox comboBox_2_2_1_16 = new JComboBox();
		comboBox_2_2_1_16.addItem("poollightmodel");
		comboBox_2_2_1_16.setBounds(124, 176, 82, 22);
		contentPane.add(comboBox_2_2_1_16);
		
		JComboBox comboBox_2_2_1_17 = new JComboBox();
		comboBox_2_2_1_17.addItem("poollightwattage");
		comboBox_2_2_1_17.setBounds(240, 176, 82, 22);
		contentPane.add(comboBox_2_2_1_17);
		
		JComboBox comboBox_2_2_1_18 = new JComboBox();
		comboBox_2_2_1_18.addItem("poollightcordlength");
		comboBox_2_2_1_18.setBounds(360, 176, 128, 22);
		contentPane.add(comboBox_2_2_1_18);
		
		JComboBox comboBox_2_2_1_1_1 = new JComboBox();
		comboBox_2_2_1_1_1.setBounds(124, 222, 74, 22);
		
		JComboBox comboBox_2_2_1_1_2 = new JComboBox();
		comboBox_2_2_1_1_2.addItem("LinerPatterns");
		comboBox_2_2_1_1_2.setBounds(234, 222, 74, 22);
		
		JComboBox comboBox_2_2_2 = new JComboBox();
		comboBox_2_2_2.addItem("ConcretePoolFinishTypes");
		comboBox_2_2_2.setBounds(467, 251, 74, 22);
		
		JComboBox comboBox_2_2_2_1 = new JComboBox();
		comboBox_2_2_2_1.addItem("FinishColor/Pattern");
		comboBox_2_2_2_1.setBounds(372, 251, 74, 22);
		setUndecorated(true); //remove frame outline
		
		material.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(material.getSelectedItem().toString().equals("Vinyl")) {
			
					
						contentPane.add(comboBox_1);
						contentPane.add(comboBox_2_2_1_1_2);
						//contentPane.add(comboBox_2);
						//contentPane.add(comboBox_2_1);
						
						contentPane.revalidate();
						contentPane.repaint();
						
						if(!material.getSelectedItem().toString().equals("Vinyl")) {
						contentPane.remove(comboBox_2_2_2_1);
						contentPane.remove(comboBox_1);
						}

					}
					if(material.getSelectedItem().toString().equals("Concrete")) {
						
						contentPane.add(comboBox_1);
						contentPane.add(comboBox_2);
						contentPane.add(comboBox_2_1);
						contentPane.add(comboBox_2_2_2);
						contentPane.add(comboBox_2_2_2_1);


						
						contentPane.revalidate();
						contentPane.repaint();
					}
					if(material.getSelectedItem().toString().equals("Fiberglass")) {
						
						contentPane.add(comboBox_1);
						contentPane.add(comboBox_2_2_1);						
						contentPane.add(comboBox_2_1);
						
						contentPane.revalidate();
						contentPane.repaint();
					}
					
					
				}
			}
		});

	}
}
