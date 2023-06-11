import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class IntroPage{

	public IntroPage() {
		
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");
		
		JFrame frame = new JFrame("The Alumni Network");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Arial Black", Font.PLAIN, 30));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1200, 750);
		frame.setIconImage(image.getImage());
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1186, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel.setBounds(569, 10, 607, 52);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel_1.setBounds(28, 10, 54, 66);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 75, 1186, 553);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel NetworkIcon = new JLabel("      The Alumni Network");
		NetworkIcon.setFont(new Font("Artifakt Element Medium", Font.PLAIN, 64));
		NetworkIcon.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png"));
		NetworkIcon.setBounds(62, 73, 1094, 272);
		panel_1.add(NetworkIcon);
		
		JButton EnterNetwork = new JButton("Enter to Network");
		EnterNetwork.setBackground(Color.WHITE);
		EnterNetwork.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\Right Arrow.png"));
		EnterNetwork.setFocusable(false);
		EnterNetwork.setFont(new Font("Arial Black", Font.BOLD, 24));
		EnterNetwork.setHorizontalTextPosition(JButton.LEFT);
		EnterNetwork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				new WelcomePage();
			}
		});
		EnterNetwork.setBounds(574, 355, 358, 65);
		panel_1.add(EnterNetwork);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 569, 1186, 144);
		frame.getContentPane().add(panel_2);
		frame.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new IntroPage();
	}
}