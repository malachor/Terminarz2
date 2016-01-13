package appTerminarz;

import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;

public class Panel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*MAIN - START PROGRAMU*/
	public static void main(String[] args) throws IOException, InterruptedException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Panel frame = new Panel();
                    frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /*KONSTRUKTOR RAMKI PANEL, DODAWANIE ELEMENTOW*/
    public Panel() {
        Kalendarz app = new Kalendarz();
        Menu appmenu = new Menu();
        setTitle(getClass().getSimpleName());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(70,70,1100,750);
        Container contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
        this.add(app.getlMonth());
        this.add(app.getlMonday());
        this.add(app.getlTuesday());
        this.add(app.getlWednesday());
        this.add(app.getlThursday());
        this.add(app.getlFriday());
        this.add(app.getlSaturday());
        this.add(app.getlSunday());
        this.add(app.getlMenu());
        for(int i = 0; i < app.getButton().length; i++)
            this.add(app.getButton(i));
        this.add(appmenu.getButton_note());
        this.add(appmenu.getButton_edit());
        this.add(appmenu.getButton_terminarz());
    }
    
}
