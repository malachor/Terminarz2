package appTerminarz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Kalendarz extends JPanel implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int dayOfWeek;
    private int monthOfYear;
    private int dayOfMonth;
    private String[] Miesiace;
    private int yearNOW;
    private int monthNameNOW;
    private int dayNOW;
    private int dayNameNOW;
    private String nameMonth;
    private JLabel lMonth;
    private JLabel lMonday;
    private JLabel lTuesday;
    private JLabel lWednesday;
    private JLabel lThursday;
    private JLabel lFriday;
    private JLabel lSaturday;
    private JLabel lSunday;
    private JLabel lMenu;
    private JButton[] button;
    
    /*KONSTRUKTOR KALENDARZ - UTWORZENIE*/
    public Kalendarz() {
        this.button = new JButton[42];
        GregorianCalendar nowDate = new GregorianCalendar();
        this.setYearNOW(nowDate.get(Calendar.YEAR));
        this.setMonthNameNOW(nowDate.get(Calendar.MONTH));
        this.setDayNOW(nowDate.get(Calendar.DAY_OF_MONTH));
        this.setDayNameNOW(nowDate.get(Calendar.DAY_OF_WEEK));
        if(this.monthNameNOW == GregorianCalendar.JANUARY) {
            this.setMonthOfYear(1);
            this.setDayOfMonth(31);
            this.setNameMonth("January");
        }
        else if(this.monthNameNOW == GregorianCalendar.FEBRUARY) {
            this.setMonthOfYear(2);
            this.setDayOfMonth(28);
            this.setNameMonth("February");
        }
        else if(this.monthNameNOW == GregorianCalendar.MARCH) {
            this.setMonthOfYear(3);
            this.setDayOfMonth(31);
            this.setNameMonth("March");
        }
        else if(this.monthNameNOW == GregorianCalendar.APRIL) {
            this.setMonthOfYear(4);
            this.setDayOfMonth(30);
            this.setNameMonth("April");
        }
        else if(this.monthNameNOW == GregorianCalendar.MAY) {
            this.setMonthOfYear(5);
            this.setDayOfMonth(31);
            this.setNameMonth("May");
        }
        else if(this.monthNameNOW == GregorianCalendar.JUNE) {
            this.setMonthOfYear(6);
            this.setDayOfMonth(30);
            this.setNameMonth("June");
        }
        else if(this.monthNameNOW == GregorianCalendar.JULY) {
            this.setMonthOfYear(7);
            this.setDayOfMonth(31);
            this.setNameMonth("July");
        }
        else if(this.monthNameNOW == GregorianCalendar.AUGUST) {
            this.setMonthOfYear(8);
            this.setDayOfMonth(31);
            this.setNameMonth("August");
        }
        else if(this.monthNameNOW == GregorianCalendar.SEPTEMBER) {
            this.setMonthOfYear(9);
            this.setDayOfMonth(30);
            this.setNameMonth("September");
        }
        else if(this.monthNameNOW == GregorianCalendar.OCTOBER) {
            this.setMonthOfYear(10);
            this.setDayOfMonth(31);
            this.setNameMonth("October");
        }
        else if(this.monthNameNOW == GregorianCalendar.NOVEMBER) {
            this.setMonthOfYear(11);
            this.setDayOfMonth(30);
            this.setNameMonth("November");
        }
        else if(this.monthNameNOW == GregorianCalendar.DECEMBER) {
            this.setMonthOfYear(12);
            this.setDayOfMonth(31);
            this.setNameMonth("December");
        }
        if(this.dayNameNOW == GregorianCalendar.MONDAY)
            this.setDayOfWeek(1);
        else if(this.dayNameNOW == GregorianCalendar.TUESDAY)
            this.setDayOfWeek(2);
        else if(this.dayNameNOW == GregorianCalendar.WEDNESDAY)
            this.setDayOfWeek(3);
        else if(this.dayNameNOW == GregorianCalendar.THURSDAY)
            this.setDayOfWeek(4);
        else if(this.dayNameNOW == GregorianCalendar.FRIDAY)
            this.setDayOfWeek(5);
        else if(this.dayNameNOW == GregorianCalendar.SATURDAY)
            this.setDayOfWeek(6);
        else if(this.dayNameNOW == GregorianCalendar.SUNDAY)
            this.setDayOfWeek(7);
        
        //ETYKIETY
        this.lMonth = new JLabel(this.getNameMonth());
        this.lMonth.setBounds(295, -25, 90, 90);
        this.lMonth.setFont(new Font("Arial", Font.BOLD, 20));
        
        this.lMenu = new JLabel("Menu");
        this.lMenu.setBounds(780, -25, 90, 90);
        this.lMenu.setFont(new Font("Arial", Font.BOLD, 20));
        
        this.lMonday = new JLabel("Monday");
        this.lMonday.setBounds(30, 5, 90, 90);
        this.lMonday.setFont(new Font("Arial", Font.BOLD, 12));
        
        this.lTuesday = new JLabel("Tuesday");
        this.lTuesday.setBounds(120, 5, 90, 90);
        this.lTuesday.setFont(new Font("Arial", Font.BOLD, 12));
        
        this.lWednesday = new JLabel("Wednesday");
        this.lWednesday.setBounds(200, 5, 90, 90);
        this.lWednesday.setFont(new Font("Arial", Font.BOLD, 12));
        
        this.lThursday = new JLabel("Thursday");
        this.lThursday.setBounds(298, 5, 90, 90);
        this.lThursday.setFont(new Font("Arial", Font.BOLD, 12));
        
        this.lFriday = new JLabel("Friday");
        this.lFriday.setBounds(396, 5, 90, 90);
        this.lFriday.setFont(new Font("Arial", Font.BOLD, 12));
        
        this.lSaturday = new JLabel("Saturday");
        this.lSaturday.setBounds(478, 5, 90, 90);
        this.lSaturday.setFont(new Font("Arial", Font.BOLD, 12));
        
        this.lSunday = new JLabel("Sunday");
        this.lSunday.setBounds(570, 5, 90, 90);
        this.lSunday.setFont(new Font("Arial", Font.BOLD, 12));
        
        /*PRZYCISKI DNI KALENDARZA*/
        int j = 0, k = 0, l = -1;
        int dayHas = 14 + this.getDayOfWeek() - this.getDayNOW();
        for(int i = 0; i < this.button.length; i++) {
            if(i % 7 == 0 && i != 0) {
                j = 0;
                k++;
            }
            this.setButton(new JButton(), i);
            if(dayHas <= i)
                l++;
            if(l >= 0 && l < this.getDayOfMonth())
                this.button[i].setText(Integer.toString(l+1));
            if(l == this.getDayNOW() - 1)
                this.button[i].setForeground(Color.RED);
            
            this.button[i].setFont(new Font("Arial", Font.BOLD, 20));
            this.button[i].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
            this.button[i].setBounds(10 + (j * 90), 60 + (k * 105), 85, 100);
            j++;
        }
    }

    /*GETTERY I SETTERY*/
    public JLabel getlMenu() {
		return lMenu;
	}

	public void setlMenu(JLabel lMenu) {
		this.lMenu = lMenu;
	}

	public final String getNameMonth() {
        return nameMonth;
    }

    public final void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public final int getDayOfWeek() {
        return dayOfWeek;
    }

    public final void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public final void setMonthOfYear(int monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public final int getDayOfMonth() {
        return dayOfMonth;
    }

    public final void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String[] getMiesiace() {
        return Miesiace;
    }

    public void setMiesiace(String[] Miesiace) {
        this.Miesiace = Miesiace;
    }

    public int getYearNOW() {
        return yearNOW;
    }

    public final void setYearNOW(int yearNOW) {
        this.yearNOW = yearNOW;
    }

    public int getMonthNameNOW() {
        return monthNameNOW;
    }

    public final void setMonthNameNOW(int monthNameNOW) {
        this.monthNameNOW = monthNameNOW;
    }

    public final int getDayNOW() {
        return dayNOW;
    }

    public final void setDayNOW(int dayNOW) {
        this.dayNOW = dayNOW;
    }

    public int getDayNameNOW() {
        return dayNameNOW;
    }

    public final void setDayNameNOW(int dayNameNOW) {
        this.dayNameNOW = dayNameNOW;
    }

    public JLabel getlMonth() {
        return lMonth;
    }

    public void setlMonth(JLabel lMonth) {
        this.lMonth = lMonth;
    }

    public JLabel getlMonday() {
        return lMonday;
    }

    public void setlMonday(JLabel lMonday) {
        this.lMonday = lMonday;
    }

    public JLabel getlTuesday() {
        return lTuesday;
    }

    public void setlTuesday(JLabel lTuesday) {
        this.lTuesday = lTuesday;
    }

    public JLabel getlWednesday() {
        return lWednesday;
    }

    public void setlWednesday(JLabel lWednesday) {
        this.lWednesday = lWednesday;
    }

    public JLabel getlThursday() {
        return lThursday;
    }

    public void setlThursday(JLabel lThursday) {
        this.lThursday = lThursday;
    }

    public JLabel getlFriday() {
        return lFriday;
    }

    public void setlFriday(JLabel lFriday) {
        this.lFriday = lFriday;
    }

    public JLabel getlSaturday() {
        return lSaturday;
    }

    public void setlSaturday(JLabel lSaturday) {
        this.lSaturday = lSaturday;
    }

    public JLabel getlSunday() {
        return lSunday;
    }

    public void setlSunday(JLabel lSunday) {
        this.lSunday = lSunday;
    }

    public final JButton[] getButton() {
        return button;
    }
    
    public JButton getButton(int i) {
        return button[i];
    }

    public void setButton(JButton[] button) {
        this.button = button;
    }
    
    public final void setButton(JButton but, int i) {
        this.button[i] = but;
    }
    
    /*OBSLUGA ZDARZEN DNIA W MIESIACU - NIE ZDEFINIOWANO*/
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
