package chapte03;

import java.awt.Button;

import javax.swing.*;

public class EventEx2 extends JFrame {

	JLabel label;

	public EventEx2() {

		label = new JLabel();
		label.setBounds(10, 20, 100, 20);
		Button btn = new Button("click me");
		// btn.setBounds(50.50.50.50);

	}

	public static void main(String[] args) {
		new EventEx2();
	}
}
