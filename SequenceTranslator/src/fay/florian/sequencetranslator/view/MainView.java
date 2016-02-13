package fay.florian.sequencetranslator.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import fay.florian.sequencetranslator.controller.TranslatorFactory;

public class MainView extends JFrame {

	JPanel mainPanel;

	JScrollPane textAreaInputScrollPane;
	JScrollPane textAreaOutputScrollPane;
	JTextArea inputArea;
	JTextArea outputArea;
	JButton translateButton;

	public MainView() {
		this.init();
	}

	private void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MySequenceTranslator");

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4, 4));

		inputArea = new JTextArea();
		textAreaInputScrollPane = new JScrollPane(inputArea);

		translateButton = new JButton("Translate");

		ActionListener translateListener = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				TranslatorFactory.getTranslator("").translate(inputArea.getText());
			}
		};
		translateButton.addActionListener(translateListener);

		outputArea = new JTextArea();
		textAreaOutputScrollPane = new JScrollPane(outputArea);

		mainPanel.add(textAreaInputScrollPane);
		mainPanel.add(translateButton);
		mainPanel.add(textAreaOutputScrollPane);

		this.add(mainPanel);

		this.pack();
		this.setVisible(true);
	}
}
