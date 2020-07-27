package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Lottery Numbers: \n");
		Random ran = new Random();
		int number = 1;

		for (int i = 0; i < 6; i++) {
		int randomnumber1 = ran.nextInt(50);
		JOptionPane.showMessageDialog(null, "Number " + number + ": " + randomnumber1);
		number += 1;
		
		}
	}
}



