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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JButton btnIngresar;
	private JButton btnRegistrarse;
	private JPasswordField textCodigo;
	private Consultar consultar = new Consultar();
	

	public LoginWindow() {
		setTitle("Data File");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginWindow.class.getResource("/resources/ICONO.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(LoginWindow.class.getResource("/resources/esquina (2).jpg")));
		imagen.setBounds(340, 0, 444, 460);
		contentPane.add(imagen);
		
		JLabel esquina = new JLabel("");
		esquina.setIcon(new ImageIcon(LoginWindow.class.getResource("/resources/esuina (1).jpg")));
		esquina.setBounds(0, 0, 240, 138);
		contentPane.add(esquina);
		
		textNombre = new JTextField();
		textNombre.setBounds(82, 182, 222, 39);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre y Apellido");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(80, 164, 124, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("C\u00F3digo Estudiantil");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(82, 242, 124, 14);
		contentPane.add(lblNewLabel_2_1);
		
		btnIngresar = new JButton("Ingresar ");
		btnIngresar.setFocusPainted(false);
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setFont(new Font("Century", Font.PLAIN, 14));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorPass = new String(textCodigo.getPassword());
				
				consultar.setCod(valorPass);
				consultar.setNom(textNombre.getText());
				consultar.operacion();
				if(consultar.existeUser()) {
					GeneralWindow general = new GeneralWindow();
					close();
					general.setVisible(true);
					
				}else {
					JOptionPane.showInternalMessageDialog(null, "Los datos ingresado no estan registrados, por favor registre su usuario");
				}
				
			}
		});
		btnIngresar.setBackground(Color.ORANGE);
		btnIngresar.setBounds(83, 336, 221, 23);
		contentPane.add(btnIngresar);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFocusPainted(false);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterWindow register = new RegisterWindow();
				close();
				register.setVisible(true);
				
			}
		});
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setBackground(Color.ORANGE);
		btnRegistrarse.setFont(new Font("Century", Font.PLAIN, 14));
		btnRegistrarse.setBounds(82, 370, 221, 23);
		contentPane.add(btnRegistrarse);
		
		textCodigo = new JPasswordField();
		textCodigo.setBounds(82, 259, 222, 39);
		contentPane.add(textCodigo);
	}
	
	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}

}
