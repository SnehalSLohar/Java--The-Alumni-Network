import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AluminiLogin {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField username;
	private JPasswordField passwordfield;

	public AluminiLogin () {
		
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");
		
		JFrame frame3 = new JFrame("The Alumini Network: Alumini LoginPage");
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setBounds(0, 0, 1200, 750);
		frame3.setIconImage(image.getImage());
		frame3.setLocationRelativeTo(null);
		frame3.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1186, 79);
		frame3.getContentPane().add(panel);
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
		panel_1.setBackground(new Color(0, 153, 204));
		panel_1.setBounds(0, 75, 1186, 554);
		frame3.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(48, 34, 1087, 484);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(535, 9, 1, 1);
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 102)));
		panel_3.add(panel_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(277, 108, 262, 44);
		panel_4.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(277, 193, 262, 44);
		panel_4.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("StudentLogin");
		lblNewLabel_2.setFont(new Font("Artifakt Element Black", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(181, 29, 251, 52);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setForeground(new Color(0, 51, 102));
		lblNewLabel_4.setFont(new Font("Artifakt Element Black", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(80, 112, 176, 34);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_4_1.setFont(new Font("Artifakt Element Black", Font.PLAIN, 22));
		lblNewLabel_4_1.setBounds(80, 193, 176, 34);
		panel_4.add(lblNewLabel_4_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Artifakt Element Black", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(102, 204, 153));
		btnNewButton.setBounds(218, 291, 201, 44);
		panel_4.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(359, 52, 621, 388);
		panel_5.setBackground(SystemColor.controlHighlight);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 102)));
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Alumini Login");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_3.setBounds(190, 28, 251, 52);
		panel_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setForeground(new Color(0, 51, 102));
		lblNewLabel_5.setFont(new Font("Artifakt Element Black", Font.BOLD, 22));
		lblNewLabel_5.setBounds(84, 127, 176, 34);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Password");
		lblNewLabel_5_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_5_1.setFont(new Font("Artifakt Element Black", Font.BOLD, 22));
		lblNewLabel_5_1.setBounds(84, 210, 176, 34);
		panel_5.add(lblNewLabel_5_1);
		
		username = new JTextField();
		username.setBounds(252, 117, 262, 44);
		panel_5.add(username);
		username.setColumns(10);
		
		passwordfield = new JPasswordField();
		passwordfield.setColumns(10);
		passwordfield.setBounds(252, 200, 262, 44);
		panel_5.add(passwordfield);
		
		JButton LoginBtn = new JButton("Login");
		LoginBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Bappamorya@1133");
					Statement stmt=con.createStatement();
					String sql="Select * from logincredentials where Username='"+username.getText()+"' and Password='"+passwordfield.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql); 
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login is Successfull!!");
						new AlumOptPg();
					}
					else {
						JOptionPane.showMessageDialog(null,"Invalid Username or Password!!","Error",JOptionPane.ERROR_MESSAGE);
					}
				}
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		LoginBtn.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\submit.png"));
		LoginBtn.setBackground(new Color(102, 204, 153));
		LoginBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		LoginBtn.setBounds(211, 282, 201, 44);
		panel_5.add(LoginBtn);
		
		JButton ResetPass = new JButton("Reset Password?");
		ResetPass.setFont(new Font("Dialog", Font.BOLD, 16));
		ResetPass.setForeground(Color.BLACK);
		ResetPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				new ResetPassword();
			}
		});
		ResetPass.setBackground(new Color(100, 149, 237));
		ResetPass.setBounds(221, 336, 176, 28);
		panel_5.add(ResetPass);
		
		JLabel LoginIcon = new JLabel("New label");
		LoginIcon.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\log-in1.png"));
		LoginIcon.setBounds(75, 130, 258, 272);
		panel_3.add(LoginIcon);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				new WelcomePage();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 441, 122, 33);
		btnBack.setFocusPainted(false);
		panel_3.add(btnBack);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 626, 1186, 87);
		frame3.getContentPane().add(panel_2);
		frame3.setVisible(true);
	}
	public static void main(String[] args) {
		new AluminiLogin();
	}
}