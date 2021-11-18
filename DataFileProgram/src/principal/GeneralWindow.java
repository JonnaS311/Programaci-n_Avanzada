package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GeneralWindow extends JFrame {

	private JPanel contentPane;
	private JLabel nom;

	public GeneralWindow() {
		setTitle("Data File");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GeneralWindow.class.getResource("/resources/ICONO.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/999.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 65, 112);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/ju (2).jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(244, 135, 285, 275);
		contentPane.add(lblNewLabel_1);
		
		nom = new JLabel("Data File Program ");
		nom.setHorizontalAlignment(SwingConstants.RIGHT);
		nom.setBounds(686, 466, 108, 20);
		contentPane.add(nom);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/salir_preview_rev_1 (1).png")));
		btnNewButton.setBounds(738, 0, 48, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/tr.jpg")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(82, 150, 116, 47);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/tr.jpg")));
		lblNewLabel_3_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(82, 282, 116, 47);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("Eliminar Datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EliminateWindow eliminate = new EliminateWindow();
				close();
				eliminate.setVisible(true);
				
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton_1.setBounds(67, 208, 148, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Agregar Datos");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterWindow register = new RegisterWindow();
				close();
				register.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(67, 340, 148, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/tri.jpg")));
		lblNewLabel_3_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(571, 150, 116, 47);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/tri.jpg")));
		lblNewLabel_3_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(571, 282, 116, 47);
		contentPane.add(lblNewLabel_3_2_1);
		
		JButton btnNewButton_1_2 = new JButton("Consultar Datos");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consultar consultar = new Consultar();
				
				String nombreAux = JOptionPane.showInputDialog(null, "Por favor ingrese el nombre del usuario.");
				String codAux = JOptionPane.showInputDialog(null, "Por favor ingrese el código del usuario.");
				
				consultar.setCod(codAux);
				consultar.setNom(nombreAux);
				consultar.operacion();
				if(consultar.existeUser()) {
					JOptionPane.showInternalMessageDialog(null, "Los datos ingresado si estan registrados en el sistema.");
					
				}else {
					JOptionPane.showInternalMessageDialog(null, "Los datos ingresados no estan registrados en el sistema.");
				}
				
			}
			
		});
		btnNewButton_1_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(554, 208, 148, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Organizar Datos");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrgWindow org = new OrgWindow();
				close();
				org.setVisible(true);
			}
		});
		btnNewButton_1_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton_1_3.setFocusPainted(false);
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(554, 340, 148, 23);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/111 (1).jpg")));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(244, 55, 285, 54);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfWindow window = new InfWindow();
				close();
				window.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/inf_preview_rev_1 (1).png")));
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(738, 49, 48, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginWindow login = new LoginWindow();
				close();
				login.setVisible(true);
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/back_preview_rev_1 (1).png")));
		btnNewButton_2_1.setForeground(Color.ORANGE);
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(Color.ORANGE);
		btnNewButton_2_1.setBounds(738, 98, 48, 47);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(GeneralWindow.class.getResource("/resources/78 (1).jpg")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 390, 162, 96);
		contentPane.add(lblNewLabel_5);
	}
	
	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}
}
