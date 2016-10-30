package com.melroseschools.electionAnalyzer;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

import com.melroseschools.electionAnalyzer.display.SelectorPane;


public class Test {


	public static void main(String[] args) {
		try {
			new Test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Test() throws FileNotFoundException {
		initDisplay();
	}
	
	public void initDisplay() {
		JFrame display = new JFrame();
		display.setBounds(0, 0, 1000, 1000);
		display.setVisible(true);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setLayout(null);
		SelectorPane pane = new SelectorPane();
		pane.setBounds(0, 0, 1000, 1000);
		pane.setVisible(true);
		pane.setLayout(null);
		display.add(pane);
		display.repaint();
	}

}
