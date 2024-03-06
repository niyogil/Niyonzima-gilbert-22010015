package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailtextf;
	private JTextField phonetextf;
	private JTextField agetextf;
	private JTextField addresstextf;
	private JTextField nametextf;
	private JTextField idtextf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		setTitle("admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 99, 66, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 152, 66, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 211, 89, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("age");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 267, 66, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("phone-number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 322, 122, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 379, 66, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("admin details");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(269, 27, 158, 38);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
		String sql="INSERT INTO admin VALUES(?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtextf.getText()));
		st.setString(2, nametextf.getText());
		st.setString(3, addresstextf.getText());
		st.setString(4, agetextf.getText());
		st.setString(5, phonetextf.getText());
		st.setString(6, emailtextf.getText());
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
		
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}	
				
				
				
				
			
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(10, 443, 106, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {idtextf.setText(null);
			nametextf.setText(null);
			agetextf.setText(null);
			emailtextf.setText(null);
			addresstextf.setText(null);
			phonetextf.setText(null);
			
			}
		});
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(275, 443, 106, 51);
		contentPane.add(btnNewButton_1);
		
		emailtextf = new JTextField();
		emailtextf.setBounds(269, 373, 158, 31);
		contentPane.add(emailtextf);
		emailtextf.setColumns(10);
		
		phonetextf = new JTextField();
		phonetextf.setBounds(269, 321, 158, 31);
		contentPane.add(phonetextf);
		phonetextf.setColumns(10);
		
		agetextf = new JTextField();
		agetextf.setBounds(269, 266, 158, 31);
		contentPane.add(agetextf);
		agetextf.setColumns(10);
		
		addresstextf = new JTextField();
		addresstextf.setBounds(269, 210, 158, 31);
		contentPane.add(addresstextf);
		addresstextf.setColumns(10);
		
		nametextf = new JTextField();
		nametextf.setBounds(269, 151, 158, 31);
		contentPane.add(nametextf);
		nametextf.setColumns(10);
		
		idtextf = new JTextField();
		idtextf.setBounds(269, 98, 158, 31);
		contentPane.add(idtextf);
		idtextf.setColumns(10);
	}
}
