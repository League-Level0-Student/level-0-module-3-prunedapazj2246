package elseif;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer = JOptionPane.showInputDialog("Are you Happy?");
String keep = "keep doing whatever you're doing";
if(answer.equals("yes")) {
	JOptionPane.showMessageDialog(null, keep);
}
else if(answer.equals("no")) {
String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
if(answer2.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Change something.");
}
else if(answer2.equals("no")) {
	JOptionPane.showMessageDialog(null, keep);
}
}

	}

}
