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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AluminiINFT{
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtpassyr;
	private JTextField txtphno;
	private JTextField txtemlid;
	@SuppressWarnings("unused")
	public AluminiINFT() {
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");

		JFrame frame10= new JFrame("Alumini List:IT Engineering");
		frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame10.setBounds(0, 0, 1200, 750);
		frame10.setIconImage(image.getImage());
		frame10.setLocationRelativeTo(null);
		frame10.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1194, 57);
		frame10.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel.setBounds(25, 0, 52, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Alumini List: IT Engineering");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_1.setBounds(649, 10, 535, 37);
		panel.add(lblNewLabel_1);
		
		JPanel DesignPanel = new JPanel();
		DesignPanel.setBackground(new Color(176, 224, 230));
		DesignPanel.setBounds(0, 58, 1194, 623);
		frame10.getContentPane().add(DesignPanel);
		
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
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				
				String tblid=model.getValueAt(table.getSelectedRow(), 0).toString();
				String tblname=model.getValueAt(table.getSelectedRow(), 1).toString();
				String tblpassyr=model.getValueAt(table.getSelectedRow(), 2).toString();
				String tblphno=model.getValueAt(table.getSelectedRow(), 3).toString();
				String tblemlid=model.getValueAt(table.getSelectedRow(), 4).toString();
				
				txtid.setText(tblid);
				txtname.setText(tblname);
				txtpassyr.setText(tblpassyr);
				txtphno.setText(tblphno);
				txtemlid.setText(tblemlid);
				
			}
		});
		pane.setBounds(22, 21, 690, 581);
		pane.setForeground(Color.BLACK);
		pane.setBackground(new Color(176, 224, 230));
		DesignPanel.add(pane);
		frame10.getContentPane().add(DesignPanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 51, 102)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(733, 21, 440, 581);
		DesignPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setForeground(new Color(0, 51, 102));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_3.setBounds(24, 43, 137, 42);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name:");
		lblNewLabel_3_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_3_1.setBounds(24, 111, 137, 42);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Passout year:");
		lblNewLabel_3_1_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_3_1_1.setBounds(24, 182, 178, 42);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Phone no. :");
		lblNewLabel_3_1_1_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_3_1_1_1.setBounds(24, 251, 157, 42);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtname.getText().equals("")||txtpassyr.getText().equals("")||txtphno.getText().equals("")||txtemlid.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Enter all Data!");
				}
				else {
					String data[] = {txtid.getText(),txtname.getText(),txtpassyr.getText(),txtphno.getText(),txtemlid.getText()};
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					
					model.addRow(data);
					JOptionPane.showMessageDialog(null, "Data Added Successfully!");
					
					txtid.setText("");
					txtname.setText("");
					txtpassyr.setText("");
					txtphno.setText("");
					txtemlid.setText("");
					
				}
			}
		});
		btnAdd.setForeground(new Color(153, 255, 204));
		btnAdd.setBackground(new Color(0, 51, 102));
		btnAdd.setFont(new Font("Dialog", Font.BOLD, 27));
		
		btnAdd.setBounds(24, 439, 178, 54);
		btnAdd.setFocusPainted(false);
		panel_1.add(btnAdd);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Email ID");
		lblNewLabel_3_1_1_1_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel_3_1_1_1_1.setBounds(24, 312, 137, 42);
		panel_1.add(lblNewLabel_3_1_1_1_1);
		
		txtid = new JTextField();
		txtid.setBounds(209, 43, 201, 42);
		panel_1.add(txtid);
		txtid.setColumns(10);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(209, 111, 201, 42);
		panel_1.add(txtname);
		
		txtpassyr = new JTextField();
		txtpassyr.setColumns(10);
		txtpassyr.setBounds(209, 182, 201, 42);
		panel_1.add(txtpassyr);
		
		txtphno = new JTextField();
		txtphno.setColumns(10);
		txtphno.setBounds(207, 251, 201, 42);
		panel_1.add(txtphno);
		
		txtemlid = new JTextField();
		txtemlid.setColumns(10);
		txtemlid.setBounds(209, 319, 201, 42);
		panel_1.add(txtemlid);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRowCount()==1) {
					
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
						int row = table.getSelectedRow();
						String cell = table.getModel().getValueAt(row,0).toString();
						String sql = "DELETE FROM aluminiinfo_inft where id = "+cell;
						    PreparedStatement pst = con.prepareStatement(sql);
							pst.execute();
							//JOptionPane.showMessageDialog(null,"Deleted Successfully");
							model.removeRow(table.getSelectedRow());
							JOptionPane.showMessageDialog(null,"Deleted Successfully!!");
					}catch(Exception e8) {
						e8.printStackTrace();
					}
					
				}
				else {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"List is empty...");
					}
					else {
						JOptionPane.showMessageDialog(null, "Please select single row for deletion...");
					}
				}
			}
		});
		btnDelete.setForeground(new Color(255, 153, 153));
		btnDelete.setBackground(new Color(0, 51, 102));
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 27));
		btnDelete.setBounds(226, 439, 178, 54);
		btnDelete.setFocusPainted(false);
		panel_1.add(btnDelete);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
				if(table.getSelectedRowCount()==1)
				{
					
					String id = txtid.getText();
					String name = txtname.getText();
					String passyr = txtpassyr.getText();
					String phno = txtphno.getText();
					String emlid = txtemlid.getText();
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
						String query="Update aluminiinfo_inft set Full_Name='"+name+"',Passout_Year='"+passyr+"',Number='"+phno+"',Email_Id='"+emlid+"' where Full_Name='"+name+"'";
						PreparedStatement pst=con.prepareStatement(query);
						pst.executeLargeUpdate();
						//model.setValueAt(id,table.getSelectedRow(), 0);
						model.setValueAt(name,table.getSelectedRow(), 1);
						model.setValueAt(passyr,table.getSelectedRow(), 2);
						model.setValueAt(phno,table.getSelectedRow(), 3);
						model.setValueAt(emlid,table.getSelectedRow(), 4);
						
					    JOptionPane.showMessageDialog(null,"Updated Successfully!!");
					    pst.close();
					}
					catch (Exception e9){
						e9.printStackTrace();
					}
				}
				else {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"Table is empty...");
					}
					else {
						JOptionPane.showMessageDialog(null,"Please select single Row For Update");
					}
				}
			}
		});
		btnUpdate.setForeground(new Color(255, 204, 255));
		btnUpdate.setBackground(new Color(0, 51, 102));
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 27));
		btnUpdate.setBounds(24, 503, 178, 54);
		btnUpdate.setFocusPainted(false);
		panel_1.add(btnUpdate);
		
		JButton btnShowData = new JButton("SHOW DATA");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
					Statement stmt=con.createStatement();
					String sql="Select * from aluminiinfo_inft";
					ResultSet rs=stmt.executeQuery(sql);
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
				catch(Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		btnShowData.setForeground(Color.WHITE);
		btnShowData.setFont(new Font("Dialog", Font.BOLD, 22));
		btnShowData.setBackground(new Color(0, 51, 102));
		btnShowData.setBounds(226, 503, 178, 54);
		btnShowData.setFocusPainted(false);
		btnShowData.setFocusPainted(false);
		panel_1.add(btnShowData);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(model.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "Table is Empty");
				}else {
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
						
						for(int i=0;i<model.getRowCount();i++) {
							//String ID = model.getValueAt(i, 0).toString();
							String Name = model.getValueAt(i, 1).toString();
							String PassoutYear = model.getValueAt(i, 2).toString();
							//int PhoneNumber = Integer.valueOf(model.getValueAt(i, 3).toString());
							String PhoneNumber = model.getValueAt(i, 3).toString();
							String EmailID = model.getValueAt(i, 4).toString();
							
							String query = "insert into aluminiinfo_inft(Full_Name,Passout_Year,Number, Email_Id) values(?,?,?,?)";
						
							PreparedStatement prepstmt =con.prepareStatement(query);
						//	prepstmt.setString(1, ID);
							prepstmt.setString(1, Name);
							prepstmt.setString(2, PassoutYear);
							//prepstmt.setInt(3, PhoneNumber);
							prepstmt.setString(3, PhoneNumber);
							prepstmt.setString(4, EmailID);
							
							prepstmt.execute();
							model.setRowCount(0);
						}
						JOptionPane.showInternalMessageDialog(null, "Data insert successfully!!");
						//model.setRowCount(0);
					}
					catch(Exception e5) {
						e5.printStackTrace();
					}
				}
			}
		});
		btnSave.setForeground(new Color(255, 250, 205));
		btnSave.setFont(new Font("Dialog", Font.BOLD, 27));
		btnSave.setFocusPainted(false);
		btnSave.setBackground(new Color(0, 51, 102));
		btnSave.setBounds(128, 375, 178, 54);
		panel_1.add(btnSave);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Note: The Name can't be ");
		lblNewLabel_3_1_2.setForeground(Color.RED);
		lblNewLabel_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1_2.setBounds(24, 146, 137, 26);
		panel_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("updated once saved!");
		lblNewLabel_3_1_2_1.setForeground(Color.RED);
		lblNewLabel_3_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3_1_2_1.setBounds(24, 163, 137, 26);
		panel_1.add(lblNewLabel_3_1_2_1);
		
		Object[] row = new Object[4];
		
	
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 664, 1194, 57);
		frame10.getContentPane().add(panel_2);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame10.setVisible(false);
				new AdminSB();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (2).png"));
		btnBack.setFocusPainted(false);
		btnBack.setBounds(10, 23, 85, 28);
		btnBack.setFocusPainted(false);
		panel_2.add(btnBack);
		
		frame10.setVisible(true);
		
	}
	public static void main(String[] args) {
		new AluminiINFT();
	}
}