package principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ToolsWindow extends JFrame {

	private JPanel contentPane;
        private GenerateYear genYear= new GenerateYear();
        private int year;
        private String nombre_dia;
        private Festivo f= new Festivo();
        private int festivos_mes;
        private JLabel lblNewLabel_4;
        private JLabel lblNewLabel_5_1;

	public ToolsWindow(int year) {
		setTitle("Calendar PRO");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ToolsWindow.class.getResource("/resources/IconProgram.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                this.year=year;
                genYear.generar_anio(year);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/eyu (1).jpg")));
		lblNewLabel.setBounds(0, 0, 279, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/tiel (1).jpg")));
		lblNewLabel_1.setBounds(341, 0, 541, 105);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Public Holidays");
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 139, 195, 41);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(176, 224, 230));
		separator.setBounds(0, 116, 882, 2);
		contentPane.add(separator);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(290, 160, 65, 20);
		contentPane.add(spinner);
		
                //
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/nav (1).jpg")));
		btnNewButton.setBounds(365, 150, 30, 30);
		contentPane.add(btnNewButton);
                
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            day_holiday(spinner);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Leap Year");
		lblNewLabel_3.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 191, 195, 32);
		contentPane.add(lblNewLabel_3);
		
                //numero dias festivos
		lblNewLabel_4 = new JLabel(festivos_mes+"");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_4.setBounds(215, 139, 46, 41);
		contentPane.add(lblNewLabel_4);
                
                //para anio bisiesto
		JLabel lblNewLabel_5 = new JLabel();
                if(genYear.anio_Bisiesto()){
                    lblNewLabel_5.setText("Yes");
                }
                else{
                     lblNewLabel_5.setText("No");
                }
		lblNewLabel_5.setForeground(new Color(169, 169, 169));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5.setBounds(215, 191, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(new Color(176, 224, 230));
		separator_1.setBounds(0, 234, 882, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_6 = new JLabel("Name of the Day");
		lblNewLabel_6.setFont(new Font("Segoe Script", Font.BOLD, 13));
		lblNewLabel_6.setBounds(10, 247, 166, 32);
		contentPane.add(lblNewLabel_6);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(341, 253, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(257, 253, 65, 20);
		contentPane.add(spinner_2);
		
                lblNewLabel_5_1 = new JLabel("name of week");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(new Color(169, 169, 169));
		lblNewLabel_5_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5_1.setBounds(142, 252, 91, 23);
		contentPane.add(lblNewLabel_5_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/images (1) (1).png")));
		btnNewButton_1.setBounds(381, 247, 30, 30);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                            int diaSpinner= (Integer) spinner_1.getValue();
                            int mesSpinner= (Integer) spinner_2.getValue();;
                            change_name(mesSpinner,diaSpinner);
			}
		});
                
                
		JLabel lblNewLabel_7 = new JLabel("Unix Seconds");
		lblNewLabel_7.setFont(new Font("Segoe Script", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 310, 129, 20);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("false");
		lblNewLabel_8.setForeground(new Color(169, 169, 169));
		lblNewLabel_8.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_8.setBounds(142, 313, 46, 14);
		contentPane.add(lblNewLabel_8);
		
                //unix time
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/images (1) (1).png")));
		btnNewButton_2.setBounds(198, 309, 30, 30);
		contentPane.add(btnNewButton_2);
                btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            long time = Long.parseLong(JOptionPane.showInputDialog("Add unix seconds"));
                            if(genYear.tiempo_unix(time)){
                                lblNewLabel_8.setText("True");
                            }
                            else{
                                lblNewLabel_8.setText("False");
                            }
                        }
		});
                
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/pers (1).jpg")));
		lblNewLabel_9.setBounds(560, 247, 312, 196);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonthWindow month = new MonthWindow();
				close();
				month.setVisible(true);
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/back_preview_rev_1 (1).png")));
		btnNewButton_3.setBounds(10, 403, 40, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setBackground(new Color(255, 255, 255));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalendarWindow calendar = new CalendarWindow();
				close();
				calendar.setVisible(true);
			}
		});
		btnNewButton_3_1.setIcon(new ImageIcon(ToolsWindow.class.getResource("/resources/icme.png")));
		btnNewButton_3_1.setBounds(60, 403, 40, 40);
		contentPane.add(btnNewButton_3_1);
	}
        public void day_holiday(JSpinner spinner){
            int value = (Integer) spinner.getValue();
            festivos_mes=f.numero_festivo_mes(value);
            lblNewLabel_4.setText(festivos_mes+"");
                       
        }
        public void change_name(int mes, int dia){
            String nombre=genYear.nombre_dia(mes-1, dia);
            lblNewLabel_5_1.setText(nombre);
        }
	
	 public void close() {
		   this.setVisible(false);
	   }
}
