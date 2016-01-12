package appTerminarz;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NotatkaEditFrame extends JFrame {
	
	/*KONSTRUKTOR RAMKI NOTATKI_EDIT, DODAWANIE ELEMENTOW*/
	public NotatkaEditFrame() {
		NotatkaEdit note = new NotatkaEdit();
		setTitle("Notatka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1100,70,450,300);
		Container contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.add(note.getText());
		this.add(note.getUpdate());
	}

}
