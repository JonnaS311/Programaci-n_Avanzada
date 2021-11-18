package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class RegisterWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public RegisterWindow() {
		setTitle("Data File");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegisterWindow.class.getResource("/resources/ICONO.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 491);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RegisterWindow.class.getResource("/resources/er (1).jpg")));
		lblNewLabel.setBounds(0, 0, 440, 462);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(459, 144, 222, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(459, 220, 222, 39);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre y Apellido");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(461, 122, 128, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo Estudiantil");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(453, 199, 128, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorPass = new String(passwordField.getPassword());
				
				
				User user = new User(valorPass,textField.getText());
				
				Insertar insertar = new Insertar(user);
				insertar.operacion();
				if(insertar.message()!=true) {
					JOptionPane.showInternalMessageDialog(null, "Los datos ingresado no pueden ser registrados.Intente con otro usuario.");
					
				}else {
					
					JOptionPane.showInternalMessageDialog(null, "Registro exitoso.");
					
				}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(459, 280, 222, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginWindow login = new LoginWindow();
				close();
				login.setVisible(true);
				
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.setBounds(459, 314, 222, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(RegisterWindow.class.getResource("/resources/ew (1).jpg")));
		lblNewLabel_2.setBounds(720, 348, 65, 114);
		contentPane.add(lblNewLabel_2);
	}
	
	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}

}
