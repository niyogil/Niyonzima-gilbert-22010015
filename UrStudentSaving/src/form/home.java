package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(26, 37, 116, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountt ad = new accountt(); 
				if(e.getSource()==btnNewButton_2) {
					ad.main(new String[0]);		
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(243, 115, 110, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("students profile");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				students ad= new students(); 
				if(e.getSource()==btnNewButton_4) {
					ad.main(new String[0]);		
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(454, 37, 222, 57);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("accountant");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountant ad = new accountant(); 
				if(e.getSource()==btnNewButton_1) {
					ad.main(new String[0]);		
				}
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(38, 263, 140, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("admin");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin ad = new admin(); 
				if(e.getSource()==btnNewButton_3) {
					ad.main(new String[0]);		
				}
			}
		});
		btnNewButton_3.setBackground(new Color(255, 128, 64));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_3.setBounds(252, 334, 116, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("manager");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager ad = new manager(); 
				if(e.getSource()==btnNewButton_5) {
					ad.main(new String[0]);		
				}
			}
		});
		btnNewButton_5.setBackground(new Color(255, 128, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_5.setBounds(439, 263, 155, 40);
		contentPane.add(btnNewButton_5);
	}
}
