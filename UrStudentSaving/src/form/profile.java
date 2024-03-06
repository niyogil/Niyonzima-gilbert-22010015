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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxtf;
	private JTextField nametxtf;
	private JTextField regntxtf;
	private JTextField gendtxtf;
	private JTextField facutxtf;
	private JTextField phonetxtf;
	private JTextField emailtxtf;
	private JTextField addtxtf;
	private JTextField passtxtf;
	private JTextField conftxtf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile frame = new profile();
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
	public profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("students profile");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(123, 11, 260, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 65, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 101, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("reg number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 140, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 176, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("faculty");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 216, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("phone number");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 249, 89, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("email");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 280, 49, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("address");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 325, 49, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("password");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(10, 364, 89, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("confirm password");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(10, 399, 105, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ur_students_saving_system","root","");
		String sql="INSERT INTO students profile VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtxtf.getText()));
		st.setString(2,nametxtf.getText());
		st.setString(3, regntxtf.getText());
		st.setString(4, gendtxtf.getText());
		st.setString(5, facutxtf.getText());
		st.setString(6, phonetxtf.getText());
		st.setString(7, emailtxtf.getText() );
            st.setString(8, addtxtf.getText());
            st.setString(9, passtxtf.getText());
            st.setString(10, conftxtf.getText());
	
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}	
				
				
				
				
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 440, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {idtxtf.setText(null);
			nametxtf.setText(null);
			regntxtf.setText(null);
			gendtxtf.setText(null);
			facutxtf.setText(null);
            phonetxtf.setText(null);
            emailtxtf.setText(null);
            addtxtf.setText(null);
            passtxtf.setText(null);
            conftxtf.setText(null);
			
			
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(123, 440, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("update");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(210, 440, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("view");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(307, 440, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(406, 440, 89, 23);
		contentPane.add(btnNewButton_4);
		
		idtxtf = new JTextField();
		idtxtf.setBounds(257, 62, 96, 20);
		contentPane.add(idtxtf);
		idtxtf.setColumns(10);
		
		nametxtf = new JTextField();
		nametxtf.setBounds(257, 98, 96, 20);
		contentPane.add(nametxtf);
		nametxtf.setColumns(10);
		
		regntxtf = new JTextField();
		regntxtf.setBounds(257, 137, 96, 20);
		contentPane.add(regntxtf);
		regntxtf.setColumns(10);
		
		gendtxtf = new JTextField();
		gendtxtf.setBounds(257, 173, 96, 20);
		contentPane.add(gendtxtf);
		gendtxtf.setColumns(10);
		
		facutxtf = new JTextField();
		facutxtf.setBounds(257, 213, 96, 20);
		contentPane.add(facutxtf);
		facutxtf.setColumns(10);
		
		phonetxtf = new JTextField();
		phonetxtf.setBounds(257, 246, 96, 20);
		contentPane.add(phonetxtf);
		phonetxtf.setColumns(10);
		
		emailtxtf = new JTextField();
		emailtxtf.setBounds(257, 277, 96, 20);
		contentPane.add(emailtxtf);
		emailtxtf.setColumns(10);
		
		addtxtf = new JTextField();
		addtxtf.setBounds(257, 322, 96, 20);
		contentPane.add(addtxtf);
		addtxtf.setColumns(10);
		
		passtxtf = new JTextField();
		passtxtf.setBounds(257, 361, 96, 20);
		contentPane.add(passtxtf);
		passtxtf.setColumns(10);
		
		conftxtf = new JTextField();
		conftxtf.setBounds(257, 396, 96, 20);
		contentPane.add(conftxtf);
		conftxtf.setColumns(10);
	}

}
