import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
		
		JComboBox filter_type = new JComboBox();
		filter_type.addItem("Sand");
		filter_type.addItem("De");
		filter_type.addItem("Cartridge");
		filter_type.setBounds(10, 102, 74, 22);
		contentPane.add(filter_type);
		
		JComboBox comboBox_2_2_1 = new JComboBox();
		comboBox_2_2_1.addItem("FManufacturers");
		comboBox_2_2_1.setBounds(525, 33, 74, 22);
		///contentPane.add(comboBox_2_2_1);
		
		JComboBox filter_model = new JComboBox();
		filter_model.addItem("FModels");
		filter_model.setBounds(178, 102, 74, 22);
		contentPane.add(filter_model);
		
		JComboBox filter_size = new JComboBox();
		filter_size.addItem("FSizes");
		filter_size.setBounds(262, 102, 74, 22);
		contentPane.add(filter_size);
		
		JComboBox multiport_value_value = new JComboBox();
		multiport_value_value.addItem("MPVBrands");
		multiport_value_value.setBounds(10, 166, 74, 22);
		contentPane.add(multiport_value_value);
		
		JComboBox multiport_sizes = new JComboBox();
		multiport_sizes.addItem("MPVSizes");
		multiport_sizes.setBounds(94, 166, 74, 22);
		contentPane.add(multiport_sizes);
		
		JComboBox pump_brand = new JComboBox();
		pump_brand.addItem("PumpBrands");
		pump_brand.setBounds(10, 227, 74, 22);
		contentPane.add(pump_brand);
		
		JComboBox pump_model = new JComboBox();
		pump_model.addItem("PumpModels");
		pump_model.setBounds(94, 227, 74, 22);
		contentPane.add(pump_model);
		
		JComboBox pump_size = new JComboBox();
		pump_size.addItem("PumpSize's");
		pump_size.setBounds(178, 227, 74, 22);
		contentPane.add(pump_size);
		
		JComboBox number_pumps = new JComboBox();
		number_pumps.addItem("#Pumps");
		number_pumps.setBounds(262, 227, 74, 22);
		contentPane.add(number_pumps);
		
		JComboBox chlorine_dispenser = new JComboBox();
		chlorine_dispenser.addItem("Chlorine Dispenser");
		chlorine_dispenser.addItem("Salt Generator");
		chlorine_dispenser.addItem("Floating Dispenser");
		chlorine_dispenser.setBounds(10, 296, 74, 22);
		contentPane.add(chlorine_dispenser);
		
		JComboBox chlorine_brands = new JComboBox();
		chlorine_brands.addItem("ChlorineBrands");
		chlorine_brands.setBounds(94, 296, 74, 22);
		contentPane.add(chlorine_brands);
		
		JComboBox chlorine_models = new JComboBox();
		chlorine_models.addItem("ChlorineModels");
		chlorine_models.setBounds(178, 296, 74, 22);
		contentPane.add(chlorine_models);
		
		JComboBox skimmers = new JComboBox();
		skimmers.addItem("#skimmers");
		skimmers.setBounds(10, 352, 74, 22);
		contentPane.add(skimmers);
		
		JComboBox returns = new JComboBox();
		returns.addItem("#returns");
		returns.setBounds(94, 352, 74, 22);
		contentPane.add(returns);
		
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
		
		JComboBox filter_brand = new JComboBox();
		filter_brand.addItem("FilterBrands");
		filter_brand.setBounds(94, 102, 74, 22);
		contentPane.add(filter_brand);
		
		JLabel lblSkinnersReturns = new JLabel("Skimmers & Returns");
		lblSkinnersReturns.setBounds(10, 329, 82, 27);
		contentPane.add(lblSkinnersReturns);
		
		
		JCheckBox checkBox = new JCheckBox("Safety Cover");
		contentPane.add(checkBox);
		
		JComboBox cover_brand = new JComboBox();
		cover_brand.setBounds(178, 67, 74, 22);
		cover_brand.addItem("cb");
		
		JComboBox cover_serial = new JComboBox();
		cover_serial.addItem("123");
		cover_serial.setBounds(262, 67, 74, 22);
		
		JComboBox cover_color = new JComboBox();
		cover_color.addItem("cb");
		cover_color.setBounds(346, 67, 74, 22);
	
		
		JComboBox cover_type = new JComboBox();
		cover_type.addItem("cover type");
		cover_type.setBounds(429, 67, 74, 22);
		
		
		JComboBox cover_spacing = new JComboBox();
		cover_spacing.addItem("20");
		cover_spacing.setBounds(512, 67, 74, 22);
		
		JComboBox cover_safety_check = new JComboBox();
		cover_safety_check.addItem("2012-05-01");
		cover_safety_check.setBounds(597, 67, 74, 22);
		
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
		
		
		
//		checkBox.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
					
					contentPane.add(cover_spacing);
					contentPane.add(cover_type);
					contentPane.add(cover_safety_check);
					contentPane.add(cover_color);
					contentPane.add(cover_serial);
					contentPane.add(cover_brand);

//				}
//				
//			}
//		});
		checkBox.setBounds(99, 33, 97, 23);
		
		
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
		
		JButton btnBuildOrder = new JButton("Build Order");
		btnBuildOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
					Statement stmt = con.createStatement();
					System.out.println("Inserting records into table...");
					
					String sql = "INSERT INTO `filter` (`brand`, `type`, `size`, `model`, `id`) VALUES ('" 
					+filter_brand.getSelectedItem()+"','"+filter_type.getSelectedItem().toString()+"',"+"'"+ filter_size.getSelectedItem()+"',"+"'"
					+filter_model.getSelectedItem()+"',"+ null+");" + "\n" 
					+"INSERT INTO `cover`(`brand`, `serial`, `color`, `type`, `last_safety_check_year`, `safety_cover_spacing`) VALUES ('"
					+cover_brand.getSelectedItem() + "',"+ "'"+ cover_serial.getSelectedItem().toString() + "','"+ cover_color.getSelectedItem() +"','" + cover_type.getSelectedItem()+"','"+cover_safety_check.getSelectedItem().toString()+"','"+cover_spacing.getSelectedItem().toString()+"')";
					//ResultSet rs = stmt.executeQuery(sql);
					System.out.println(sql);
					stmt.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"order successfully added to the database");
					
					TaskFinished taskFinished = new TaskFinished();
					taskFinished.setVisible(true);
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
		btnBuildOrder.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBuildOrder.setBackground(new Color(169, 169, 169));
		btnBuildOrder.setBounds(10, 418, 96, 23);
		contentPane.add(btnBuildOrder);

	}
}
