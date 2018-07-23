package car;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Java F1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 838);
		f.add(new Road());
		f.setVisible(true);
		
		
		
		

	}

}