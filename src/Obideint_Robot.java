import java.awt.Color;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obideint_Robot {
	static Robot billy = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = JOptionPane.showInputDialog("Which shape would you like me to draw?(circle,triangle,or square)");
		if(str.equals("square")) {
			String str2 = JOptionPane.showInputDialog("What color would you like me to use?(red blue green yellow)");
		if (str2.equals("red")) {
			billy.setPenColor(255,0,0);
			drawSquare();
		}	
		else	if (str2.equals("blue")) {
			billy.setPenColor(0,0,255);
			drawSquare();
		}
		else if (str2.equals("green")) {
			billy.setPenColor(0,255,0);
			drawSquare();
		}
		else {
			billy.setPenColor(Color.YELLOW);
			drawSquare();
		}	
		}
		if(str.equals("circle")) {
			String str2 = JOptionPane.showInputDialog("What color would you like me to use?(red blue green yellow)");
		if (str2.equals("red")) {
			billy.setPenColor(255,0,0);
			drawCircle();
		}	
		else	if (str2.equals("blue")) {
			billy.setPenColor(0,0,255);
			drawCircle();
		}
		else if (str2.equals("green")) {
			billy.setPenColor(0,255,0);
			drawCircle();
		}
		else {
			billy.setPenColor(Color.YELLOW);
			drawCircle();
		}	
		}


}

static void drawSquare(){
	billy.setSpeed(500);
	billy.hide();
	for (int i = 0; i < 4; i++) {
	billy.penDown();
billy.move(100);
billy.turn(90);		}
}
static void drawTriangle() {
	billy.setSpeed(500);
	billy.hide();
for (int i = 0; i < 3; i++) {
	
	billy.penDown();
billy.move(200);
billy.turn(120);		}

}
static void drawCircle() {
	billy.setSpeed(500);
	billy.hide();
	for (int i = 0;i < 360; i++) {
		billy.penDown();
	billy.move(1);
	billy.turn(1);		}
	
}
}