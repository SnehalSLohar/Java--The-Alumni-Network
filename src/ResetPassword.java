import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResetPassword {
	private JPasswordField oldpassword;
	private JPasswordField conpassword;
	private JTextField newpassword;
	private JTextField username;
    String oldpass,newpass,conpass,username_1;
    
	public ResetPassword() {
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");

		JFrame frame5= new JFrame("Reset Password");
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setBounds(0, 0, 1200, 750);
		frame5.setIconImage(image.getImage());
		frame5.setLocationRelativeTo(null);
		frame5.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1186, 79);
		frame5.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel.setBounds(28, 10, 54, 66);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel_1.setBounds(569, 10, 607, 52);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 75, 1186, 553);
		frame5.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\password.png"));
		lblNewLabel_2.setBounds(118, 131, 258, 272);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(438, 56, 621, 455);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New Password");
		lblNewLabel_3.setForeground(new Color(0, 51, 102));
		lblNewLabel_3.setFont(new Font("Artifakt Element Black", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(74, 261, 176, 34);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Old Password");
		lblNewLabel_3_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 22));
		lblNewLabel_3_1.setBounds(74, 187, 176, 34);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Confrim Password");
		lblNewLabel_3_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2.setFont(new Font("Artifakt Element Black", Font.PLAIN, 22));
		lblNewLabel_3_2.setBounds(74, 331, 206, 34);
		panel_3.add(lblNewLabel_3_2);
		
		oldpassword = new JPasswordField();
		oldpassword.setBounds(329, 177, 262, 44);
		panel_3.add(oldpassword);
		
		conpassword = new JPasswordField();
		conpassword.setBounds(329, 321, 262, 44);
		panel_3.add(conpassword);
		
		JLabel labeluserid = new JLabel();
		labeluserid.setForeground(Color.RED);
		labeluserid.setFont(new Font("Segoe UI", Font.BOLD, 16));
		labeluserid.setBounds(392, 146, 167, 21);
		panel_3.add(labeluserid);
		
		JLabel lbloldpass = new JLabel();
		lbloldpass.setForeground(Color.RED);
		lbloldpass.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lbloldpass.setBounds(363, 220, 196, 21);
		panel_3.add(lbloldpass);
		
		JLabel lblconpass = new JLabel();
		lblconpass.setForeground(Color.RED);
		lblconpass.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblconpass.setBounds(339, 362, 252, 21);
		panel_3.add(lblconpass);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(329, 103, 262, 44);
		panel_3.add(username);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				username_1 = username.getText();
				oldpass = oldpassword.getText();
				newpass = newpassword.getText();
				conpass = conpassword.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
					Statement stmt=con.createStatement();
					String sql="Select * from logincredentials where Username='"+username_1+"'";
					String  sql1 = "Update logincredentials set Password='"+newpass+"' where Username='"+username_1+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						if(rs.getString("Password").equals(oldpass))
						{
							lbloldpass.setText("");
							if(newpass.equals(conpass))
							{
								lblconpass.setText("");
								stmt.executeUpdate(sql1);
								JOptionPane.showMessageDialog(null,"Password Changed Successfully :)");
								new AluminiLogin();
							}
							else 
							{
								lblconpass.setText("Confirm Password Does not Match!!");
								conpassword.requestFocus();
							}
						}
						else 
						{
							lbloldpass.setText("Invalid Old Password!!");
							oldpassword.requestFocus();
						}
						labeluserid.setText("");
					}
					else 
					{
						labeluserid.setText("Invalid User ID!!");
						username.requestFocus();
					}
					
				}
				catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
			
		btnSubmit.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\submit.png"));
		btnSubmit.setFont(new Font("Artifakt Element Black", Font.PLAIN, 20));
		btnSubmit.setBackground(new Color(102, 204, 153));
		btnSubmit.setBounds(218, 393, 201, 44);
		panel_3.add(btnSubmit);
		
		newpassword = new JTextField();
		newpassword.setBounds(329, 251, 262, 44);
		panel_3.add(newpassword);
		newpassword.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Reset Password?");
		lblNewLabel_4.setFont(new Font("Artifakt Element Black", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(169, 21, 285, 59);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_3 = new JLabel("Username");
		lblNewLabel_3_3.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_3.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNewLabel_3_3.setBounds(74, 113, 176, 34);
		panel_3.add(lblNewLabel_3_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame5.setVisible(false);
				new AluminiLogin();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 15, 122, 33);
		btnBack.setFocusPainted(false);
		panel_1.add(btnBack);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 569, 1186, 144);
		frame5.getContentPane().add(panel_2);
		frame5.setVisible(true);
		
	}
	public static void main(String[] args) {
		new ResetPassword();
	}
}