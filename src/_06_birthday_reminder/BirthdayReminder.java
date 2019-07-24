
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 24th";
		String dadsBirthday = "August 9th";
		String myBirthday = "Novemer 19th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String ask = JOptionPane.showInputDialog("Which birthday from my family would you like to know? (mom/dad/mine)");
		// 3. Print out what the user typed
		System.out.println(ask);
		// 4. if user asked for "mom"
		if(ask .equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if (ask .equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if (ask .equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
		
	} 
}
