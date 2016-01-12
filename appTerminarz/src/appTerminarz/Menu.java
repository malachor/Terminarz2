package appTerminarz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Menu implements ActionListener {
	/**
	 * 
	 */
	private JButton button_note;
	private JButton button_edit;

	/*KOSTRUKTOR*/
	public Menu() {
		this.button_note = new JButton("Add the note");
		this.button_note.setBounds(700, 60, 200, 70);
		this.button_note.addActionListener(this);
		this.button_edit = new JButton("Edit note");
		this.button_edit.setBounds(700, 130, 200, 70);
		this.button_edit.addActionListener(this);
	}
	
	/*GETTERY I SETTERY*/
	public JButton getButton_note() {
		return button_note;
	}
	public void setButton_note(JButton but) {
		this.button_note = but;
	}
	
	public JButton getButton_edit() {
		return button_edit;
	}

	public void setButton_edit(JButton button_edit) {
		this.button_edit = button_edit;
	}

	/*OBSLUGA ZDARZEN PRZYCISKU ADD THE NOTE*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button_note) {
			NotatkaAddFrame frame = new NotatkaAddFrame();
            frame.setVisible(true);
		}
		else if(source == button_edit) {
			NotatkaEditFrame frame = new NotatkaEditFrame();
			frame.setVisible(true);
		}
		
	}

}
