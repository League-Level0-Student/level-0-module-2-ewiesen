package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class mathProgram {

		public static void main(String[] args) {

			int userOperation = JOptionPane.showOptionDialog(null, "What operation would you like to use?", "Choose your operation", 0,
				JOptionPane.QUESTION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplication", "Division" }, null);
			
			if (userOperation == 0) {
				String addend1 = JOptionPane.showInputDialog("Enter the first addend!");
				String addend2 = JOptionPane.showInputDialog("Enter the second addend!");
				int addendOne = Integer.parseInt(addend1);
				int addendTwo = Integer.parseInt(addend2);
				int answerAdd = addendOne + addendTwo;
				String addAnswer = Integer.toString(answerAdd);
				JOptionPane.showOptionDialog(null, "The sum is:", "Answer", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { addAnswer }, null);
			}
			if (userOperation == 1) {
				String minuend1 = JOptionPane.showInputDialog("Enter the minuend!");
				String subtrahend2 = JOptionPane.showInputDialog("Enter the subtrahend!");
				int minuendOne = Integer.parseInt(minuend1);
				int subtrahendTwo = Integer.parseInt(subtrahend2);
				int answerSubtract = minuendOne - subtrahendTwo;
				String subtractAnswer = Integer.toString(answerSubtract);
				JOptionPane.showOptionDialog(null, "The difference is:", "Answer", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { subtractAnswer }, null);
			}
			if (userOperation == 2) {
				String factor1 = JOptionPane.showInputDialog("Enter the first factor!");
				String factor2 = JOptionPane.showInputDialog("Enter second factor!");
				int factorOne = Integer.parseInt(factor1);
				int factorTwo = Integer.parseInt(factor2);
				int answerMultiply = factorOne * factorTwo;
				String multiplyAnswer = Integer.toString(answerMultiply);
				JOptionPane.showOptionDialog(null, "The product is:", "Answer", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { multiplyAnswer }, null);
			}
			if (userOperation == 3) {
				String dividend1 = JOptionPane.showInputDialog("Enter the dividend!");
				String divisor2 = JOptionPane.showInputDialog("Enter the divisor!");
				int dividendOne = Integer.parseInt(dividend1);
				int divisorTwo = Integer.parseInt(divisor2);
				int answerDivision = dividendOne / divisorTwo;
				String divisionAnswer = Integer.toString(answerDivision);
				JOptionPane.showOptionDialog(null, "The quotient is:", "Answer", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { divisionAnswer }, null);
		}
	}
}
