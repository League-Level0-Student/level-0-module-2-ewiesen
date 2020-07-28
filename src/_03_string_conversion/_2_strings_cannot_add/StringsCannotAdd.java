package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
		
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			String oneAsString = JOptionPane.showInputDialog("Enter the first number\nyou want added!");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			String twoAsString = JOptionPane.showInputDialog("Enter the second number\nyou want added!");
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			//JOptionPane.showMessageDialog(null, fourAsString + sixAsString);
			// Did you notice 46 instead of 4 + 6 = 10?
			//yes
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String threeAsString = JOptionPane.showInputDialog("Enter the thrid number\nyou want added!\n(enter 0 if you only want\ntwo numbers added)");
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			//JOptionPane.showMessageDialog(null, fourAsString + sixAsString + fiveAsString);
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			//yes
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			int oneAsInt = Integer.parseInt(oneAsString);
			// 7) Do the same for sixAsString. 
			int twoAsInt = Integer.parseInt(twoAsString);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			//JOptionPane.showMessageDialog(null, fourAsInt + sixAsInt);
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			//yes
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			int threeAsInt = Integer.parseInt(threeAsString);
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			JOptionPane.showMessageDialog(null, oneAsInt + twoAsInt + threeAsInt);
			// Is your value now 15 instead of 465?
			//yes
	}
}
