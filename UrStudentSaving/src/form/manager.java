package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class manager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtextf;
	private JTextField nametextf;
	private JTextField addresstextf;
	private JTextField agetextf;
	private JTextField qualifictextf;
	private JTextField emailtextf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manager frame = new manager();
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
	public manager() {
		setTitle("manager");
		setForeground(new Color(128, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 70, 49, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 135, 68, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 189, 89, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("age");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 252, 68, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("qualification");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 317, 123, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 383, 68, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("manager details");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(235, 11, 199, 45);
		contentPane.add(lblNewLabel_6);
		
		idtextf = new JTextField();
		idtextf.setBounds(235, 68, 227, 32);
		contentPane.add(idtextf);
		idtextf.setColumns(10);
		
		nametextf = new JTextField();
		nametextf.setBounds(235, 133, 227, 32);
		contentPane.add(nametextf);
		nametextf.setColumns(10);
		
		addresstextf = new JTextField();
		addresstextf.setBounds(235, 187, 227, 32);
		contentPane.add(addresstextf);
		addresstextf.setColumns(10);
		
		agetextf = new JTextField();
		agetextf.setBounds(235, 250, 227, 32);
		contentPane.add(agetextf);
		agetextf.setColumns(10);
		
		qualifictextf = new JTextField();
		qualifictextf.setBounds(235, 315, 227, 32);
		contentPane.add(qualifictextf);
		qualifictextf.setColumns(10);
		
		emailtextf = new JTextField();
		emailtextf.setBounds(235, 376, 227, 32);
		contentPane.add(emailtextf);
		emailtextf.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
		String sql="INSERT INTO manager VALUES(?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtextf.getText()));
		st.setString(2, nametextf.getText());
		st.setString(3, addresstextf.getText());
		st.setString(4, agetextf.getText());
		st.setString(5, qualifictextf.getText());
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
		btnNewButton.setBounds(10, 460, 123, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				idtextf.setText(null);
				nametextf.setText(null);
				addresstextf.setText(null);
				emailtextf.setText(null);
				qualifictextf.setText(null);
				agetextf.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 64));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(282, 460, 113, 44);
		contentPane.add(btnNewButton_1);
	}

}
