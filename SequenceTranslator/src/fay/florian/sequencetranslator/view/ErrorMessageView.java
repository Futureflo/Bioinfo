package fay.florian.sequencetranslator.view;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ErrorMessageView extends JFrame {

	JTextField errorMessageField;

	public ErrorMessageView(String errorMessage) {

		this.errorMessageField = new JTextField(errorMessage);
		this.init();
	}

	private void init() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Error");
		this.add(errorMessageField);
	}
}
