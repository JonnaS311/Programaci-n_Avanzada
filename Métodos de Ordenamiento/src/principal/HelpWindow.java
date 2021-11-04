package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
/** 
 * @version 1.0, 02/11/201
 * @author Briyid Catalina Cruz Ostos & Jonnathan Sotelo Rodr�guez
 */
public class HelpWindow extends JFrame {

	private JPanel contentPane;
        private JMenuBarWindow principal;

	public HelpWindow(JMenuBarWindow principal) {
                this.principal=principal;
		setTitle("Gama|Maths");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HelpWindow.class.getResource("/resources/gamma_preview_rev_1 (1).png")));
		setEnabled(false);
                setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gama Maths Help");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(204, 51, 51));
		lblNewLabel.setFont(new Font("Sitka Heading", Font.ITALIC, 11));
		lblNewLabel.setBounds(254, 11, 119, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HelpWindow.class.getResource("/resources/color.jpg")));
		lblNewLabel_1.setBounds(10, 28, 363, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(HelpWindow.class.getResource("/resources/LOGO (2).png")));
		lblNewLabel_2.setBounds(35, 61, 311, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bubble Method");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(10, 143, 136, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(HelpWindow.class.getResource("/resources/texto01 (1).jpg")));
		lblNewLabel_4.setBounds(10, 159, 363, 58);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Selection Method");
		lblNewLabel_3_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3_1.setBounds(10, 238, 136, 15);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(HelpWindow.class.getResource("/resources/TEXT02 (1).jpg")));
		lblNewLabel_4_1.setBounds(10, 264, 363, 58);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Selection Method");
		lblNewLabel_3_1_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3_1_1.setBounds(10, 333, 136, 15);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(HelpWindow.class.getResource("/resources/TEC3 (1).jpg")));
		lblNewLabel_4_1_1.setBounds(10, 359, 363, 58);
		contentPane.add(lblNewLabel_4_1_1);
                
		JLabel lblNewLabel_5 = new JLabel("POWERED BY GAMA LANGUAGE");
		lblNewLabel_5.setForeground(new Color(204, 51, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.PLAIN, 7));
		lblNewLabel_5.setBounds(247, 444, 126, 15);
		contentPane.add(lblNewLabel_5);
                
                JButton back = new JButton("Back to the previous window");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backActionPerformed(e);
			}
		});
		back.setFont(new Font("Sitka Heading", Font.ITALIC, 12));
		back.setBounds(10, 443, 190, 18);
		contentPane.add(back);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 431, 363, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(248, 248, 255));
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(10, 130, 363, 2);
		contentPane.add(separator_1);
		
	}
    	/**@param evt*/
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                       
       principal.setVisible(true);
       this.setVisible(false);
    } 
}
