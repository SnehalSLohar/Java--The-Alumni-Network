import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSB{
	public AdminSB() {
		
		ImageIcon image=new ImageIcon("students (2).png");
		
		JFrame frame7 = new JFrame("Admin: Select Branch");
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.setBounds(0, 0, 1200, 750);
		frame7.setIconImage(image.getImage());
		frame7.setLocationRelativeTo(null);
		frame7.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1186, 79);
		frame7.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\VITLogo1.png"));
		lblNewLabel_2.setBounds(28, 10, 54, 66);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vidyalankar Institute of Technology");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Artifakt Element Black", Font.BOLD, 32));
		lblNewLabel_3.setBounds(559, 10, 607, 52);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 75, 1186, 553);
		frame7.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton INFTrb = new JRadioButton("IT Engineering");
		INFTrb.setForeground(new Color(0, 51, 102));
		INFTrb.setBackground(Color.WHITE);
		INFTrb.setFont(new Font("Dialog", Font.BOLD, 25));
		INFTrb.setBounds(386, 168, 335, 41);
		INFTrb.setFocusable(false);
		panel_1.add(INFTrb);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(160, 35, 815, 494);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton CMPNrb = new JRadioButton("Computer Engineering");
		CMPNrb.setForeground(new Color(0, 51, 102));
		CMPNrb.setFont(new Font("Dialog", Font.BOLD, 25));
		CMPNrb.setBackground(Color.WHITE);
		CMPNrb.setBounds(225, 197, 335, 41);
		CMPNrb.setFocusable(false);
		panel_3.add(CMPNrb);
		
		JRadioButton EXTCrb = new JRadioButton("Electronic Engineering");
		EXTCrb.setForeground(new Color(0, 51, 102));
		EXTCrb.setFont(new Font("Dialog", Font.BOLD, 25));
		EXTCrb.setBackground(Color.WHITE);
		EXTCrb.setFocusable(false);
		EXTCrb.setBounds(225, 261, 335, 41);
		panel_3.add(EXTCrb);
		
		JRadioButton ETRXrb = new JRadioButton("Electrical Engineering");
		ETRXrb.setForeground(new Color(0, 51, 102));
		ETRXrb.setFont(new Font("Dialog", Font.BOLD, 25));
		ETRXrb.setBackground(Color.WHITE);
		ETRXrb.setBounds(225, 325, 335, 41);
		ETRXrb.setFocusable(false);
		panel_3.add(ETRXrb);
		
		JRadioButton BIOMrb = new JRadioButton("Biomedical Engineering");
		BIOMrb.setForeground(new Color(0, 51, 102));
		BIOMrb.setFont(new Font("Dialog", Font.BOLD, 25));
		BIOMrb.setBackground(Color.WHITE);
		BIOMrb.setBounds(225, 385, 335, 41);
		BIOMrb.setFocusable(false);
		panel_3.add(BIOMrb);
		
		ButtonGroup branches=new ButtonGroup();
		branches.add(CMPNrb);
		branches.add(EXTCrb);
		branches.add(ETRXrb);
		branches.add(INFTrb);
		branches.add(BIOMrb);
		
		JButton SearchBtn = new JButton("Search");
		SearchBtn.setForeground(new Color(0, 0, 0));
		SearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CMPNrb.isSelected())
				{
					frame7.setVisible(false);
					new AluminiCMPN();
				}
				else if(INFTrb.isSelected())
				{
					frame7.setVisible(false);
					new AluminiINFT();
				}
				else if(EXTCrb.isSelected())
				{
					frame7.setVisible(false);
					new AluminiEXTC();
				}
				else if(ETRXrb.isSelected())
				{
					frame7.setVisible(false);
					new AluminiETRX();
				}
				else
				{
					frame7.setVisible(false);
					new AluminiBIOM();
				}
			}
		});
		SearchBtn.setBackground(new Color(102, 204, 153));
		SearchBtn.setFont(new Font("Dialog", Font.PLAIN, 24));
		SearchBtn.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\search.png"));
		SearchBtn.setBounds(595, 10, 210, 35);
		SearchBtn.setFocusPainted(false);
		panel_3.add(SearchBtn);
		
		JLabel Selectlbl = new JLabel("Select Branch:");
		Selectlbl.setBounds(232, 10, 341, 91);
		panel_3.add(Selectlbl);
		Selectlbl.setForeground(new Color(0, 51, 102));
		Selectlbl.setFont(new Font("Dialog", Font.BOLD, 45));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\BG4.png"));
		lblNewLabel_1.setBounds(0, 0, 815, 494);
		panel_3.add(lblNewLabel_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7.setVisible(false);
				new AdminLogin();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 10, 122, 33);
		btnBack.setFocusPainted(false);
		panel_1.add(btnBack);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 627, 1186, 86);
		frame7.getContentPane().add(panel_2);
		
		frame7.setVisible(true);
	}
	public static void main(String[] args) {
		new AdminSB();
	}
}