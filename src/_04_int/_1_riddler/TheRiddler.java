package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("Who makes it, has no need of it.\n"
		+ "Who buys it, has no use for it.\n"
		+ "Who uses it can neither see nor feel it.\n"
		+ "What is it?");

	
if(riddle.equals("A coffin")) { 
	JOptionPane.showMessageDialog(null,"corect "  );
	score +=1;
}
		else {
			JOptionPane.showMessageDialog(null,"wrong! the answer was A coffin "  );
			score -=1;
			
		}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("What is greater than God,\n"
		+ "more evil than the devil,\n"
		+ "the poor have it,\n"
		+ "the rich need it,\n"
		+ "and if you eat it, you'll die?");

	
if(riddle2.equals("nothing")) { 
	JOptionPane.showMessageDialog(null,"corect "  );
	score +=1;
}
		else {
			JOptionPane.showMessageDialog(null,"wrong! the answer was nothing "  );
			score -=1;
			
		}


String riddle3 = JOptionPane.showInputDialog("What has to be broken before you use it?");

	
if(riddle3.equals("An egg")) { 
	JOptionPane.showMessageDialog(null,"corect "  );
	score +=1;
}
		else {
			JOptionPane.showMessageDialog(null,"wrong! the answer was An egg "  );
			score -=1;
			
		}


String riddle4 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");


if(riddle4.equals("A stamp")) { 
	JOptionPane.showMessageDialog(null,"corect "  );
	score +=1;
}
		else {
			JOptionPane.showMessageDialog(null,"wrong! the answer was A stamp "  );
			score -=1;
			
		}



String riddle5 = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");


if(riddle5.equals("A piano")) { 
	JOptionPane.showMessageDialog(null,"corect "  );
	score +=1;
}
		else {
			JOptionPane.showMessageDialog(null,"wrong! the answer was A piano "  );
			score -=1;
			
		}


String riddle6 = JOptionPane.showInputDialog("What has a bottom at the top?");


if(riddle6.equals("Legs")) { 
	JOptionPane.showMessageDialog(null,"corect "  );
	score +=1;
}
		else {
			JOptionPane.showMessageDialog(null,"wrong! the answer was Legs "  );
			score -=1;
			
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"Your score is " +score );

	}
}

