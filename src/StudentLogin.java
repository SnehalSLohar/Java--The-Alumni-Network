import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class StudentLogin{
	/**
	 * @wbp.nonvisual location=-17,4
	 */
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordfield;

	public StudentLogin() {
		
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");

		JFrame frame2= new JFrame("The Alumini Network: Student LoginPage");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setBounds(0, 0, 1200, 750);
		frame2.setIconImage(image.getImage());
		frame2.setLocationRelativeTo(null);
		frame2.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 1186, 79);
		frame2.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel.setBounds(569, 10, 607, 52);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel_1.setBounds(28, 10, 54, 66);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(0, 75, 1186, 553);
		frame2.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 102)));
		panel_4.setBounds(438, 88, 621, 388);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(277, 108, 262, 44);
		panel_4.add(textField);
		textField.setColumns(10);
		
		passwordfield = new JPasswordField();
		passwordfield.setColumns(10);
		passwordfield.setBounds(277, 193, 262, 44);
		panel_4.add(passwordfield);
		
		JLabel lblNewLabel_2 = new JLabel("StudentLogin");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_2.setBounds(181, 29, 251, 52);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setForeground(new Color(0, 51, 102));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_4.setBounds(80, 112, 176, 34);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_4_1.setBounds(80, 193, 176, 34);
		panel_4.add(lblNewLabel_4_1);
		
		JButton LoginBtm = new JButton("Login");
		LoginBtm.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordfield.getText();
				
				if(username.equals("StudentVIT") && password.equals("Student123")) {
					JOptionPane.showMessageDialog(null,"Login is Successfull!!");
					frame2.setVisible(false);
					new StudOptPg();
				}
				else {
					//JOptionPane.showMessageDialog(null,"Invalid Username or Password!!");
					JOptionPane.showMessageDialog(null,"Invalid Username or Password!!","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		LoginBtm.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\submit.png"));
		LoginBtm.setBackground(new Color(102, 204, 153));
		LoginBtm.setFont(new Font("Dialog", Font.BOLD, 20));
		
		LoginBtm.setBounds(218, 291, 201, 44);
		panel_4.add(LoginBtm);
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\log-in1.png"));
		lblNewLabel_3.setBounds(118, 131, 258, 272);
		panel_2.add(lblNewLabel_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				new WelcomePage();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 15, 122, 33);
		btnBack.setFocusPainted(false);
		panel_2.add(btnBack);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 102));
		panel_3.setBounds(0, 569, 1186, 144);
		frame2.getContentPane().add(panel_3);
		frame2.setVisible(true);
		
	

	

	}
	public static void main(String[] args){
		new StudentLogin();
		}
	}