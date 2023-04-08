package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = "We'll float like a butterfly, sting like a bee\n" +
				"And leave you suckers black and blue\n" +
				"Though when we're in action we usually bleed\n" +
				"That's who we are, that's what we do\n" +
				"We do it for kicks and we do it for thrills\n" +
				"When boredom makes you lose your mind\n" +
				"But mostly we do it to pay off the bills\n" +
				"We hope that you can read the sign\n" +
				"Now give us our headgear or give us a punch" +
				"So we can hang around with you\n" +
				"You'd best wear protection alongside our bunch\n" +
				"Although you might be called a prude\n" ;
		String answer1 = JOptionPane.showInputDialog(riddle1);




		if (answer1.equalsIgnoreCase("Pens")) {
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			JOptionPane.showMessageDialog(null,"correct" );
			score += 1;

		}
		else {
			// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null,"wrong" );

		}


		// 6. Add some more riddles
		String riddle2 = "Which word in the dictionary is spelled incorrectly?\n" ;
		String answer2 = JOptionPane.showInputDialog(riddle2);





		if (answer2.equalsIgnoreCase("incorectly")) {
			JOptionPane.showMessageDialog(null,"correct" );
			score += 1;


		}
		else {
			JOptionPane.showMessageDialog(null,"wrong" );

		}



		String riddle3 = "What is greater than God,\n" +
				"more evil than the devil,\n" +
				"the poor have it,\n" +
				"the rich need it,\n" +
				"and if you eat it, you'll die?\n" ;
		String answer3 = JOptionPane.showInputDialog(riddle3);

		if (answer3.equalsIgnoreCase("Nothing")) {
		JOptionPane.showMessageDialog(null,"correct" );
		score += 1;
	}
	else {




		JOptionPane.showMessageDialog(null,"wrong" );



		// 2. Make a pop up to show the score.
	}
}

}
