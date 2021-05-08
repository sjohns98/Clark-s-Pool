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
import javax.swing.JCheckBox;
import javax.swing.JButton;

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
		contentPane.setBackground(Color.WHITE);
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
		material.setBounds(10, 34, 82, 22);
		contentPane.add(material);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Vinyl Wall/Floor Mil");

		comboBox_1.setBounds(133, 34, 65, 22);
		//contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("Colors");
		comboBox_2.setBounds(230, 34, 74, 22);
		//contentPane.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.addItem("Sizes");
		comboBox_2_1.setBounds(597, 33, 74, 22);
		//contentPane.add(comboBox_2_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.addItem("Sand");
		comboBox_2_2.addItem("De");
		comboBox_2_2.addItem("Cartridge");
		comboBox_2_2.setBounds(10, 102, 74, 22);
		contentPane.add(comboBox_2_2);
		
		JComboBox comboBox_2_2_1 = new JComboBox();
		comboBox_2_2_1.addItem("FManufacturers");
		comboBox_2_2_1.setBounds(525, 33, 74, 22);
		///contentPane.add(comboBox_2_2_1);
		
		JComboBox comboBox_2_2_1_1 = new JComboBox();
		comboBox_2_2_1_1.addItem("FModels");
		comboBox_2_2_1_1.setBounds(178, 102, 74, 22);
		contentPane.add(comboBox_2_2_1_1);
		
		JComboBox comboBox_2_2_1_2 = new JComboBox();
		comboBox_2_2_1_2.addItem("FSizes");
		comboBox_2_2_1_2.setBounds(262, 102, 74, 22);
		contentPane.add(comboBox_2_2_1_2);
		
		JComboBox comboBox_2_2_1_3 = new JComboBox();
		comboBox_2_2_1_3.addItem("MPVBrands");
		comboBox_2_2_1_3.setBounds(10, 166, 74, 22);
		contentPane.add(comboBox_2_2_1_3);
		
		JComboBox comboBox_2_2_1_4 = new JComboBox();
		comboBox_2_2_1_4.addItem("MPVSizes");
		comboBox_2_2_1_4.setBounds(94, 166, 74, 22);
		contentPane.add(comboBox_2_2_1_4);
		
		JComboBox comboBox_2_2_1_5 = new JComboBox();
		comboBox_2_2_1_5.addItem("PumpBrands");
		comboBox_2_2_1_5.setBounds(10, 227, 74, 22);
		contentPane.add(comboBox_2_2_1_5);
		
		JComboBox comboBox_2_2_1_6 = new JComboBox();
		comboBox_2_2_1_6.addItem("PumpModels");
		comboBox_2_2_1_6.setBounds(94, 227, 74, 22);
		contentPane.add(comboBox_2_2_1_6);
		
		JComboBox comboBox_2_2_1_7 = new JComboBox();
		comboBox_2_2_1_7.addItem("PumpSize's");
		comboBox_2_2_1_7.setBounds(178, 227, 74, 22);
		contentPane.add(comboBox_2_2_1_7);
		
		JComboBox comboBox_2_2_1_8 = new JComboBox();
		comboBox_2_2_1_8.addItem("#Pumps");
		comboBox_2_2_1_8.setBounds(262, 227, 74, 22);
		contentPane.add(comboBox_2_2_1_8);
		
		JComboBox comboBox_2_2_1_9 = new JComboBox();
		comboBox_2_2_1_9.addItem("Chlorine Dispenser");
		comboBox_2_2_1_9.addItem("Salt Generator");
		comboBox_2_2_1_9.addItem("Floating Dispenser");
		comboBox_2_2_1_9.setBounds(10, 296, 74, 22);
		contentPane.add(comboBox_2_2_1_9);
		
		JComboBox comboBox_2_2_1_10 = new JComboBox();
		comboBox_2_2_1_10.addItem("ChlorineBrands");
		comboBox_2_2_1_10.setBounds(94, 296, 74, 22);
		contentPane.add(comboBox_2_2_1_10);
		
		JComboBox comboBox_2_2_1_11 = new JComboBox();
		comboBox_2_2_1_11.addItem("ChlorineModels");
		comboBox_2_2_1_11.setBounds(178, 296, 74, 22);
		contentPane.add(comboBox_2_2_1_11);
		
		JComboBox comboBox_2_2_1_12 = new JComboBox();
		comboBox_2_2_1_12.addItem("#skimers");
		comboBox_2_2_1_12.setBounds(10, 352, 74, 22);
		contentPane.add(comboBox_2_2_1_12);
		
		JComboBox comboBox_2_2_1_13 = new JComboBox();
		comboBox_2_2_1_13.addItem("#returns");
		comboBox_2_2_1_13.setBounds(94, 352, 74, 22);
		contentPane.add(comboBox_2_2_1_13);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Safety Cover");
		chckbxNewCheckBox.setBounds(99, 33, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblPoolType = new JLabel("Pool Type");
		lblPoolType.setBounds(27, 11, 62, 27);
		contentPane.add(lblPoolType);
		
		JLabel lblFilter = new JLabel("Filter");
		lblFilter.setBounds(10, 79, 62, 27);
		contentPane.add(lblFilter);
		
		JLabel lblMultiportValve = new JLabel("Multiport Valve");
		lblMultiportValve.setBounds(10, 141, 82, 27);
		contentPane.add(lblMultiportValve);
		
		JLabel lblPoolPump = new JLabel("Pool Pump");
		lblPoolPump.setBounds(10, 204, 82, 27);
		contentPane.add(lblPoolPump);
		
		JLabel lblChlorinator = new JLabel("Chlorinator");
		lblChlorinator.setBounds(10, 271, 82, 27);
		contentPane.add(lblChlorinator);
		
		JComboBox comboBox_2_2_1_1_1 = new JComboBox();
		comboBox_2_2_1_1_1.addItem("FilterBrands");
		comboBox_2_2_1_1_1.setBounds(94, 102, 74, 22);
		contentPane.add(comboBox_2_2_1_1_1);
		
		JLabel lblSkinnersReturns = new JLabel("Skimers & Returns");
		lblSkinnersReturns.setBounds(10, 329, 82, 27);
		contentPane.add(lblSkinnersReturns);
		
		JButton btnBuildOrder = new JButton("Build Order");
		btnBuildOrder.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBuildOrder.setBackground(new Color(169, 169, 169));
		btnBuildOrder.setBounds(10, 418, 96, 23);
		contentPane.add(btnBuildOrder);
		
		JComboBox comboBox_2_2_1_2_1 = new JComboBox();
		comboBox_2_2_1_2_1.setBounds(527, 56, 74, 22);
		comboBox_2_2_1_2_1.addItem("Tile Sizes");
		
		JComboBox comboBox_2_2_1_16_7 = new JComboBox();
		comboBox_2_2_1_16_7.addItem("ConcreteTilePatterns");
		comboBox_2_2_1_16_7.setBounds(480, 33, 111, 22);
		
		JComboBox comboBox_2_2_1_16_8 = new JComboBox();
		comboBox_2_2_1_16_8.addItem("FiberglassTilePatterns");
		comboBox_2_2_1_16_8.setBounds(192, 33, 114, 22);
		
		JComboBox comboBox_2_2_1_16_10 = new JComboBox();
		comboBox_2_2_1_16_10.addItem("ConcretePoolFinishTypes");
		comboBox_2_2_1_16_10.setBounds(328, 33, 134, 22);
		
		JComboBox comboBox_2_2_1_16_11 = new JComboBox();
		comboBox_2_2_1_16_11.addItem("FiberglassPoolManufacturers");
		comboBox_2_2_1_16_11.setBounds(472, 33, 93, 22);
		
		JComboBox comboBox_2_2_1_16_8_1 = new JComboBox();
		comboBox_2_2_1_16_8_1.addItem("FiberglassTileSizes");
		comboBox_2_2_1_16_8_1.setBounds(336, 33, 106, 22);
		
		JComboBox comboBox_2_2_1_16_1 = new JComboBox();
		comboBox_2_2_1_16_1.addItem("SpaShapes");
		comboBox_2_2_1_16_1.setBounds(202, 33, 82, 22);
		
		JComboBox comboBox_2_2_1_16_2 = new JComboBox();
		comboBox_2_2_1_16_2.addItem("SpaTilePatterns");
		comboBox_2_2_1_16_2.setBounds(328, 33, 114, 22);
		
		JComboBox comboBox_2_2_1_16_3 = new JComboBox();
		comboBox_2_2_1_16_3.addItem("SpaManufacturer");
		comboBox_2_2_1_16_3.setBounds(476, 33, 111, 22);
		
		JComboBox comboBox_2_2_1_16_4 = new JComboBox();
		comboBox_2_2_1_16_4.addItem("SpaTileSizes");
		comboBox_2_2_1_16_4.setBounds(597, 34, 74, 22);
		
		JComboBox comboBox_2_2_1_16_5 = new JComboBox();
		comboBox_2_2_1_16_5.addItem("SpaSizes");
		comboBox_2_2_1_16_5.setBounds(202, 67, 82, 22);
		
		JComboBox comboBox_2_2_1_16_6 = new JComboBox();
		comboBox_2_2_1_16_6.addItem("SpaElevations");
		comboBox_2_2_1_16_6.setBounds(292, 66, 93, 22);
		
		JComboBox comboBox_2_2_1_1_2 = new JComboBox();
		comboBox_2_2_1_1_2.addItem("LinerPatterns");
		comboBox_2_2_1_1_2.setBounds(197, 33, 123, 22);
		
		JComboBox comboBox_2_2_2_1 = new JComboBox();
		comboBox_2_2_2_1.addItem("FinishColor/Pattern");
		comboBox_2_2_2_1.setBounds(202, 33, 118, 22);
		setUndecorated(true); //remove frame outline
		
		material.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(material.getSelectedItem().toString().equals("Vinyl")) {
			
					
						contentPane.add(comboBox_1);
						contentPane.add(comboBox_2_2_1_1_2);
						contentPane.add(comboBox_2);
						contentPane.add(comboBox_2_1);
						
						contentPane.revalidate();
						contentPane.repaint();
						

					}
					if(material.getSelectedItem().toString().equals("Concrete")) {
						
						contentPane.add(comboBox_2_2_1_2_1);
						contentPane.add(comboBox_2_2_2_1);
						contentPane.add(comboBox_2_2_1_16_10);
						contentPane.add(comboBox_2_2_1_16_7);




						
						contentPane.revalidate();
						contentPane.repaint();
					}
					if(material.getSelectedItem().toString().equals("Fiberglass")) {
						
					
						contentPane.add(comboBox_2_2_1_16_8_1);
						contentPane.add(comboBox_2_2_1_16_11);
						contentPane.add(comboBox_2_2_1_16_8);



						
						contentPane.revalidate();
						contentPane.repaint();
					}
					if(material.getSelectedItem().toString().equals("Spa")) {
						
						contentPane.add(comboBox_2_2_1_16_1);
						contentPane.add(comboBox_2_2_1_16_2);
						contentPane.add(comboBox_2_2_1_16_3);
						contentPane.add(comboBox_2_2_1_16_4);
						contentPane.add(comboBox_2_2_1_16_5);
						contentPane.add(comboBox_2_2_1_16_6);
					





						
						contentPane.revalidate();
						contentPane.repaint();
					}
					
					if(!material.getSelectedItem().toString().equals("Spa")) {
						contentPane.remove(comboBox_2_2_1_16_1);
						contentPane.remove(comboBox_2_2_1_16_2);
						contentPane.remove(comboBox_2_2_1_16_3);
						contentPane.remove(comboBox_2_2_1_16_4);
						contentPane.remove(comboBox_2_2_1_16_5);
						contentPane.remove(comboBox_2_2_1_16_6);
						contentPane.revalidate();
						contentPane.repaint();
						}
					if(!material.getSelectedItem().toString().equals("Vinyl")) {
						contentPane.remove(comboBox_2_2_1_1_2);
						contentPane.remove(comboBox_1);
						contentPane.remove(comboBox_2);

						contentPane.revalidate();
						contentPane.repaint();
						}
					if(!material.getSelectedItem().toString().equals("Concrete")) {
						
						contentPane.remove(comboBox_2_1);
						contentPane.remove(comboBox_2_2_2_1);
						contentPane.remove(comboBox_2_2_1_16_10);
						contentPane.remove(comboBox_2_2_1_16_7);

						
						contentPane.revalidate();
						contentPane.repaint();
						}
					if(!material.getSelectedItem().toString().equals("Fiberglass")) {
						
						contentPane.remove(comboBox_2_2_1_16_8_1);
						contentPane.remove(comboBox_2_2_1_16_11);
						contentPane.remove(comboBox_2_2_1_16_8);
						
						contentPane.revalidate();
						contentPane.repaint();
						}
					

					
					
					
				}
			}
		});

	}
}
