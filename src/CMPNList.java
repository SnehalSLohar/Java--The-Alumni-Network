import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CMPNList {
	//private JTable table;
	private JTextField name;
	public int b;
	public String c;
	@SuppressWarnings("deprecation")
	public CMPNList() {
		
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");
		
		JFrame frame14 = new JFrame("Alumini List: Computer Engineering");
		frame14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame14.setBounds(0, 0, 1200, 750);
		frame14.setIconImage(image.getImage());
		frame14.setLocationRelativeTo(null);
		frame14.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1194, 64);
		frame14.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alumini List: Computer Engineering");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 29));
		lblNewLabel.setBounds(620, 10, 529, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel_1.setBounds(20, 0, 73, 64);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(-8, 658, 1213, 63);
		frame14.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnExit, "Are You Sure to Exit?", "EXIT", JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					frame14.setVisible(false);
				}
			}
		});
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\exit.png"));
		btnExit.setBounds(18, 18, 85, 32);
		panel_1.add(btnExit);
		
		JButton btnlogout = new JButton("");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame14.setVisible(false);
				new AluminiLogin();
			}
		});
		btnlogout.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\logout.png"));
		btnlogout.setBackground(Color.LIGHT_GRAY);
		btnlogout.setBounds(1093, 18, 85, 32);
		btnlogout.setFocusPainted(false);
		panel_1.add(btnlogout);
		
		JPanel DesignPanel = new JPanel();
		DesignPanel.setForeground(new Color(255, 255, 255));
		DesignPanel.setBackground(new Color(176, 224, 230));
		DesignPanel.setBounds(0, 63, 1194, 599);
		frame14.getContentPane().add(DesignPanel);
		DesignPanel.setLayout(null);
		
		JTable table = new JTable();
		Object[] columns = {"ID","Full Name","Passout Year","Phone Number","Email ID"};
		DefaultTableModel model = new DefaultTableModel();
		
		model.setColumnIdentifiers(columns);
		DesignPanel.setLayout(null);
		table.setModel(model);
		
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setSelectionBackground(Color.CYAN);
		table.setGridColor(new Color(0, 51, 102));
		table.setSelectionForeground(Color.BLACK);
		table.setFont(new Font("Dialog",Font.PLAIN,17));
		table.setRowHeight(50);
		//table.setColumnSelectionAllowed(true);
		table.setRowSelectionAllowed(true);
		table.setAutoCreateRowSorter(true);
		table.getTableHeader().setResizingAllowed(false);
		
		TableColumnModel cmodel=table.getColumnModel();
		cmodel.getColumn(0).setPreferredWidth(1);
		cmodel.getColumn(4).setPreferredWidth(200);
		cmodel.getColumn(2).setPreferredWidth(30);
		cmodel.getColumn(3).setPreferredWidth(60);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(22, 10, 720, 592);
		pane.setForeground(Color.BLACK);
		pane.setBackground(new Color(176, 224, 230));
		DesignPanel.add(pane);
		frame14.getContentPane().add(DesignPanel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.DARK_GRAY));
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(752, 10, 411, 566);
		DesignPanel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(21, 302, 368, 243);
		panel_4.add(panel_3);
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(new Color(176, 224, 230));
		panel_3.setBorder(new LineBorder(new Color(0, 51, 102), 4));
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Enter name of Alumini ");
		lblNewLabel_2.setBounds(41, 20, 296, 46);
		lblNewLabel_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 27));
		panel_3.add(lblNewLabel_2);
		
		
		/**/
	
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\dropdown.png"));
		lblNewLabel_4_1.setBounds(162, 128, 52, 45);
		panel_3.add(lblNewLabel_4_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setForeground(Color.BLACK);
		panel_3_1.setBorder(new LineBorder(new Color(0, 51, 102), 4));
		panel_3_1.setBackground(new Color(176, 224, 230));
		panel_3_1.setBounds(21, 22, 368, 219);
		panel_4.add(panel_3_1);
		
		JButton btnShowdata = new JButton("SHOW DATA");
		btnShowdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
					//Statement stmt=con.createStatement();
					//String sql="Select * from aluminiinfo_cmpn where Passout Year='2017'";
					b=StudOptPg.a;
					if(b==2017)
					{
						c=Integer.toString(b);
						PreparedStatement ps = con.prepareStatement("select * from aluminiinfo_cmpn where Passout_Year =?");
						ps.setString(1, c);
						ResultSet rs= ps.executeQuery();
						while (rs.next()) {
							String ID=String.valueOf(rs.getInt("ID"));    
							String FullName=rs.getString("Full_Name");
							String PassoutYear=rs.getString("Passout_Year");
							String PhoneNumber=rs.getString("Number");
							String EmailId=rs.getString("Email_Id");
							
							String tbData[]= {ID,FullName,PassoutYear,PhoneNumber,EmailId};
							model.addRow(tbData);
						}
						con.close();
					}
					else if(b==2018)
					{
						String c=Integer.toString(b);
						PreparedStatement ps = con.prepareStatement("select * from aluminiinfo_cmpn where Passout_Year =?");
						ps.setString(1, c);
						ResultSet rs= ps.executeQuery();
						while (rs.next()) {
							String ID=String.valueOf(rs.getInt("ID"));    
							String FullName=rs.getString("Full_Name");
							String PassoutYear=rs.getString("Passout_Year");
							String PhoneNumber=rs.getString("Number");
							String EmailId=rs.getString("Email_Id");
							
							String tbData[]= {ID,FullName,PassoutYear,PhoneNumber,EmailId};
							model.addRow(tbData);
						}
						con.close();
					}
					else if(b==2019)
					{
						String c=Integer.toString(b);
						PreparedStatement ps = con.prepareStatement("select * from aluminiinfo_cmpn where Passout_Year =?");
						ps.setString(1, c);
						ResultSet rs= ps.executeQuery();
						while (rs.next()) {
							String ID=String.valueOf(rs.getInt("ID"));    
							String FullName=rs.getString("Full_Name");
							String PassoutYear=rs.getString("Passout_Year");
							String PhoneNumber=rs.getString("Number");
							String EmailId=rs.getString("Email_Id");
							
							String tbData[]= {ID,FullName,PassoutYear,PhoneNumber,EmailId};
							model.addRow(tbData);
						}
						con.close();
					}
					else
					{
						String c=Integer.toString(b);
						PreparedStatement ps = con.prepareStatement("select * from aluminiinfo_cmpn where Passout_Year =?");
						ps.setString(1, c);
						ResultSet rs= ps.executeQuery();
						while (rs.next()) {
							String ID=String.valueOf(rs.getInt("ID"));    
							String FullName=rs.getString("Full_Name");
							String PassoutYear=rs.getString("Passout_Year");
							String PhoneNumber=rs.getString("Number");
							String EmailId=rs.getString("Email_Id");
							
							String tbData[]= {ID,FullName,PassoutYear,PhoneNumber,EmailId};
							model.addRow(tbData);
						}
						con.close();
					}
				}
				catch(Exception e7) {
					e7.printStackTrace();
				}
			}
		});
		btnShowdata.setBounds(85, 153, 199, 45);
		panel_3_1.add(btnShowdata);
		
		btnShowdata.setBackground(new Color(0, 51, 102));
		btnShowdata.setForeground(new Color(255, 255, 255));
		btnShowdata.setFocusable(false);
		btnShowdata.setFont(new Font("Dialog", Font.BOLD, 26));
		
		name = new JTextField();
		name.setBounds(63, 72, 253, 46);
		panel_3.add(name);
		name.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
					//Statement stmt=con.createStatement();
					//String sql="Select * from aluminiinfo_cmpn where Full Name=?";
					PreparedStatement ps = con.prepareStatement("select * from aluminiinfo_cmpn where Passout_Year='"+StudOptPg.a+"' and Full_Name=?");
					ps.setString(1, name.getText());
					//ps.setString(2, c);
					ResultSet rs=ps.executeQuery(); 
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Name is There!!");
						model.setRowCount(0);
						ResultSet rs1= ps.executeQuery();
						while (rs1.next()) {
							String ID=String.valueOf(rs1.getInt("ID"));    
							String FullName=rs1.getString("Full_Name");
							String PassoutYear=rs1.getString("Passout_Year");
							String PhoneNumber=rs1.getString("Number");
							String EmailId=rs1.getString("Email_Id");
							
							String tbData[]= {ID,FullName,PassoutYear,PhoneNumber,EmailId};
							model.addRow(tbData);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Name is not There!!");
					}
				}
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		/*btnSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(name.getText().trim()));
				
			}
		});*/
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBounds(95, 178, 184, 46);
		btnSearch.setFocusable(false);
		btnSearch.setBackground(new Color(0, 51, 102));
		btnSearch.setFont(new Font("Dialog", Font.BOLD, 27));
		panel_3.add(btnSearch);
		
		JLabel lblNewLabel_3_1 = new JLabel("selected year:");
		lblNewLabel_3_1.setBounds(108, 59, 142, 45);
		panel_3_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Click here to show the data for the");
		lblNewLabel_3.setBounds(13, 26, 355, 45);
		panel_3_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 51, 102));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\dropdown.png"));
		lblNewLabel_4.setBounds(163, 103, 52, 45);
		panel_3_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\down-arrow.png"));
		lblNewLabel_4_2.setBounds(182, 251, 52, 45);
		panel_4.add(lblNewLabel_4_2);
		
		frame14.setVisible(true);
		
	}
	public static void main(String[] args) {
		new CMPNList();
	}
}