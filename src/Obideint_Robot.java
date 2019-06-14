import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obideint_Robot {
	Robot billy = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot billy = new Robot();
		String str = JOptionPane.showInputDialog("Which shape would you like me to draw?(circle,triangle,or square");
		if(str.equals("square")) {
			
		}


}

void drawSquare(){
	Robot billy = new Robot();
	billy.hide();
	for (int i = 0; i < 4; i++) {
	billy.penDown();
billy.move(100);
billy.turn(90);		}
}
void drawTriangle() {
	Robot billy = new Robot();
	billy.hide();
for (int i = 0; i < 3; i++) {
	
	billy.penDown();
billy.move(200);
billy.turn(120);		}

}
void drawCircle() {
	Robot billy = new Robot();
	billy.hide();
	for (int i = 0; i < 360; i++) {
		billy.penDown();
	billy.move(1);
	billy.turn(1);		}
	
}
}