package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String kaleb = "kaleb can walk.";
		String nick = "nick plays pool.";
		String dad = "dad can sleep.";
		String mom = "mom slap me.";
		String sister = "sister not smart.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String word = JOptionPane.showInputDialog("enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (word.equals("kaleb")){

			JOptionPane.showMessageDialog(null,kaleb );
		}
		if (word.equals("nick")){
			JOptionPane.showMessageDialog(null,nick );
		}

		if (word.equals("dad")){
			JOptionPane.showMessageDialog(null,dad );
		}

			if (word.equals("mom")){
				JOptionPane.showMessageDialog(null,mom );
				
		
		}
			if (word.equals("sister")){
				JOptionPane.showMessageDialog(null,sister );
			}
			
}
}
