//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {
		JOptionPane.showInputDialog("Enter a yes or no question for the magic 8 ball to answer");
		Random ran = new Random();
		int random8ball = ran.nextInt(21);
		if (random8ball == 0) {
			JOptionPane.showMessageDialog(null, "It is certain");
		}
		if (random8ball == 1) {
			JOptionPane.showMessageDialog(null, "Without a doubt");
		}
		if (random8ball == 2) {
			JOptionPane.showMessageDialog(null, "You may rely on it");
		}
		if (random8ball == 3) {
			JOptionPane.showMessageDialog(null, "Yes definitely");
		}
		if (random8ball == 4) {
			JOptionPane.showMessageDialog(null, "It is decidedly so");
		}
		if (random8ball == 5) {
			JOptionPane.showMessageDialog(null, "As I see it, yes");
		}
		if (random8ball == 6) {
			JOptionPane.showMessageDialog(null, "Most likely");
		}
		if (random8ball == 7) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		if (random8ball == 8) {
			JOptionPane.showMessageDialog(null, "Outlook good");
		}
		if (random8ball == 9) {
			JOptionPane.showMessageDialog(null, "Signs point to yes");
		}
		if (random8ball == 10) {
			JOptionPane.showMessageDialog(null, "Reply hazy try again");
		}
		if (random8ball == 11) {
			JOptionPane.showMessageDialog(null, "Better not tell you now");
		}
		if (random8ball == 12) {
			JOptionPane.showMessageDialog(null, "Ask again later");
		}
		if (random8ball == 13) {
			JOptionPane.showMessageDialog(null, "Cannot predict now");
		}
		if (random8ball == 14) {
			JOptionPane.showMessageDialog(null, "Concentrate and ask again");
		}
		if (random8ball == 15) {
			JOptionPane.showMessageDialog(null, "Don't count on it");
		}
		if (random8ball == 16) {
			JOptionPane.showMessageDialog(null, "Outlook not so good");
		}
		if (random8ball == 17) {
			JOptionPane.showMessageDialog(null, "My sources say no");
		}
		if (random8ball == 18) {
			JOptionPane.showMessageDialog(null, "Very doubtful");
		}
		if (random8ball == 19) {
			JOptionPane.showMessageDialog(null, "My reply is no");
		}
	}
}

		
