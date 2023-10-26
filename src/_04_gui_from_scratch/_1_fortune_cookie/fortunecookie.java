package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Random;
public class fortunecookie {
	public void showButton() {
		System.out.println("button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(null);
		int random = new Random().nextInt(5);
		if(random==0) {
			JOptionPane.showMessageDialog(null, "you deserve a kitkat");
		}
		else if(random==1) {
			JOptionPane.showMessageDialog(null, "you're a mall santa");
		}
		else if(random==2) {
			JOptionPane.showMessageDialog(null, "that one bee from the bee movie");
		}
		else if(random==3) {
			JOptionPane.showMessageDialog(null, "you look like a frog");
		}
		else if(random==4) {
			JOptionPane.showMessageDialog(null, "crabby patty");
		}
	}
}
