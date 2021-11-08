package principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;


@SuppressWarnings("serial")
public class CalendarWindow extends JFrame {

	private JPanel contentPane;
	private GenerateYear year = new GenerateYear();
	private JTable enero;
	private int yearS=2021;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel titlelbl;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTable febrero;
	private JLabel lblNewLabel_3;
	private JTable marzo;
	private JLabel lblNewLabel_5;
	private JTable abril;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JTable mayo;
	private JLabel lblNewLabel_7;
	private JTable junio;
	private JTable julio;
	private JTable agosto;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTable septiembre;
	private JTable octubre;
	private JTable noviembre;
	private JTable diciembre;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JButton generate;
	private JLabel changelbl;
	private JLabel lblNewLabel;

	
	public CalendarWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalendarWindow.class.getResource("/resources/IconProgram.png")));
		setTitle("CalendarPRO");
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Century Gothic", Font.PLAIN, 12));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 733);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		year.generar_anio(yearS);

                
		
		
		enero = new JTable();
		enero.setRowSelectionAllowed(false);
		enero.setShowGrid(false);
		enero.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		enero.setBackground(new Color(255, 255, 255));
		enero.setBounds(77, 195, 184, 121);
		contentPane.add(enero);
		enero.setModel(new DefaultTableModel(añadirValoresCabeza(1),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                enero.setDefaultRenderer (Object.class, new ColorJTable());
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonthWindow month = new MonthWindow();
				close();
				month.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(CalendarWindow.class.getResource("/resources/icme.png")));
		btnNewButton.setBounds(915, 11, 40, 40);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToolsWindow tools = new ToolsWindow(yearS);
				close();
				tools.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(CalendarWindow.class.getResource("/resources/her (1).jpg")));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(865, 11, 40, 40);
		contentPane.add(btnNewButton_1);
		
		titlelbl = new JLabel("");
		titlelbl.setIcon(new ImageIcon(CalendarWindow.class.getResource("/resources/titulo (1).jpg")));
		titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
		titlelbl.setBounds(237, 30, 477, 80);
		contentPane.add(titlelbl);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CalendarWindow.class.getResource("/resources/es (1).jpg")));
		lblNewLabel_1.setBounds(0, 0, 174, 121);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("JANUARY");
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_2.setBackground(new Color(255, 215, 0));
		lblNewLabel_2.setBounds(77, 158, 184, 26);
		contentPane.add(lblNewLabel_2);
		
		febrero = new JTable();
		febrero.setShowGrid(false);
		febrero.setRowSelectionAllowed(false);
		febrero.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		febrero.setBackground(new Color(255, 255, 255));
		febrero.setBounds(287, 195, 184, 121);
		contentPane.add(febrero);
		febrero.setModel(new DefaultTableModel(añadirValoresCabeza(2),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                febrero.setDefaultRenderer (Object.class, new ColorJTable());
		
		lblNewLabel_3 = new JLabel("FEBRUARY");
		lblNewLabel_3.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(287, 158, 184, 26);
		contentPane.add(lblNewLabel_3);
		
		marzo = new JTable();
		marzo.setShowGrid(false);
		marzo.setRowSelectionAllowed(false);
		marzo.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		marzo.setBackground(new Color(255, 255, 255));
		marzo.setBounds(497, 195, 184, 121);
		contentPane.add(marzo);
		marzo.setModel(new DefaultTableModel(añadirValoresCabeza(3),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                marzo.setDefaultRenderer (Object.class, new ColorJTable());
		
		lblNewLabel_5 = new JLabel("MARCH");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_5.setBounds(497, 158, 184, 26);
		contentPane.add(lblNewLabel_5);
		
		abril = new JTable();
		abril.setShowGrid(false);
		abril.setRowSelectionAllowed(false);
		abril.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		abril.setBackground(new Color(255, 255, 255));
		abril.setBounds(708, 195, 184, 121);
		contentPane.add(abril);
		abril.setModel(new DefaultTableModel(añadirValoresCabeza(4),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                abril.setDefaultRenderer (Object.class, new ColorJTable());
		
		lblNewLabel_4 = new JLabel("APRIL");
		lblNewLabel_4.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(708, 158, 184, 26);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_6 = new JLabel("MAY");
		lblNewLabel_6.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(null);
		lblNewLabel_6.setBackground(new Color(240, 240, 240));
		lblNewLabel_6.setBounds(77, 343, 184, 26);
		contentPane.add(lblNewLabel_6);
		
		mayo = new JTable();
		mayo.setShowGrid(false);
		mayo.setRowSelectionAllowed(false);
		mayo.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		mayo.setBackground(new Color(255, 255, 255));
		mayo.setBounds(77, 371, 184, 121);
		contentPane.add(mayo);
		mayo.setModel(new DefaultTableModel(añadirValoresCabeza(5),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		mayo.setDefaultRenderer (Object.class, new ColorJTable());
                
		lblNewLabel_7 = new JLabel("JUNE");
		lblNewLabel_7.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBackground(SystemColor.menu);
		lblNewLabel_7.setBounds(287, 343, 184, 26);
		contentPane.add(lblNewLabel_7);
		
		junio = new JTable();
		junio.setShowGrid(false);
		junio.setRowSelectionAllowed(false);
		junio.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		junio.setBackground(new Color(255, 255, 255));
		junio.setBounds(287, 371, 184, 121);
		contentPane.add(junio);
		junio.setModel(new DefaultTableModel(añadirValoresCabeza(6),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                junio.setDefaultRenderer (Object.class, new ColorJTable());
		
		julio = new JTable();
		julio.setShowGrid(false);
		julio.setRowSelectionAllowed(false);
		julio.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		julio.setBackground(new Color(255, 255, 255));
		julio.setBounds(497, 371, 184, 121);
		contentPane.add(julio);
		julio.setModel(new DefaultTableModel(añadirValoresCabeza(7),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                julio.setDefaultRenderer (Object.class, new ColorJTable());
		
		agosto = new JTable();
		agosto.setShowGrid(false);
		agosto.setRowSelectionAllowed(false);
		agosto.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		agosto.setBackground(new Color(255, 255, 255));
		agosto.setBounds(708, 371, 184, 121);
		contentPane.add(agosto);
		agosto.setModel(new DefaultTableModel(añadirValoresCabeza(8),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		agosto.setDefaultRenderer (Object.class, new ColorJTable());
                
		lblNewLabel_8 = new JLabel("JULY");
		lblNewLabel_8.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBackground(SystemColor.menu);
		lblNewLabel_8.setBounds(497, 343, 184, 26);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("AUGUST");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_9.setBackground(SystemColor.menu);
		lblNewLabel_9.setBounds(708, 343, 184, 26);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("SEPTEMBER");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_10.setBackground(SystemColor.menu);
		lblNewLabel_10.setBounds(77, 517, 184, 26);
		contentPane.add(lblNewLabel_10);
		
		septiembre = new JTable();
		septiembre.setShowGrid(false);
		septiembre.setRowSelectionAllowed(false);
		septiembre.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		septiembre.setBackground(new Color(255, 255, 255));
		septiembre.setBounds(77, 540, 184, 121);
		contentPane.add(septiembre);
		septiembre.setModel(new DefaultTableModel(añadirValoresCabeza(9),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                septiembre.setDefaultRenderer (Object.class, new ColorJTable());
		
		octubre = new JTable();
		octubre.setShowGrid(false);
		octubre.setRowSelectionAllowed(false);
		octubre.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		octubre.setBackground(new Color(255, 255, 255));
		octubre.setBounds(287, 540, 184, 121);
		contentPane.add(octubre);
		octubre.setModel(new DefaultTableModel(añadirValoresCabeza(10),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                octubre.setDefaultRenderer (Object.class, new ColorJTable());
		
		noviembre = new JTable();
		noviembre.setShowGrid(false);
		noviembre.setRowSelectionAllowed(false);
		noviembre.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		noviembre.setBackground(new Color(255, 255, 255));
		noviembre.setBounds(497, 540, 184, 121);
		contentPane.add(noviembre);
		noviembre.setModel(new DefaultTableModel(añadirValoresCabeza(11),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                noviembre.setDefaultRenderer (Object.class, new ColorJTable());
		
		diciembre = new JTable();
		diciembre.setShowGrid(false);
		diciembre.setRowSelectionAllowed(false);
		diciembre.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 1, true), new LineBorder(new Color(255, 255, 255))));
		diciembre.setBackground(new Color(255, 255, 255));
		diciembre.setBounds(708, 540, 184, 121);
		contentPane.add(diciembre);
		diciembre.setModel(new DefaultTableModel(añadirValoresCabeza(12),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
                diciembre.setDefaultRenderer (Object.class, new ColorJTable());
		
		lblNewLabel_11 = new JLabel("OCTOBER");
		lblNewLabel_11.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBackground(SystemColor.menu);
		lblNewLabel_11.setBounds(287, 517, 184, 26);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("NOVEMBER");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_12.setBackground(SystemColor.menu);
		lblNewLabel_12.setBounds(497, 517, 184, 26);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("DECEMBER");
		lblNewLabel_13.setFont(new Font("Segoe Script", Font.BOLD, 14));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBackground(SystemColor.menu);
		lblNewLabel_13.setBounds(708, 517, 184, 26);
		contentPane.add(lblNewLabel_13);
		
		generate = new JButton("");
		generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printCalendar();
			}
		});
		generate.setIcon(new ImageIcon(CalendarWindow.class.getResource("/resources/check-symbol-line-style-icon-free-vector (2).jpg")));
		generate.setBackground(new Color(255, 255, 255));
		generate.setBounds(815, 11, 40, 40);
		contentPane.add(generate);
		
		changelbl = new JLabel("2021");
		changelbl.setFont(new Font("Segoe Script", Font.BOLD, 16));
		changelbl.setHorizontalAlignment(SwingConstants.CENTER);
		changelbl.setBounds(705, 75, 90, 26);
		contentPane.add(changelbl);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CalendarWindow.class.getResource("/resources/ei (1).jpg")));
		lblNewLabel.setBounds(900, 624, 76, 80);
		contentPane.add(lblNewLabel);
                

		}
        
	
	public Object[][] añadirValoresCabeza(int month){
		
		Object[][] prueba_1= new Object[7][7];
		int days = year.dias_mes(month);
		int aux = 1;
		String[] nameD = {"S","M","T","W","T","F","S"};
		int z= year.espacio_dias(month)-1;
		
		for(int i=0;i<7;i++) {
				prueba_1[0][i]=nameD[i];
		}
		
		for(int i=1;i<7;i++) {
			for(int j=0;j<7;j++) {
			
				if(z!=0) {
					prueba_1[i][j]=" ";
					z--;
					
				}else {
					if(aux<=days) {
						prueba_1[i][j]=aux;
						aux++;
					}
					
				}
			
			}
		}
		
		return prueba_1;
	}
	
   public void printCalendar() {
		
		yearS=Integer.parseInt(JOptionPane.showInputDialog("Please enter the year to generate the Calendar"));;
		year.generar_anio(yearS);
		
		String aux = String.valueOf(yearS);
		changelbl.setText(aux);
		
		enero.setModel(new DefaultTableModel(añadirValoresCabeza(1),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		
		febrero.setModel(new DefaultTableModel(añadirValoresCabeza(2),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		marzo.setModel(new DefaultTableModel(añadirValoresCabeza(3),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		abril.setModel(new DefaultTableModel(añadirValoresCabeza(4),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		mayo.setModel(new DefaultTableModel(añadirValoresCabeza(5),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		junio.setModel(new DefaultTableModel(añadirValoresCabeza(6),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		julio.setModel(new DefaultTableModel(añadirValoresCabeza(7),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		agosto.setModel(new DefaultTableModel(añadirValoresCabeza(8),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		septiembre.setModel(new DefaultTableModel(añadirValoresCabeza(9),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		octubre.setModel(new DefaultTableModel(añadirValoresCabeza(10),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		noviembre.setModel(new DefaultTableModel(añadirValoresCabeza(11),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		diciembre.setModel(new DefaultTableModel(añadirValoresCabeza(12),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
	}
   
   public void close() {
	   this.setVisible(false);
   }
}
