package vehicleShowroom;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Connection;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;

public class UI {

	private JFrame frmElectricalVehicleShowroom;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel panel_1 = new JPanel();
	private JPanel panel_2 = new JPanel();	
	private JPanel panel_3 = new JPanel();
	private JPanel panel_4 = new JPanel();
	private JPanel panel_5 = new JPanel();
	private JLabel lblNewLabel_5 = new JLabel();
	private JLabel lblNewLabel_7 = new JLabel();
	private JTextArea txtrLoanScheme = new JTextArea();
	private JLabel lblNewLabel_11 = new JLabel();
	private JLabel lblNewLabel_13 = new JLabel();
    private JLabel lblNewLabel_14 = new JLabel();
    private JButton btnNewButton_15 = new JButton();
    private JButton btnNewButton_16 = new JButton();
    private JLabel lblNewLabel_15 = new JLabel();
    private JLabel lblNewLabel_17 = new JLabel();
	private JLabel lblNewLabel_20 = new JLabel();
    private	JLabel lblNewLabel_23 = new JLabel();
    private JLabel lblNewLabel_27 = new JLabel();
	private JLabel lblNewLabel_29 = new JLabel();
	private JTextArea textArea = new JTextArea();
	private JLabel lblNewLabel_30 = new JLabel();
	private JLabel lblNewLabel_18 = new JLabel();
	private JButton btnNewButton_18 = new JButton();
    private	JLabel lblNewLabel_5_1 = new JLabel();
    private JLabel lblNewLabel_7_1 = new JLabel();
    private JTextArea txtrLoanScheme_1 = new JTextArea();
    private JLabel lblNewLabel_11_1 = new JLabel();
    private JLabel lblNewLabel_13_1 = new JLabel();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmElectricalVehicleShowroom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElectricalVehicleShowroom = new JFrame();
		frmElectricalVehicleShowroom.setTitle("electrical vehicle showroom");
		frmElectricalVehicleShowroom.setBounds(100, 100, 769, 501);
		frmElectricalVehicleShowroom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElectricalVehicleShowroom.getContentPane().setLayout(new CardLayout(0, 0));
		Connection con=(Connection)createMysqlConnection.connection();
		try
		{
			//Connection con=(Connection)createMysqlConnection.connection();
			JOptionPane.showMessageDialog(null,"conneced to database");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex);
		}
		
		
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(true);
				panel_3.setVisible(false);
		    
				String q1="select *from model where modelName=?";
				String text= btnNewButton_15.getText();
				//System.out.println(text);
				
			try {
				String model =null;
				int battery=0;
				String acc=null;
				int topSpeed=0;
				int cost=0;
				int now=0;
				String features=null;
				PreparedStatement st1 = (PreparedStatement)con.prepareStatement(q1);
				st1.setString(1, ""+text);
				ResultSet rs1 =st1.executeQuery();
				while(rs1.next())
				{
						model = rs1.getString("modelName");
						battery=rs1.getInt("bateryLife");
						acc=rs1.getString("acceleration");
						topSpeed=rs1.getInt("topSpeed");
						cost=rs1.getInt("cost");
						now=rs1.getInt("noOfWheel");
						features=rs1.getString("otherFeatures");
				}
													
				lblNewLabel_15.setText(model);
				lblNewLabel_17.setText(String.valueOf(battery)+"  kms/charge");
				lblNewLabel_20.setText(acc +"  kmph");
				lblNewLabel_23.setText(String.valueOf(topSpeed)+"  kmph");
				lblNewLabel_27.setText(String.valueOf(cost)+" RS");
				lblNewLabel_29.setText(String.valueOf(now));
				textArea.setText(features);
				st1.close();
			
				String colour="";
				String q2="select *from colour where modelName=?";
				PreparedStatement st2 = (PreparedStatement)con.prepareStatement(q2);
				st2.setString(1, ""+text);
				ResultSet rs2 =st2.executeQuery();
				    while(rs2.next())
				    {
				    	colour =  colour + rs2.getString("colour")+"    ";
				    }
				    lblNewLabel_30.setText(colour);
				   st2.close();
				}catch(SQLException sqlException) {
		            sqlException.printStackTrace();
		        }
				catch(Exception ex)
				{
					System.out.println(ex);
				}
		
			}
		});
		
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(true);
				panel_3.setVisible(false);
		    
				String q1="select *from model where modelName=?";
				String text= btnNewButton_16.getText();
				
			try {
				String model =null;
				int battery=0;
				String acc=null;
				int topSpeed=0;
				int cost=0;
				int now=0;
				String features=null;
				PreparedStatement st1 = (PreparedStatement)con.prepareStatement(q1);
				st1.setString(1, ""+text);
				ResultSet rs1 =st1.executeQuery();
				while(rs1.next())
				{
						model = rs1.getString("modelName");
						battery=rs1.getInt("bateryLife");
						acc=rs1.getString("acceleration");
						topSpeed=rs1.getInt("topSpeed");
						cost=rs1.getInt("cost");
						now=rs1.getInt("noOfWheel");
						features=rs1.getString("otherFeatures");
				}
													
				lblNewLabel_15.setText(model);
				lblNewLabel_17.setText(String.valueOf(battery)+"  kms/charge");
				lblNewLabel_20.setText(acc +"  kmph");
				lblNewLabel_23.setText(String.valueOf(topSpeed)+"  kmph");
				lblNewLabel_27.setText(String.valueOf(cost)+" RS");
				lblNewLabel_29.setText(String.valueOf(now));
				textArea.setText(features);
				st1.close();
			
				String colour="";
				String q2="select *from colour where modelName=?";
				PreparedStatement st2 = (PreparedStatement)con.prepareStatement(q2);
				st2.setString(1, ""+text);
				ResultSet rs2 =st2.executeQuery();
				    while(rs2.next())
				    {
				    	colour =  colour + rs2.getString("colour")+"    ";
				    }
				    lblNewLabel_30.setText(colour);
				   st2.close();
				}catch(SQLException sqlException) {
		            sqlException.printStackTrace();
		        }
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(true);
				panel_5.setVisible(false);
		    
				String q1="select *from model where modelName=?";
				String text= btnNewButton_18.getText();
				
			try {
				String model =null;
				int battery=0;
				String acc=null;
				int topSpeed=0;
				int cost=0;
				int now=0;
				String features=null;
				PreparedStatement st1 = (PreparedStatement)con.prepareStatement(q1);
				st1.setString(1, ""+text);
				ResultSet rs1 =st1.executeQuery();
				while(rs1.next())
				{
						model = rs1.getString("modelName");
						battery=rs1.getInt("bateryLife");
						acc=rs1.getString("acceleration");
						topSpeed=rs1.getInt("topSpeed");
						cost=rs1.getInt("cost");
						now=rs1.getInt("noOfWheel");
						features=rs1.getString("otherFeatures");
				}
													
				lblNewLabel_15.setText(model);
				lblNewLabel_17.setText(String.valueOf(battery)+"  kms/charge");
				lblNewLabel_20.setText(acc +"  kmph");
				lblNewLabel_23.setText(String.valueOf(topSpeed)+"  kmph");
				lblNewLabel_27.setText(String.valueOf(cost)+" RS");
				lblNewLabel_29.setText(String.valueOf(now));
				textArea.setText(features);
				st1.close();
			
				String colour="";
				String q2="select *from colour where modelName=?";
				PreparedStatement st2 = (PreparedStatement)con.prepareStatement(q2);
				st2.setString(1, ""+text);
				ResultSet rs2 =st2.executeQuery();
				    while(rs2.next())
				    {
				    	colour =  colour + rs2.getString("colour")+"    ";
				    }
				    lblNewLabel_30.setText(colour);
				   st2.close();
				}catch(SQLException sqlException) {
		            sqlException.printStackTrace();
		        }
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		frmElectricalVehicleShowroom.getContentPane().add(panel_1, "name_12870483891300");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User name ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(149, 146,89,31);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(149, 212, 89, 24);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setBounds(248, 146, 213, 31);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passwordField.setBounds(248, 209, 213, 31);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(127, 255, 212));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{

					String s = textField.getText();
					String n = passwordField.getText();
					
					
				   if(n.equals("1234") && s.equals("group16") )
				   {
					   panel_2.setVisible(true);
					   panel_1.setVisible(false);
				   }
				   else
				   {
					   JOptionPane.showMessageDialog(null,"wrong username or password");
				   }
				
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(285, 284, 131, 31);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("VEHICLE SHOWROOM MANAGEMENT SYSTEM");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_9.setBounds(101, 79, 557, 31);
		panel_1.add(lblNewLabel_9);
		panel_2.setBackground(Color.RED);
		frmElectricalVehicleShowroom.getContentPane().add(panel_2, "name_12893698984500");
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("TESLA");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='TESLA'";
					String q1="select *from model where companyName='TESLA'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
							btnNewButton_15.setBackground(new Color(255, 255, 255));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 16));
							btnNewButton_16.setBackground(new Color(255, 255, 255));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 18));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);
		
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(150, 53, 454, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("NISSAN");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='NISSAN'";
					String q1="select *from model where companyName='NISSAN'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(150, 87, 454, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CHEVROLET");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_5.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='CHEVROLET'";
					String q1="select *from model where companyName='CHEVROLET'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5_1.setText(nationality);
					lblNewLabel_7_1.setText(String.valueOf(nos));
					txtrLoanScheme_1.setText(loan);
					lblNewLabel_11_1.setText(String.valueOf(totalSale));
					lblNewLabel_13_1.setText(website);
					lblNewLabel_18.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{		
							btnNewButton_18.setText(model);
							btnNewButton_18.setFont(new Font("Times New Roman", Font.BOLD, 16));
							btnNewButton_18.setBackground(new Color(255, 255, 255));
							btnNewButton_18.setBounds(222, 284, 183, 23);
							panel_5.add(btnNewButton_18);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 18));
				lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_18.setBounds(219, 11, 190, 32);
				panel_5.add(lblNewLabel_18);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(150, 121, 454, 23);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("FORD");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='FORD'";
					String q1="select *from model where companyName='FORD'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);	
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(150, 155, 454, 23);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("BMW");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_5.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='BMW'";
					String q1="select *from model where companyName='BMW'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5_1.setText(nationality);
					lblNewLabel_7_1.setText(String.valueOf(nos));
					txtrLoanScheme_1.setText(loan);
					lblNewLabel_11_1.setText(String.valueOf(totalSale));
					lblNewLabel_13_1.setText(website);
					lblNewLabel_18.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{		
							btnNewButton_18.setText(model);
							btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_18.setBounds(222, 284, 183, 23);
							panel_5.add(btnNewButton_18);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_18.setBounds(219, 11, 190, 32);
				panel_5.add(lblNewLabel_18);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_5.setBounds(150, 189, 454, 23);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("KIA");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='KIA'";
					String q1="select *from model where companyName='KIA'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);	
			}
			
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_6.setBounds(150, 223, 454, 23);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("MAHINDRA ELECTRIC");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='MAHINDRA ELECTRIC'";
					String q1="select *from model where companyName='MAHINDRA ELECTRIC'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_7.setBounds(150, 257, 454, 23);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("HERO ELECTRIC");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='HERO ELECTRIC'";
					String q1="select *from model where companyName='HERO ELECTRIC'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_8.setBounds(150, 292, 454, 23);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("TATA MOTORS");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='TATA MOTORS'";
					String q1="select *from model where companyName='TATA MOTORS'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_9.setBounds(150, 326, 454, 23);
		panel_2.add(btnNewButton_9);
		
		JLabel lblNewLabel_2 = new JLabel("SELECT THE COMPANY OF CAR YOU WANT TO SEE");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(97, 11, 575, 23);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_12 = new JButton("VOLKSWAGEN");
		btnNewButton_12.setBackground(new Color(255, 255, 255));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				
				String company=null;
				String nationality=null;
				int  nos=0;
				String loan=null;
				int totalSale=0;
				String website=null;
			   			    
			    int count=0;
				
				try
				{
					Statement st = con.createStatement();
					String q="select *from company where companyName='VOLKSWAGEN'";
					String q1="select *from model where companyName='VOLKSWAGEN'";
		
					ResultSet rs =st.executeQuery(q);
					
					while(rs.next())
					{
						company = rs.getString("companyName");
						nationality = rs.getString("nationality");
						nos = rs.getInt("NoOfServiceCenter");
						totalSale = rs.getInt("totalSale");
						loan = rs.getString("loanScheme");
						website = rs.getString("website");
					}
					lblNewLabel_5.setText(nationality);
					lblNewLabel_7.setText(String.valueOf(nos));
					txtrLoanScheme.setText(loan);
					lblNewLabel_11.setText(String.valueOf(totalSale));
					lblNewLabel_13.setText(website);
					lblNewLabel_14.setText(company);
					
					st.close();
					
					Statement st1 = con.createStatement();
					ResultSet rs1 =st1.executeQuery(q1);
					while(rs1.next())
					{

						String model = rs1.getString("modelName");
					   
						if(count==0)
						{
							
							btnNewButton_15.setText(model);
							btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_15.setBounds(222, 284, 183, 23);
							panel_3.add(btnNewButton_15);
						}
						else if(count==1)
						{
							btnNewButton_16.setText(model);
							btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 14));
							btnNewButton_16.setBounds(222, 335, 183, 23);
							panel_3.add(btnNewButton_16);
						}
						count++;
						st.close();
					}
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex);
				}
						
				lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_14.setBounds(219, 11, 190, 32);
				panel_3.add(lblNewLabel_14);		
			}
		});
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_12.setBounds(150, 360, 454, 23);
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("BACK");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_13.setBackground(new Color(255, 255, 255));

		btnNewButton_13.setBounds(10, 403, 112, 23);
		panel_2.add(btnNewButton_13);
		
		panel_3.setBackground(new Color(0, 255, 255));
		frmElectricalVehicleShowroom.getContentPane().add(panel_3, "name_12934410042700");
		panel_3.setLayout(null);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("NATIONALITY :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 50, 133, 22);
		panel_3.add(lblNewLabel_4);
		
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(133, 54, 516, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NO OF SERVICE CENTER :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(10, 91, 208, 14);
		panel_3.add(lblNewLabel_6);
		
		
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(228, 91, 444, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("LOAN SCHEME :");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(10, 128, 133, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL SALE :");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10.setBounds(10, 191, 116, 14);
		panel_3.add(lblNewLabel_10);
		
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(133, 191, 535, 14);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("WEBSITE :");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12.setBounds(10, 228, 90, 14);
		panel_3.add(lblNewLabel_12);
		
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(99, 228, 550, 14);
		panel_3.add(lblNewLabel_13);
		
		txtrLoanScheme.setEditable(false);
		txtrLoanScheme.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrLoanScheme.setBackground(new Color(0, 255, 255));
		txtrLoanScheme.setLineWrap(true);
		txtrLoanScheme.setBounds(144, 125, 488, 54);
		panel_3.add(txtrLoanScheme);
		
		JButton btnNewButton_14 = new JButton("BACK");
		btnNewButton_14.setBackground(new Color(255, 255, 255));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_3.setVisible(false);
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_14.setBounds(21, 399, 105, 23);
		panel_3.add(btnNewButton_14);
			
		
		panel_4.setBackground(new Color(0, 250, 154));
		frmElectricalVehicleShowroom.getContentPane().add(panel_4, "name_20796731715900");
		panel_4.setLayout(null);
		
		
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(10, 28, 194, 29);
		panel_4.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("BATTERY LIFE :");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_16.setBounds(10, 88, 119, 23);
		panel_4.add(lblNewLabel_16);
		
		JList list = new JList();
		list.setBounds(55, 89, 1, 1);
		panel_4.add(list);
		
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(128, 88, 278, 23);
		panel_4.add(lblNewLabel_17);
		
		JLabel lblNewLabel_19 = new JLabel("ACCELERATION :");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_19.setBounds(10, 134, 133, 23);
		panel_4.add(lblNewLabel_19);
		
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(151, 134, 278, 23);
		panel_4.add(lblNewLabel_20);
		
		JLabel lblNewLabel_22 = new JLabel("TOP SPEED :");
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_22.setBounds(10, 178, 98, 23);
		panel_4.add(lblNewLabel_22);
		
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(120, 179, 230, 22);
		panel_4.add(lblNewLabel_23);
		
		JLabel lblNewLabel_25 = new JLabel("COLOUR VARIANTS :");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_25.setBounds(10, 303, 163, 23);
		panel_4.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("COST :");
		lblNewLabel_26.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_26.setBounds(10, 218, 65, 22);
		panel_4.add(lblNewLabel_26);
		
		lblNewLabel_27.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_27.setBounds(85, 221, 216, 17);
		panel_4.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("NUMBER OF WHEEL :");
		lblNewLabel_28.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_28.setBounds(10, 258, 149, 23);
		panel_4.add(lblNewLabel_28);
		
		lblNewLabel_29.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_29.setBounds(177, 261, 216, 17);
		panel_4.add(lblNewLabel_29);
		lblNewLabel_30.setBackground(new Color(0, 0, 0));
		
		lblNewLabel_30.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_30.setBounds(187, 303, 507, 20);
		panel_4.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("OTHER FEATURES :");
		lblNewLabel_31.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_31.setBounds(10, 349, 148, 14);
		panel_4.add(lblNewLabel_31);
		
		textArea.setBackground(new Color(0, 250, 154));
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textArea.setLineWrap(true);
		textArea.setBounds(158, 349, 536, 68);
		panel_4.add(textArea);
		
		JButton btnNewButton_17 = new JButton("BACK");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_4.setVisible(false);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_17.setBounds(19, 428, 110, 23);
		panel_4.add(btnNewButton_17);

		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 255, 255));
		frmElectricalVehicleShowroom.getContentPane().add(panel_5, "name_171248623063000");
		
		JLabel lblNewLabel_4_1 = new JLabel("NATIONALITY :");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(10, 50, 129, 22);
		panel_5.add(lblNewLabel_4_1);
		
		
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_5_1.setBounds(133, 54, 516, 14);
		panel_5.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("NO OF SERVICE CENTER :");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(10, 91, 205, 14);
		panel_5.add(lblNewLabel_6_1);
		
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7_1.setBounds(219, 91, 444, 14);
		panel_5.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("LOAN SCHEME :");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8_1.setBounds(10, 128, 138, 14);
		panel_5.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("TOTAL SALE :");
		lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10_1.setBounds(10, 191, 115, 14);
		panel_5.add(lblNewLabel_10_1);
		
		lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_11_1.setBounds(133, 191, 535, 14);
		panel_5.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("WEBSITE :");
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12_1.setBounds(10, 228, 89, 14);
		panel_5.add(lblNewLabel_12_1);
		
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_13_1.setBounds(99, 228, 550, 14);
		panel_5.add(lblNewLabel_13_1);
		
		txtrLoanScheme_1.setLineWrap(true);
		txtrLoanScheme_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrLoanScheme_1.setEditable(false);
		txtrLoanScheme_1.setBackground(new Color(0, 255, 255));
		txtrLoanScheme_1.setBounds(147, 124, 535, 54);
		panel_5.add(txtrLoanScheme_1);
		
		JButton btnNewButton_14_1 = new JButton("BACK");
		btnNewButton_14_1.setBackground(new Color(255, 255, 255));
		btnNewButton_14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_5.setVisible(false);
			}
		});
		btnNewButton_14_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_14_1.setBounds(10, 360, 115, 23);
		panel_5.add(btnNewButton_14_1);
	}
}
