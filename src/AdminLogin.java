import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin{
	private JTextField usernamefield;
	private JPasswordField passwordfield;
	
	public AdminLogin() {
		
ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");
		
		JFrame frame4 = new JFrame("The Alumni Network: Admin LoginPage");
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setBounds(0, 0, 1200, 750);
		frame4.setIconImage(image.getImage());
		frame4.setLocationRelativeTo(null);
		frame4.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1186, 79);
		frame4.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel.setBounds(28, 10, 54, 66);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel_1.setBounds(559, 10, 607, 52);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(0, 75, 1186, 553);
		frame4.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(48, 34, 1087, 484);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(359, 52, 621, 388);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 102)));
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Admin Login");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_3.setBounds(201, 29, 224, 52);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setForeground(new Color(0, 51, 102));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_4.setBounds(84, 127, 176, 34);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setForeground(new Color(0, 51, 102));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_5.setBounds(84, 210, 176, 34);
		panel_4.add(lblNewLabel_5);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(252, 117, 262, 44);
		panel_4.add(usernamefield);
		usernamefield.setColumns(10);
		
		passwordfield = new JPasswordField();
		passwordfield.setColumns(10);
		passwordfield.setBounds(252, 200, 262, 44);
		panel_4.add(passwordfield);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernamefield.getText();
				@SuppressWarnings("deprecation")
				String password = passwordfield.getText();
				
				if(username.equals("Administrative_VIT") && password.equals("Administrative@2001")) {
					JOptionPane.showMessageDialog(null,"Login is Successfull!!");
					frame4.setVisible(false);
					new AdminSB();
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Username or Password!!","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBackground(new Color(102, 204, 153));
		btnNewButton.setFont(new Font("Artifakt Element Black", Font.PLAIN, 22));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\submit.png"));
		btnNewButton.setBounds(229, 306, 201, 44);
		panel_4.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\log-in1.png"));
		lblNewLabel_2.setBounds(75, 130, 258, 272);
		panel_3.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4.setVisible(false);
				new WelcomePage();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 441, 122, 33);
		btnBack.setFocusPainted(false);
		panel_3.add(btnBack);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 627, 1186, 86);
		frame4.getContentPane().add(panel_2);
		frame4.setVisible(true);
	}
	public static void main(String[] args) {
		
		new AdminLogin();
		
	}

}