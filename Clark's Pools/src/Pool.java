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
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		
	CustomerInfo customerInfo = new CustomerInfo();


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
		
		JComboBox liner_sizes = new JComboBox();
		liner_sizes.addItem("Sizes");
		liner_sizes.setBounds(346, 34, 74, 22);
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
		
		JComboBox multiport_brand = new JComboBox();
		multiport_brand.addItem("MPVBrands");
		multiport_brand.setBounds(10, 166, 74, 22);
		contentPane.add(multiport_brand);
		
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
		pump_size.addItem("PumpSizes");
		pump_size.setBounds(178, 227, 74, 22);
		contentPane.add(pump_size);
		
		JComboBox number_pumps = new JComboBox();
		number_pumps.addItem("Pumps");
		number_pumps.setBounds(262, 227, 74, 22);
		contentPane.add(number_pumps);
		
		JComboBox chlorine_type = new JComboBox();
		chlorine_type.addItem("Chlorine Dispenser");
		chlorine_type.addItem("Salt Generator");
		chlorine_type.addItem("Floating Dispenser");
		chlorine_type.setBounds(10, 296, 74, 22);
		contentPane.add(chlorine_type);
		
		JComboBox chlorine_brands = new JComboBox();
		chlorine_brands.addItem("ChlorineBrands");
		chlorine_brands.setBounds(94, 296, 74, 22);
		contentPane.add(chlorine_brands);
		
		JComboBox chlorine_models = new JComboBox();
		chlorine_models.addItem("ChlorineModels");
		chlorine_models.setBounds(178, 296, 74, 22);
		contentPane.add(chlorine_models);
		
		JComboBox skimmers = new JComboBox();
		skimmers.addItem("skimmers");
		skimmers.setBounds(10, 352, 74, 22);
		contentPane.add(skimmers);
		
		JComboBox returns = new JComboBox();
		returns.addItem("returns");
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
		cover_brand.setBounds(164, 67, 74, 22);
		cover_brand.addItem("cb");
		
		JComboBox cover_serial = new JComboBox();
		cover_serial.addItem("123");
		cover_serial.setBounds(248, 67, 74, 22);
		
		JComboBox cover_color = new JComboBox();
		cover_color.addItem("cb");
		cover_color.setBounds(332, 67, 74, 22);
	
		
		JComboBox cover_type = new JComboBox();
		cover_type.addItem("cover type");
		cover_type.setBounds(416, 67, 74, 22);
		
		
		JComboBox cover_spacing = new JComboBox();
		cover_spacing.addItem("20");
		cover_spacing.setBounds(500, 67, 74, 22);
		
		JComboBox cover_safety_check = new JComboBox();
		cover_safety_check.addItem("2012-05-01");
		cover_safety_check.setBounds(584, 67, 74, 22);
		
		JComboBox concrete_tile_sizes = new JComboBox();
		concrete_tile_sizes.setBounds(394, 34, 82, 22);
		concrete_tile_sizes.addItem("Tile Sizes");
		
		JComboBox concrete_tile_patterns = new JComboBox();
		concrete_tile_patterns.addItem("ConcreteTilePatterns");
		concrete_tile_patterns.setBounds(302, 33, 82, 22);
		
		JComboBox fiberglass_tile_patterns = new JComboBox();
		fiberglass_tile_patterns.addItem("FiberglassTilePatterns");
		fiberglass_tile_patterns.setBounds(208, 34, 120, 22);
		
		JComboBox fiberglass_manufacturer = new JComboBox();
		fiberglass_manufacturer.addItem("FiberglassPoolManufacturers");
		fiberglass_manufacturer.setBounds(429, 33, 120, 22);
		
		JComboBox fiberglass_tile_size = new JComboBox();
		fiberglass_tile_size.addItem("FiberglassTileSizes");
		fiberglass_tile_size.setBounds(338, 33, 82, 22);
		
		JComboBox spa_tile_shape = new JComboBox();
		spa_tile_shape.addItem("SpaShapes");
		spa_tile_shape.setBounds(294, 33, 82, 22);
		
		JComboBox spa_tile_pattern = new JComboBox();
		spa_tile_pattern.addItem("SpaTilePatterns");
		spa_tile_pattern.setBounds(202, 33, 82, 22);
		
		JComboBox spa_manufacturer = new JComboBox();
		spa_manufacturer.addItem("SpaManufacturer");
		spa_manufacturer.setBounds(466, 34, 97, 22);
		
		JComboBox spa_tile_sizes = new JComboBox();
		spa_tile_sizes.addItem("SpaTileSizes");
		spa_tile_sizes.setBounds(386, 33, 74, 22);
		
		JComboBox spa_sizes = new JComboBox();
		spa_sizes.addItem("SpaSizes");
		spa_sizes.setBounds(573, 34, 82, 22);
		
		JComboBox spa_elevations = new JComboBox();
		spa_elevations.addItem("SpaElevations");
		spa_elevations.setBounds(61, 67, 93, 22);
		
		JComboBox liner_pattern = new JComboBox();
		liner_pattern.addItem("LinerPatterns");
		liner_pattern.setBounds(208, 34, 123, 22);
		
		JComboBox concrete_color = new JComboBox();
		concrete_color.addItem("FinishColor/Pattern");
		concrete_color.setBounds(202, 33, 90, 22);
		setUndecorated(true); //remove frame outline
		
		
		
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					
					contentPane.add(cover_spacing);
					contentPane.add(cover_type);
					contentPane.add(cover_safety_check);
					contentPane.add(cover_color);
					contentPane.add(cover_serial);
					contentPane.add(cover_brand);
					contentPane.revalidate();
					contentPane.repaint();

				}
				
			}
		});
		checkBox.setBounds(99, 33, 97, 23);
		
		
		material.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(material.getSelectedItem().toString().equals("Vinyl")) {
			
					
						contentPane.add(comboBox_1);
						contentPane.add(liner_pattern);
						contentPane.add(comboBox_2);
						contentPane.add(liner_sizes);
						
						contentPane.revalidate();
						contentPane.repaint();
						

					}
					if(material.getSelectedItem().toString().equals("Concrete")) {
						
						contentPane.add(concrete_tile_sizes);
						contentPane.add(concrete_color);
						contentPane.add(concrete_tile_patterns);




						
						contentPane.revalidate();
						contentPane.repaint();
					}
					if(material.getSelectedItem().toString().equals("Fiberglass")) {
						
					
						contentPane.add(fiberglass_tile_size);
						contentPane.add(fiberglass_manufacturer);
						contentPane.add(fiberglass_tile_patterns);



						
						contentPane.revalidate();
						contentPane.repaint();
					}
					if(material.getSelectedItem().toString().equals("Spa")) {
						
						contentPane.add(spa_tile_shape);
						contentPane.add(spa_tile_pattern);
						contentPane.add(spa_manufacturer);
						contentPane.add(spa_tile_sizes);
						contentPane.add(spa_sizes);
						contentPane.add(spa_elevations);
					





						
						contentPane.revalidate();
						contentPane.repaint();
					}
					
					if(!material.getSelectedItem().toString().equals("Spa")) {
						contentPane.remove(spa_tile_shape);
						contentPane.remove(spa_tile_pattern);
						contentPane.remove(spa_manufacturer);
						contentPane.remove(spa_tile_sizes);
						contentPane.remove(spa_sizes);
						contentPane.remove(spa_elevations);
						contentPane.revalidate();
						contentPane.repaint();
						}
					if(!material.getSelectedItem().toString().equals("Vinyl")) {
						contentPane.remove(liner_pattern);
						contentPane.remove(comboBox_1);
						contentPane.remove(comboBox_2);

						contentPane.revalidate();
						contentPane.repaint();
						}
					if(!material.getSelectedItem().toString().equals("Concrete")) {
						
						contentPane.remove(liner_sizes);
						contentPane.remove(concrete_color);
						contentPane.remove(concrete_tile_patterns);
						contentPane.remove(concrete_tile_sizes);


						
						contentPane.revalidate();
						contentPane.repaint();
						}
					if(!material.getSelectedItem().toString().equals("Fiberglass")) {
						
						contentPane.remove(fiberglass_tile_size);
						contentPane.remove(fiberglass_manufacturer);
						contentPane.remove(fiberglass_tile_patterns);
						
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
					
					
					String sql6 = "INSERT INTO `vinyl`(`liner_pattern`, `liner_sizes`, `id`) VALUES (`"+liner_pattern.getSelectedItem().toString()
							+ "','"+liner_sizes.getSelectedItem() + "','"+ customerInfo.customerID + "');";
					String sql7 = "INSERT INTO `concrete`(`concrete_color`, `concrete_tile_patterns`,`concrete_tile_sizes` ,`id`) VALUES (`"+concrete_color.getSelectedItem().toString()
							+ "','"+concrete_tile_patterns.getSelectedItem() + "','"+ concrete_tile_sizes.getSelectedItem().toString()+"','"+customerInfo.customerID + "');";
					String sql8 = "INSERT INTO `fiberglass`(`fiberglass_tile_pattern`, `fiberglass_tile_size`,`fiberglass_tile_manufacturer` ,`id`) VALUES (`"
							+fiberglass_tile_patterns.getSelectedItem().toString()+ "','"+fiberglass_tile_size.getSelectedItem() + "','"
							+ fiberglass_manufacturer.getSelectedItem().toString()+"','"+customerInfo.customerID + "');";
					String sql9 = "INSERT INTO `spa`(`spa_tile_pattern`, `spa_shape`,`spa_tile_sizes`,`spa_manufacturer`,`spa_sizes`, `spa_elevations` ,`id`) VALUES (`"+spa_tile_pattern.getSelectedItem().toString()
							+ "','"+spa_tile_shape.getSelectedItem() + "','"+ spa_tile_sizes.getSelectedItem().toString()+"','"+spa_manufacturer.getSelectedItem().toString()+"','"
							+spa_sizes.getSelectedItem().toString() +"','"+ spa_elevations.getSelectedItem().toString()+"','"+customerInfo.customerID + "');";
				
					
					
					String sql = "INSERT INTO `filter` (`brand`, `type`, `size`, `model`, `id`) VALUES ('" 
					+filter_brand.getSelectedItem().toString()+"','"+filter_type.getSelectedItem().toString()+"',"+"'"+ filter_size.getSelectedItem().toString()+"',"+"'"
					+filter_model.getSelectedItem().toString()+"','"+ customerInfo.customerID+"');" ;
					
					
					String sql1 = ("INSERT INTO `cover` (`brand`, `serial`, `color`, "
							+ "`type`, `last_safety_check_year`, `safety_cover_spacing`, `id`)"
							+ " VALUES ('" + cover_brand.getSelectedItem().toString() +"','"+ cover_serial.getSelectedItem().toString()+ "','"+ cover_color.getSelectedItem().toString()+"','" 
							+ cover_type.getSelectedItem().toString() + "','"+ cover_safety_check.getSelectedItem().toString() +"','" 
							+ cover_spacing.getSelectedItem().toString() + "','"+ customerInfo.customerID + "');");
//					preparedStatement.setString(1,cover_brand.getSelectedItem().toString());
//					preparedStatement.setString(2,cover_serial.getSelectedItem().toString());
//					preparedStatement.setString(3,cover_color.getSelectedItem().toString());
//					preparedStatement.setString(4,cover_type.getSelectedItem().toString());
//					preparedStatement.setString(5,cover_safety_check.getSelectedItem().toString());
//					preparedStatement.setString(6,cover_spacing.getSelectedItem().toString());
//					preparedStatement.setString(7,customerInfo.customerID);

					
					String sql2 = ("INSERT INTO `mulitport_valve` (`brand`, `size`, `id`)"
							+ " VALUES ('" + multiport_brand.getSelectedItem().toString() +"','"+ multiport_sizes.getSelectedItem().toString() + "','"+ customerInfo.customerID + "');");
//					preparedStatement1.setString(1,multiport_size.getSelectedItem().toString());
//					preparedStatement1.setString(2,multiport_brand.getSelectedItem().toString());
//					preparedStatement1.setString(3,customerInfo.customerID);

					
					String sql3 = ("INSERT INTO `pump` (`brand`, `model`,`size`,`number_of_pumps`, `id`)"
							+ " VALUES ('" + pump_brand.getSelectedItem().toString() + "','"+ pump_model.getSelectedItem().toString()+"','"+ pump_size.getSelectedItem().toString()+ "','"
							+ number_pumps.getSelectedItem().toString() + "','"+customerInfo.customerID + "');");
//					preparedStatement2.setString(1,pump_brand.getSelectedItem().toString());
//					preparedStatement2.setString(2,pump_model.getSelectedItem().toString());
//					preparedStatement2.setString(3,pump_size.getSelectedItem().toString());
//					preparedStatement2.setString(4,number_pumps.getSelectedItem().toString());
//					preparedStatement2.setString(5,customerInfo.customerID);

					
					String sql4 = ("INSERT INTO `chlorinator` (`model`, `brand`, `type`, `id`)"
							+ " VALUES ('" + chlorine_models.getSelectedItem().toString() +"','"+ chlorine_brands.getSelectedItem().toString()+"','"
							+ chlorine_type.getSelectedItem().toString() + "','" + customerInfo.customerID + "');");
//					preparedStatement3.setString(1,chlorine_models.getSelectedItem().toString());
//					preparedStatement3.setString(2,chlorine_brands.getSelectedItem().toString());
//					preparedStatement3.setString(3,chlorine_type.getSelectedItem().toString());
//					preparedStatement3.setString(4,customerInfo.customerID);

					
					String sql5 = ("INSERT INTO `skimmers_returns` (`skimmers`, `returns`, `id`)"
							+ " VALUES ('" + skimmers.getSelectedItem().toString() + "','" + returns.getSelectedItem().toString() + "','"+customerInfo.customerID  + "');");
//					preparedStatement4.setString(1,skimmers.getSelectedItem().toString());
//					preparedStatement4.setString(2,returns.getSelectedItem().toString());
//					preparedStatement4.setString(3,customerInfo.customerID);

				
					
					
					

					
					
					
					//System.out.println(sql);
					stmt.executeUpdate(sql);
					stmt.executeUpdate(sql1);
					stmt.executeUpdate(sql2);
					stmt.executeUpdate(sql3);
					stmt.executeUpdate(sql4);
					stmt.executeUpdate(sql5);
					stmt.executeUpdate(sql6);
					stmt.executeUpdate(sql7);
					stmt.executeUpdate(sql8);
					stmt.executeUpdate(sql9);


//					preparedStatement.executeUpdate();
//					preparedStatement1.executeUpdate();
//					preparedStatement2.executeUpdate();
//					preparedStatement3.executeUpdate();
//					preparedStatement4.executeUpdate();
					
					
					
					
					
					
					JOptionPane.showMessageDialog(null,"order successfully added to the database");
					
					TaskFinished taskFinished = new TaskFinished();
					taskFinished.setVisible(true);

					

					
				} catch(Exception t){System.out.print(t);};
				
				
				
				
			}
		});
		btnBuildOrder.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBuildOrder.setBackground(new Color(169, 169, 169));
		btnBuildOrder.setBounds(10, 418, 96, 23);
		contentPane.add(btnBuildOrder);

				}
				
			
			}
			
		
		
			
			
//	public static String join(){
//
//		try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clark's pools", "root", "");
//			Statement stmt = con.createStatement();
//			String sql = "SELECT customer.first_name, customer.last_name, customer.phone_type, customer.phone_number, customer.email,\r\n"
//					+ "customer.street_number, customer.street_name, customer.city, customer.state, chlorinator.brand,chlorinator.model, chlorinator.type,\r\n"
//					+ "cover.brand, cover.serial, cover.color, cover.type, cover.last_safety_check_year, cover.safety_cover_spacing, filter.brand,filter.type,filter.size,filter.model,mulitport_valve.Brand,mulitport_valve.Size,pool.builder,pool.coping,pool.max_depth,pool.number_of_steps,\r\n"
//					+ "pool.shape,pool.square_footage,pool.type_of_steps,pool.year_built, pump.brand,pump.model,pump.number_of_pumps,pump.size, skimmers_returns.skimmers, skimmers_returns.returns\r\n"
//					+ "FROM chlorinator,cover,customer,filter,mulitport_valve,pool,pump,skimmers_returns\r\n"
//					+ "WHERE customer.customer_id=pool.id";
//			
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//}
	
			

