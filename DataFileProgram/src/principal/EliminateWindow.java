package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EliminateWindow extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	public EliminateWindow() {
		setTitle("Data File ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EliminateWindow.class.getResource("/resources/ICONO.png")));
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EliminateWindow.class.getResource("/resources/3422 (1).jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(340, 0, 444, 460);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo Estudiantil");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(68, 176, 124, 14);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(68, 201, 222, 39);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(EliminateWindow.class.getResource("/resources/esuina (1).jpg")));
		lblNewLabel_2.setBounds(0, 0, 240, 138);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Eliminar ");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorPass = new String(passwordField.getPassword());
				Retirar retirar = new Retirar(valorPass);
				retirar.operacion();
				JOptionPane.showInternalMessageDialog(null, "Los datos ingresados han sido eliminados.");
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Century", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(68, 273, 222, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneralWindow general = new GeneralWindow();
				close();
				general.setVisible(true);
			}
			
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Century", Font.PLAIN, 14));
		btnBack.setBackground(Color.ORANGE);
		btnBack.setBounds(10, 427, 222, 23);
		contentPane.add(btnBack);
	}
	
	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}
}
