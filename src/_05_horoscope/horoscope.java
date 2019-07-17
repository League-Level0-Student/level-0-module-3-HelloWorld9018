package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void
main(String[] args) {
	String sign = JOptionPane.showInputDialog(null, "What is your star sign?");
	
	if (sign .equalsIgnoreCase("Aries")) {JOptionPane.showMessageDialog(null, "Your horoscope is curageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");}
	
	else if (sign .equalsIgnoreCase("Taurus")) {JOptionPane.showMessageDialog(null, "Your horoscope is pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");}
	
	else if (sign .equalsIgnoreCase("Gemini")) {JOptionPane.showMessageDialog(null, "Your horoscope is cerebral, chatty, loves learning and education, charming, and adventurous.");}
	
	else if (sign .equalsIgnoreCase("Cancer")) {JOptionPane.showMessageDialog(null, "Your horoscope is emotional, group oriented, seeks security, family.");}
	
	else if (sign .equalsIgnoreCase("Leo")) {JOptionPane.showMessageDialog(null, "Your horoscope is generous, organized, protective, beautiful.");}
	
	else if (sign .equalsIgnoreCase("Virgo")) {JOptionPane.showMessageDialog(null, "Your horoscope is particular, logical, practical, sense of duty, critical.");}
	
	else if (sign .equalsIgnoreCase("Libra")) {JOptionPane.showMessageDialog(null, "Your horoscope is balanced, seeks beauty, sense of justice.");}
	
	else if (sign .equalsIgnoreCase("Scorpio")) {JOptionPane.showMessageDialog(null, "Your horoscope is passionate, exacting, loves extremes, combative, reflective.");}
	
	else if (sign .equalsIgnoreCase("Sagittarius")) {JOptionPane.showMessageDialog(null, "Your horoscope is happy, absent minded, creative, adventurous.");}
	
	else if (sign .equalsIgnoreCase("Capricorn")) {JOptionPane.showMessageDialog(null, "Your horoscope is timeless, driven, calculating, ambitious.");}
	
	else if (sign .equalsIgnoreCase("Aquarius")) {JOptionPane.showMessageDialog(null, "Your horosope is forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");}
	
	else if (sign .equalsIgnoreCase("Pisces")) {JOptionPane.showMessageDialog(null, "Your horoscope is likeable, energetic, passionate, sensitive.");}
	
	else {
JOptionPane.showMessageDialog(null, "That's not a star sign!");
}

}
}