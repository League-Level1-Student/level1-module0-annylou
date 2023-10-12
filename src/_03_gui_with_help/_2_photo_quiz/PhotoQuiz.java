package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String imageOne = "https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8fA%3D%3D&w=1000&q=80";
		// 2. create a variable of type "Component" that will hold your image
		Component one;
		// 3. use the "createImage()" method below to initialize your Component
		one = (createImage(imageOne));
		// 4. add the image to the quiz window
		quizWindow.add(one);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String questionOne = JOptionPane.showInputDialog("what is the page number on the left");
		int qOne = Integer.parseInt(questionOne);
		// 7. print "CORRECT" if the user gave the right answer
		if(qOne==240) {
			System.out.println("correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(one);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component two;
		String imageTwo = "https://eol.org/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBCZz09IiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--93f61c500e9f7f0d1f31b8f8ff43ff729031f936/animals.jpg";
		two = createImage(imageTwo);
		// 11. add the second image to the quiz window
		quizWindow.add(two);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String qTwo = JOptionPane.showInputDialog("what animal is this");
		// 14+ check answer, say if correct or incorrect, etc.
		if(qTwo.equals("blue glaucus")) {
			System.out.println("correct");
		}
		else {
			System.out.println("incorrect");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
