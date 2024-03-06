package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class students extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtextf;
	private JTextField nametextf;
	private JTextField regtextf;
	private JTextField emailtextf;
	private JTextField facultytextf;
	private JTextField phonetextf;
	private JTextField passtextf;
	private JTextField conftextf;
	private JTextField gendertextf;
	private JTextField addresstextf;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					students frame = new students();
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
	public students() {
		setTitle("students");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 697);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(28, 98, 49, 20);
		contentPane.add(lblNewLabel);
		
		idtextf = new JTextField();
		idtextf.setBounds(257, 46, 357, 31);
		contentPane.add(idtextf);
		idtextf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("reg number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(28, 142, 96, 21);
		contentPane.add(lblNewLabel_1);
		
		nametextf = new JTextField();
		nametextf.setBounds(257, 94, 357, 33);
		contentPane.add(nametextf);
		nametextf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("faculty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(28, 174, 65, 0);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("phone");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(28, 287, 49, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(28, 198, 49, 0);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("id");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(28, 63, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		regtextf = new JTextField();
		regtextf.setBounds(257, 139, 357, 31);
		contentPane.add(regtextf);
		regtextf.setColumns(10);
		
		emailtextf = new JTextField();
		emailtextf.setBounds(257, 174, 357, 31);
		contentPane.add(emailtextf);
		emailtextf.setColumns(10);
		
		facultytextf = new JTextField();
		facultytextf.setBounds(257, 216, 357, 31);
		contentPane.add(facultytextf);
		facultytextf.setColumns(10);
		
		phonetextf = new JTextField();
		phonetextf.setBounds(257, 270, 357, 31);
		contentPane.add(phonetextf);
		phonetextf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(28, 184, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("faculty");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(28, 234, 65, 18);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("student  registration details");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_10.setBounds(168, 11, 324, 24);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
			String sql="INSERT INTO students VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(idtextf.getText()));
			st.setString(2, nametextf.getText());
			st.setString(3, regtextf.getText());
			st.setString(4, emailtextf.getText());
			st.setString(5, facultytextf.getText());
			st.setString(6, phonetextf.getText());
			st.setString(7, passtextf.getText());
			st.setString(8, conftextf.getText());
			st.setString(9, gendertextf.getText());
			st.setString(10, addresstextf.getText());
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}	
					
				login ad = new login(); 
				if(e.getSource()==btnNewButton) {
					ad.main(new String[0]);		
				}
					
	
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(28, 588, 96, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idtextf.setText(null);
				nametextf.setText(null);
				regtextf.setText(null);
				emailtextf.setText(null);
				facultytextf.setText(null);
				phonetextf.setText(null);
				passtextf.setText(null);
			    conftextf.setText(null);
				gendertextf.setText(null);
				addresstextf.setText(null);;
				
			}
		});
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(347, 588, 105, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("password");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(28, 334, 114, 34);
		contentPane.add(lblNewLabel_8);
		
		passtextf = new JTextField();
		passtextf.setBounds(257, 334, 357, 31);
		contentPane.add(passtextf);
		passtextf.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("confirm password");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(28, 387, 173, 28);
		contentPane.add(lblNewLabel_9);
		
		conftextf = new JTextField();
		conftextf.setBounds(257, 388, 357, 31);
		contentPane.add(conftextf);
		conftextf.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("gender");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(28, 444, 114, 25);
		contentPane.add(lblNewLabel_11);
		
		gendertextf = new JTextField();
		gendertextf.setBounds(257, 443, 357, 31);
		contentPane.add(gendertextf);
		gendertextf.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("address");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(28, 499, 96, 31);
		contentPane.add(lblNewLabel_12);
		
		addresstextf = new JTextField();
		addresstextf.setBounds(257, 501, 357, 31);
		contentPane.add(addresstextf);
		addresstextf.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("view");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
					java.sql.Statement st=con.createStatement();
					String query="SELECT * FROM students";
					ResultSet rs=st.executeQuery(query);
					java.sql.ResultSetMetaData rsdm=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					int cols=rsdm.getColumnCount();
					String[]colName=new String[cols];
					for(int i=0;i<cols;i++)
					colName[i]=rsdm.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String id,name,regnumber,email,faculty,phone,password,confirmpassword,gender,address;
					while(rs.next()) {
						id=rs.getString(1);
						name=rs.getString(2);
	                     regnumber = rs.getString(3);
						email=rs.getString(4);
						faculty=rs.getString(5);
						phone=rs.getString(6);
						password=rs.getString(7);
						confirmpassword=rs.getString(8);
						gender=rs.getString(9);
	                    address=rs.getString(10);
				
						String[]row= {id,name,regnumber,email,faculty,phone,password,confirmpassword,gender,address};	
						model.addRow(row);
						
								
					}
					
					
				}catch (Exception e2) {
					// TODO: handle exception
				}
					
				
				}

			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(134, 588, 89, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
				String sql="UPDATE students SET name=?,reg number=?,email=?,faculty=?,phone=?,password=?,confirm_password=?,gender=?,address=? WHERE id=?";					
				PreparedStatement st=con.prepareStatement(sql);

				st.setString(1,nametextf.getText());
				st.setString(2, regtextf.getText());
				st.setString(3, emailtextf.getText());
				st.setString(4, facultytextf.getText());
				st.setString(5, phonetextf.getText());
				st.setString(6,passtextf.getText() );
				st.setString(7,conftextf.getText() );
				st.setString(8,gendertextf.getText()) ;
				st.setString(9, addresstextf.getText());
				st.setInt(10, Integer.parseInt(idtextf.getText()));					
									
									
				JOptionPane.showMessageDialog(btnNewButton_3, "data changed!!!");
				st.executeUpdate();
				st.close();
				con.close();
									
									
									
									
								} catch (Exception e2) {
									// TODO: handle exception
								}
								
								
								
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(233, 591, 89, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			private int idtxf;

			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");	
					String sql="DELETE FROM students WHERE  id=?";
					int idtxf=Integer.parseInt(JOptionPane.showInputDialog("Enter  to delete ")); 
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1, idtxf);
					Component Delete;
					JOptionPane.showMessageDialog(btnNewButton_4, "recored out!!");
					st.executeUpdate();
					st.close();
					con.close();
					
					
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}	
					
				}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(500, 576, 114, 43);
		contentPane.add(btnNewButton_4);
		
		table = new JTable();
		table.setBounds(624, 39, 484, 505);
		contentPane.add(table);
	}
}
