package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		
	String userString = JOptionPane.showInputDialog("How old are you?");
	
	int userAge = Integer.parseInt(userString);
	
	if ( userAge < 18 ) {
		JOptionPane.showMessageDialog(null, "You are too young to vote!");
	}

	else {
		String userVote = JOptionPane.showInputDialog("What is better, cookies or donuts?");
		
		if (userVote.equalsIgnoreCase("cookies")) {
			JOptionPane.showMessageDialog(null, "Cookies won the vote!");
		}
		if (userVote.equalsIgnoreCase("donuts")) {
			JOptionPane.showMessageDialog(null, "Donuts won the vote!");
		}
			else {
				JOptionPane.showMessageDialog(null, "Invalid vote!");
			}	
		}
	}
}