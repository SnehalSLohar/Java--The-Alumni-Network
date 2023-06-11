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
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ItemEvent;

public class AlumOptPg {
	static public int a;
	public AlumOptPg () {
		ImageIcon image=new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\students (2).png");

		JFrame frame19= new JFrame("Alumini: Option Page");
		frame19.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame19.setBounds(0, 0, 1200, 750);
		frame19.setIconImage(image.getImage());
		frame19.setLocationRelativeTo(null);
		frame19.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 1186, 79);
		frame19.getContentPane().add(panel);
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
		frame19.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(179, 71, 820, 442);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Enter The Details of the Alumini to be Searched:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(45, 9, 706, 85);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Passout Year:\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 28));
		lblNewLabel_2_1_1.setBounds(147, 115, 189, 48);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Branch:");
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.PLAIN, 28));
		lblNewLabel_2_1_2.setBounds(223, 197, 99, 48);
		panel_3.add(lblNewLabel_2_1_2);
		
		JComboBox yearcomboBox = new JComboBox();
		yearcomboBox.setBackground(Color.WHITE);
		yearcomboBox.setModel(new DefaultComboBoxModel(new String[] {"2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		yearcomboBox.setFont(new Font("Dialog", Font.PLAIN, 18));
		yearcomboBox.setBounds(387, 122, 223, 42);
		panel_3.add(yearcomboBox);
		
		JRadioButton CMPNrb = new JRadioButton("CMPN");
		CMPNrb.setBackground(Color.WHITE);
		CMPNrb.setFont(new Font("Dialog", Font.PLAIN, 16));
		CMPNrb.setBounds(380, 210, 126, 35);
		CMPNrb.setFocusPainted(false);
		panel_3.add(CMPNrb);
		
		JRadioButton INFTrb = new JRadioButton("INFT");
		INFTrb.setBackground(Color.WHITE);
		INFTrb.setFont(new Font("Dialog", Font.PLAIN, 16));
		INFTrb.setBounds(528, 210, 126, 35);
		INFTrb.setFocusPainted(false);
		panel_3.add(INFTrb);
		
		JRadioButton ETRXrb = new JRadioButton("ETRX");
		ETRXrb.setBackground(Color.WHITE);
		ETRXrb.setFont(new Font("Dialog", Font.PLAIN, 16));
		ETRXrb.setBounds(380, 272, 126, 35);
		ETRXrb.setFocusPainted(false);
		panel_3.add(ETRXrb);
		
		JRadioButton EXTCrb = new JRadioButton("EXTC");
		EXTCrb.setBackground(Color.WHITE);
		EXTCrb.setFont(new Font("Dialog", Font.PLAIN, 16));
		EXTCrb.setBounds(528, 272, 126, 35);
		EXTCrb.setFocusPainted(false);
		panel_3.add(EXTCrb);
		
		JRadioButton BIOMrb = new JRadioButton("BIOM");
		BIOMrb.setBackground(Color.WHITE);
		BIOMrb.setFont(new Font("Dialog", Font.PLAIN, 16));
		BIOMrb.setBounds(451, 327, 126, 35);
		BIOMrb.setFocusPainted(false);
		panel_3.add(BIOMrb);
		
		ButtonGroup branches=new ButtonGroup();
		branches.add(CMPNrb);
		branches.add(INFTrb);
		branches.add(ETRXrb);
		branches.add(EXTCrb);
		branches.add(BIOMrb);
		
		JButton SearchBtn = new JButton("Search");
		SearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(CMPNrb.isSelected())
				{
					new CMPNList();
				}
				else if(INFTrb.isSelected())
				{
					new ITList();
				}
				else if(EXTCrb.isSelected())
				{
					new EXTCList();
				}
				else if(ETRXrb.isSelected())
				{
					new ETRXList();
				}
				else
				{
					new BIOMList();
				}*/
				String selectedValue=yearcomboBox.getSelectedItem().toString();
				a=Integer.parseInt(selectedValue);
				if(a==2017)
				{
					if(CMPNrb.isSelected())
					{
						frame19.setVisible(false);
						new CMPNList();
					}
					else if(INFTrb.isSelected())
					{
						frame19.setVisible(false);
						new ITList();
					}
					else if(EXTCrb.isSelected())
					{						
						frame19.setVisible(false);
						new EXTCList();
					}
					else if(ETRXrb.isSelected())
					{						
						frame19.setVisible(false);
						new ETRXList();
					}
					else
					{						
						frame19.setVisible(false);
						new BIOMList();
					}
				}
				else if(a==2018)
				{
					if(CMPNrb.isSelected())
					{
						frame19.setVisible(false);
						new CMPNList();
					}
					else if(INFTrb.isSelected())
					{
						frame19.setVisible(false);
						new ITList();
					}
					else if(EXTCrb.isSelected())
					{						
						frame19.setVisible(false);
						new EXTCList();
					}
					else if(ETRXrb.isSelected())
					{						
						frame19.setVisible(false);
						new ETRXList();
					}
					else
					{						
						frame19.setVisible(false);
						new BIOMList();
					}
				}
				else if(a==2019)
				{
					if(CMPNrb.isSelected())
					{
						frame19.setVisible(false);
						new CMPNList();
					}
					else if(INFTrb.isSelected())
					{
						frame19.setVisible(false);
						new ITList();
					}
					else if(EXTCrb.isSelected())
					{						
						frame19.setVisible(false);
						new EXTCList();
					}
					else if(ETRXrb.isSelected())
					{						
						frame19.setVisible(false);
						new ETRXList();
					}
					else
					{						
						frame19.setVisible(false);
						new BIOMList();
					}
				}
				else
				{
					if(CMPNrb.isSelected())
					{
						frame19.setVisible(false);
						new CMPNList();
					}
					else if(INFTrb.isSelected())
					{
						frame19.setVisible(false);
						new ITList();
					}
					else if(EXTCrb.isSelected())
					{						
						frame19.setVisible(false);
						new EXTCList();
					}
					else if(ETRXrb.isSelected())
					{						
						frame19.setVisible(false);
						new ETRXList();
					}
					else
					{						
						frame19.setVisible(false);
						new BIOMList();
					}
				}
			}
		});
		
		/*yearcomboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selectedValue=yearcomboBox.getSelectedItem().toString();
				if(selectedValue=="2006")
				{
					if(CMPNrb.isSelected())
					{
						new CMPNList();
					}
					else if(INFTrb.isSelected())
					{
						new ITList();
					}
					else if(EXTCrb.isSelected())
					{
						new EXTCList();
					}
					else if(ETRXrb.isSelected())
					{
						new ETRXList();
					}
					else
					{
						new BIOMList();
					}
				}
			}
		});*/
		SearchBtn.setBackground(new Color(135, 206, 250));
		SearchBtn.setFont(new Font("Dialog", Font.BOLD, 24));
		SearchBtn.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\Java Mini Project\\search.png"));
		SearchBtn.setBounds(311, 379, 233, 35);
		SearchBtn.setFocusPainted(false);
		panel_3.add(SearchBtn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame19.setVisible(false);
				new AluminiLogin();
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\Vinay Bhojwani\\Downloads\\back (1).png"));
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(10, 15, 122, 33);
		panel_1.add(btnBack);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 569, 1186, 144);
		frame19.getContentPane().add(panel_2);
		
		frame19.setVisible(true);
	}

	public static void main(String[] args) {
		new AlumOptPg();
	}
}