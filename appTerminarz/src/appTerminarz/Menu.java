package appTerminarz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Menu implements ActionListener {
	/**
	 * 
	 */
	private JButton button_note;

	/*KOSTRUKTOR*/
	public Menu() {
		this.button_note = new JButton("Add the note");
		this.button_note.setBounds(700, 60, 200, 70);
		this.button_note.addActionListener(this);
	}
	
	/*GETTERY I SETTERY*/
	public JButton getButton_note() {
		return button_note;
	}
	public void setButton_note(JButton but) {
		this.button_note = but;
	}

	/*OBS£UGA ZDARZEÑ PRZYCISKU ADD THE NOTE*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button_note) {
			NotatkaFrame frame = new NotatkaFrame();
            frame.setVisible(true);
		}
		
	}

}
