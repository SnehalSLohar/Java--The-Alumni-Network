import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePage{

	public WelcomePage(){
		
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");
	
		JFrame frame1 = new JFrame("The Alumni Network: Welcome Page");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setBounds(0, 0, 1200, 750);
		frame1.setIconImage(image.getImage());
		frame1.setLocationRelativeTo(null);
		frame1.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1186, 1);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 51, 102));
		frame1.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Artifakt Element Black", Font.PLAIN, 32));
		lblNewLabel.setBounds(569, 10, 607, 52);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(28, 10, 54, 66);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 1186, 79);
		frame1.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel_2.setBounds(569, 10, 607, 52);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel_3.setBounds(28, 10, 54, 66);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(0, 75, 1186, 579);
		frame1.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(478, 10, 211, 232);
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblNewLabel_4.setIcon(new ImageIcon("Welcome2.png"));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Welcome!!");
		lblNewLabel_5.setBounds(429, 199, 307, 122);
		lblNewLabel_5.setForeground(new Color(0, 51, 153));
		lblNewLabel_5.setFont(new Font("Arial Black", Font.ITALIC, 50));
		panel_2.add(lblNewLabel_5);
		
		JButton StudBtn = new JButton("Student");
		StudBtn.setBounds(147, 393, 199, 47);
		StudBtn.setFont(new Font("Dialog", Font.BOLD, 22));
		StudBtn.setBackground(Color.GRAY);
		StudBtn.setFocusPainted(false);
		StudBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				new StudentLogin();
			}
		});
		panel_2.add(StudBtn);
		
		JButton AdminBtn = new JButton("Administrative");
		AdminBtn.setBounds(492, 496, 199, 47);
		AdminBtn.setFont(new Font("Dialog", Font.BOLD, 22));
		AdminBtn.setBackground(new Color(255, 255, 153));
		AdminBtn.setFocusPainted(false);
		panel_2.add(AdminBtn);
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				new AdminLogin();
				//new AdminLogin();
			}
		});
		
		
		JButton AluminiBtn = new JButton("Alumni");
		AluminiBtn.setBounds(862, 393, 199, 47);
		AluminiBtn.setFont(new Font("Dialog", Font.BOLD, 22));
		AluminiBtn.setBackground(new Color(255, 153, 102));
		AluminiBtn.setFocusPainted(false);
		panel_2.add(AluminiBtn);
		AluminiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				new AluminiLogin();
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("You Are A?");
		lblNewLabel_6.setBounds(475, 298, 197, 68);
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 32));
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(84, 377, 56, 62);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\student1.png"));
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("New label");
		lblNewLabel_7_1.setBounds(426, 492, 56, 62);
		lblNewLabel_7_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\working1.png"));
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("New label");
		lblNewLabel_7_1_1.setBounds(796, 378, 56, 62);
		lblNewLabel_7_1_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\graduated1.png"));
		panel_2.add(lblNewLabel_7_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				new IntroPage();
			}
		});
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBounds(10, 20, 122, 33);
		btnBack.setFocusPainted(false);
		panel_2.add(btnBack);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 102));
		panel_3.setBounds(0, 569, 1186, 144);
		frame1.getContentPane().add(panel_3);
		frame1.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new WelcomePage();
	}
}