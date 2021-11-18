package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InfWindow extends JFrame {

	private JPanel contentPane;

	
	public InfWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InfWindow.class.getResource("/resources/ICONO.png")));
		setTitle("Data File ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InfWindow.class.getResource("/resources/Copia de  Isometric SEO Strategy by Slidesgo_ (7) (3).jpg")));
		lblNewLabel.setBounds(0, 0, 819, 417);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneralWindow general = new GeneralWindow();
				close();
				general.setVisible(true);
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 427, 182, 23);
		contentPane.add(btnNewButton);
	}
	
	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}

}
