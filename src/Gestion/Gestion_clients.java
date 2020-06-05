package Gestion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
 

@SuppressWarnings("serial")
public class Gestion_clients extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public JLayeredPane layeredPane ; 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion_clients frame = new Gestion_clients();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchPanels(JPanel panel)
	{  	
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	public Gestion_clients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 819);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clients");
		lblNewLabel.setBounds(287, 22, 293, 44);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 342, -4);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 77, 658, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton_3 = new JButton("Menu");
		btnNewButton_3.setBounds(22, 724, 149, 37);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(231, 274, 1, 1);
		contentPane.add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(22, 155, 632, 562);
		contentPane.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		JPanel Ajouter = new JPanel();
		layeredPane_1.add(Ajouter, "name_5047906354700");
		Ajouter.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(42, 55, 96, 25);
		Ajouter.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(42, 122, 94, 25);
		Ajouter.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adresse");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(42, 191, 96, 25);
		Ajouter.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("N\u00B0GSM");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(42, 268, 102, 25);
		Ajouter.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Permis");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(42, 344, 102, 25);
		Ajouter.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CIN");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(42, 433, 102, 25);
		Ajouter.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(283, 54, 176, 32);
		Ajouter.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(284, 121, 175, 32);
		Ajouter.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(283, 190, 176, 32);
		Ajouter.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(283, 267, 176, 32);
		Ajouter.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(283, 343, 176, 32);
		Ajouter.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(283, 432, 176, 32);
		Ajouter.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel Rechercher = new JPanel();
		layeredPane_1.add(Rechercher, "name_5059345312200");
		Rechercher.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Nom");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(49, 117, 136, 35);
		Rechercher.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(195, 119, 160, 35);
		Rechercher.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Afficher");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(494, 117, 109, 35);
		Rechercher.add(btnNewButton_1);
		
		JPanel Modifier = new JPanel();
		layeredPane_1.add(Modifier, "name_5062422980900");
		Modifier.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Nom");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(127, 125, 127, 36);
		Modifier.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(282, 128, 153, 36);
		Modifier.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Modifier");
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(127, 302, 119, 36);
		Modifier.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Supprimer");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(456, 302, 127, 36);
		Modifier.add(btnNewButton_4);
		
		JPanel Liste = new JPanel();
		layeredPane_1.add(Liste, "name_5065960281100");
		
		JButton btn_ajouter = new JButton("Ajouter");
		btn_ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Ajouter);
			}
		});
		btn_ajouter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_ajouter.setBounds(22, 97, 142, 37);
		contentPane.add(btn_ajouter);
		
		JButton btn_recherche = new JButton("Rechercher");
		btn_recherche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Rechercher);
			}
		});
		btn_recherche.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_recherche.setBounds(185, 97, 125, 37);
		contentPane.add(btn_recherche);
		
		JButton btn_modifier = new JButton("Modifier");
		btn_modifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Modifier);
			}
		});
		btn_modifier.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_modifier.setBounds(343, 97, 134, 37);
		contentPane.add(btn_modifier);
		
		JButton btn_liste = new JButton("Liste");
		btn_liste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Liste);
			}
		});
		btn_liste.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_liste.setBounds(495, 97, 142, 37);
		contentPane.add(btn_liste);
	}
}
