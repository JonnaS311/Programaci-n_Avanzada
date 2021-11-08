package principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;


@SuppressWarnings("serial")
public class MonthWindow extends JFrame {

	private JPanel contentPane;
	private GenerateYear year = new GenerateYear();
	private int yearS=2021;
	private int monthS;
        private Festivo f= new Festivo();
	private JLabel esquinalbl;
	private JTable table;
	private JLabel changelbl;
	private JButton back;
	private JButton generate;
	private JTextArea textHolidays;
	private JButton btnNewButton;
	private JLabel holidayslbl;
	private JLabel numberdays;
	private JLabel dayslbl;
	private JLabel lblNewLabel_2;
	private JLabel numberholidays;
	private JLabel holidays;

	
	public MonthWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MonthWindow.class.getResource("/resources/IconProgram.png")));
		setTitle("Calendar PRO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 493);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(20, 60));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                year.generar_anio(yearS);
		
		esquinalbl = new JLabel("");
		esquinalbl.setIcon(new ImageIcon(MonthWindow.class.getResource("/resources/eyu (1).jpg")));
		esquinalbl.setBounds(0, 0, 279, 32);
		contentPane.add(esquinalbl);
		
		JLabel calendarmonth = new JLabel("");
		calendarmonth.setIcon(new ImageIcon(MonthWindow.class.getResource("/resources/calendarm (1).jpg")));
		calendarmonth.setBounds(289, 0, 564, 105);
		contentPane.add(calendarmonth);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setIntercellSpacing(new Dimension(2, 2));
		table.setSelectionForeground(new Color(255, 255, 255));
		table.setRowHeight(40);
		table.setPreferredScrollableViewportSize(new Dimension(500, 500));
		table.setSelectionBackground(new Color(255, 255, 255));
		table.setShowGrid(false);
		table.setBounds(513, 154, 334, 282);
		contentPane.add(table);
		table.setModel(new DefaultTableModel(añadirValoresCabeza(1),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		
		changelbl = new JLabel("January");
		changelbl.setForeground(new Color(240, 128, 128));
		changelbl.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 25));
		changelbl.setHorizontalAlignment(SwingConstants.CENTER);
		changelbl.setBounds(702, 97, 162, 41);
		contentPane.add(changelbl);
		
		back = new JButton("");
		back.setIcon(new ImageIcon(MonthWindow.class.getResource("/resources/back_preview_rev_1 (1).png")));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalendarWindow calendar = new CalendarWindow();
				close();
				calendar.setVisible(true);
			}
		});
		back.setBackground(Color.WHITE);
		back.setBounds(10, 32, 40, 43);
		contentPane.add(back);
		
		generate = new JButton("");
		generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printMonth();
				
			}
		});
		generate.setIcon(new ImageIcon(MonthWindow.class.getResource("/resources/check-symbol-line-style-icon-free-vector (2).jpg")));
		generate.setBounds(58, 32, 40, 40);
		contentPane.add(generate);
		
		textHolidays = new JTextArea("");
		textHolidays.setEditable(false);
		textHolidays.setBounds(47, 172, 360, 111);
		contentPane.add(textHolidays);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToolsWindow tools = new ToolsWindow(yearS);
				close();
				tools.setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(MonthWindow.class.getResource("/resources/her (1).jpg")));
		btnNewButton.setBounds(110, 32, 40, 40);
		contentPane.add(btnNewButton);
		
		holidayslbl = new JLabel("Holidays");
		holidayslbl.setHorizontalAlignment(SwingConstants.CENTER);
		holidayslbl.setFont(new Font("Segoe Script", Font.BOLD, 14));
		holidayslbl.setBounds(37, 143, 113, 21);
		contentPane.add(holidayslbl);
		
		numberdays = new JLabel("Number of Days");
		numberdays.setFont(new Font("Segoe Script", Font.BOLD, 14));
		numberdays.setBounds(47, 294, 147, 26);
		contentPane.add(numberdays);
		
		dayslbl = new JLabel("31");
		dayslbl.setHorizontalAlignment(SwingConstants.CENTER);
		dayslbl.setFont(new Font("Segoe Script", Font.BOLD, 14));
		dayslbl.setBounds(189, 292, 30, 30);
		contentPane.add(dayslbl);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MonthWindow.class.getResource("/resources/iz (1).jpg")));
		lblNewLabel_2.setBounds(0, 374, 119, 80);
		contentPane.add(lblNewLabel_2);
		
		numberholidays = new JLabel("Number of Holidays");
		numberholidays.setFont(new Font("Segoe Script", Font.BOLD, 14));
		numberholidays.setBounds(47, 337, 172, 26);
		contentPane.add(numberholidays);
		
		holidays = new JLabel("0");
		holidays.setHorizontalAlignment(SwingConstants.CENTER);
		holidays.setFont(new Font("Segoe Script", Font.BOLD, 14));
		holidays.setBounds(215, 333, 30, 30);
		contentPane.add(holidays);
		
	}
	
   
  public Object[][] añadirValoresCabeza(int month){
		
		Object[][] prueba_1= new Object[7][7];
		int days = year.dias_mes(month);
                
		int aux = 1;
		String[] nameD = {"D","L","M","M","J","V","S"};
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
	
   public void printMonth() {
	   
	   yearS=Integer.parseInt(JOptionPane.showInputDialog("Please enter the year to generate the Calendar"));
	   year.generar_anio(yearS);
	   monthS=Integer.parseInt(JOptionPane.showInputDialog("Please enter the months number to generate the calendar"));
           
	   days(monthS);
           holidays_month();
           number_days(year.dias_mes(monthS));
           number_holidays(monthS);
	   
		table.setModel(new DefaultTableModel(añadirValoresCabeza(monthS),
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		
	}
   
   public void close() {
	   this.setVisible(false);
   }
   
   public void days(int months) {
	if(months==1) {
            changelbl.setText("January");
		   
	   }
	   
       if(months==2) {
    	   changelbl.setText("February");
           System.out.print("hola");
		   
	   }
       
       if(months==3) {
    	   changelbl.setText("March");
		   
	   }
       
       if(months==4) {
    	   changelbl.setText("April");
		   
	   }
	   
       if(months==5) {
    	   changelbl.setText("May");
		   
	   }
       
       if(months==6) {
    	   changelbl.setText("June");
		   
	   }
       
       if(months==7) {
    	   changelbl.setText("July");
		   
	   }
	   
       if(months==8) {
    	   changelbl.setText("August");
		   
	   }
       
       if(months==9) {
    	   changelbl.setText("September");
	   }
       
       if(months==10) {
    	   changelbl.setText("October");
		   
	   }
	   
       if(months==11) {
    	   changelbl.setText("November");
		   
	   }
       
       if(months==12) {
    	   changelbl.setText("December");
		   
	   }
 
	   
   }
   public void holidays_month(){
    textHolidays.setText(f.nombre_dia_festivo(monthS));
   }
   public void number_days(int days){
       dayslbl.setText(days+"");
   }
   public void number_holidays(int month){
       holidays.setText(f.numero_festivo_mes(month)+"");
   }
   
}
