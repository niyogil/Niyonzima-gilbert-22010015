package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;

public class accountt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxtf;
	private JTextField nametxtf;
	private JTextField balatxtf;
	private JTextField transtxtf;
	private JTextField datetxtf;
	private JTextField amountdtxtf;
	private JTextField amountwtxtf;
	private JTable tabletable;
	protected AbstractButton table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accountt frame = new accountt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public accountt() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("account details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(109, 11, 181, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 68, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 111, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("balance");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 144, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("transaction");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 187, 89, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 231, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("amount deposit");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 270, 107, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("amount withdraw");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 312, 133, 14);
		contentPane.add(lblNewLabel_7);
		
		idtxtf = new JTextField();
		idtxtf.setBounds(241, 65, 96, 20);
		contentPane.add(idtxtf);
		idtxtf.setColumns(10);
		
		nametxtf = new JTextField();
		nametxtf.setBounds(241, 108, 96, 20);
		contentPane.add(nametxtf);
		nametxtf.setColumns(10);
		
		balatxtf = new JTextField();
		balatxtf.setBounds(241, 141, 96, 20);
		contentPane.add(balatxtf);
		balatxtf.setColumns(10);
		
		transtxtf = new JTextField();
		transtxtf.setBounds(241, 184, 96, 20);
		contentPane.add(transtxtf);
		transtxtf.setColumns(10);
		
		datetxtf = new JTextField();
		datetxtf.setBounds(241, 228, 96, 20);
		contentPane.add(datetxtf);
		datetxtf.setColumns(10);
		
		amountdtxtf = new JTextField();
		amountdtxtf.setBounds(241, 267, 96, 20);
		contentPane.add(amountdtxtf);
		amountdtxtf.setColumns(10);
		
		amountwtxtf = new JTextField();
		amountwtxtf.setBounds(241, 309, 96, 20);
		contentPane.add(amountwtxtf);
		amountwtxtf.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(128, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
		String sql="INSERT INTO account VALUES(?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtxtf.getText()));
		st.setString(2,nametxtf.getText());
		st.setString(3, balatxtf.getText());
		st.setString(4, transtxtf.getText());
		st.setString(5, datetxtf.getText());
		st.setString(6, amountdtxtf.getText());
		st.setString(7, amountwtxtf.getText() );
	
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}	
				
				
				
				
	
			}
		});
		btnNewButton.setBounds(0, 367, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("update");
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
					String sql="UPDATE account SET name=?,email=?,role=?,address=?,gender=?,password=?,confirm_password=? WHERE id=?";					
					PreparedStatement st=con.prepareStatement(sql);

					st.setString(1, nametxtf.getText());
					st.setString(2, balatxtf.getText());
					st.setString(3, transtxtf.getText());
					st.setString(4, datetxtf.getText());
					st.setString(5, amountdtxtf.getText() );
					st.setString(6,amountwtxtf.getText() );					
					st.setInt(7, Integer.parseInt(idtxtf.getText()));					
										
										
					JOptionPane.showMessageDialog(btnNewButton_1, "data changed!!!");
					st.executeUpdate();
					st.close();
					con.close();
										
										
										
										
									} catch (Exception e2) {
										// TODO: handle exception
									}
									
									
									
			}
		});
		btnNewButton_1.setBounds(109, 367, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton tabletable = new JButton("view");
		tabletable.setBackground(new Color(128, 64, 64));
		tabletable.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabletable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
					java.sql.Statement st=con.createStatement();
					String query="SELECT * FROM account";
					ResultSet rs=st.executeQuery(query);
					java.sql.ResultSetMetaData rsdm=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table_1.getModel();
					int cols=rsdm.getColumnCount();
					String[]colName=new String[cols];
					for(int i=0;i<cols;i++)
					colName[i]=rsdm.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String id,name,balance,transaction,date,amountdeposit,amountwithdraw;
					while(rs.next()) {
						id=rs.getString(1);
						name=rs.getString(2);
	                     balance = rs.getString(3);
						transaction =rs.getString(4);
						date=rs.getString(5);
						amountdeposit=rs.getString(6);
						amountwithdraw=rs.getString(7);
				
						String[]row= {id,name,balance,transaction,date,amountdeposit,amountwithdraw};	
						model.addRow(row);
						
								
					}
					
					
				}catch (Exception e2) {
					// TODO: handle exception
				}
					
				
					
				
				}

			
		});
		tabletable.setBounds(219, 367, 89, 23);
		contentPane.add(tabletable);
		
		JButton btnNewButton_3 = new JButton("delete");
		btnNewButton_3.setBackground(new Color(255, 0, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");	
					String sql="DELETE FROM account WHERE  id=?";
					int idtxf=Integer.parseInt(JOptionPane.showInputDialog("Enter  to delete ")); 
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1, idtxf);
					Component Delete;
					JOptionPane.showMessageDialog(btnNewButton_3, "recored out!!");
					st.executeUpdate();
					st.close();
					con.close();
					
					
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}	
			}
		});
		btnNewButton_3.setBounds(332, 367, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("cancel");
		btnNewButton_4.setBackground(new Color(128, 128, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idtxtf.setText(null);
				nametxtf.setText(null);
				balatxtf.setText(null);
				transtxtf.setText(null);
				datetxtf.setText(null);
				amountdtxtf.setText(null);
				amountwtxtf.setText(null);
			}
		});
		btnNewButton_4.setBounds(452, 367, 89, 23);
		contentPane.add(btnNewButton_4);
		
		table_1 = new JTable();
		table_1.setBounds(352, 69, 544, 257);
		contentPane.add(table_1);
	}
}
