package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {

  String question1 = JOptionPane.showInputDialog(null, "Are you happy? (Yes/ No) ");
if (question1 .equals("Yes")){
JOptionPane.showMessageDialog(null, "keep doing whatever you're doing.");
}

else if (question1 .equals ("No")) {
String question2 = JOptionPane.showInputDialog("Do you want to be happy? (Yes/ No) ");

if (question2 .equals("Yes")) {
JOptionPane.showMessageDialog(null, "Change something.");
}
else {
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}

}	







}
}



