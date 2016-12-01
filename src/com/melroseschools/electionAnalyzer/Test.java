package com.melroseschools.electionAnalyzer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.swing.JFrame;

import com.melroseschools.electionAnalyzer.display.SelectorPane;
import com.ryanb3.SelfUpdatingJava.Update;


public class Test {

	static String currentIndex = "1.012";
	
	public static void main(String[] args) {
		try {
			new Update("http://rbradford.thaumavor.io/jars/Election_Data/", "ElectionData", "index.txt", currentIndex);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			new Test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Test() throws FileNotFoundException {
		try {
			downloadData();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
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
	
	public void downloadData() throws IOException {
		URL website = new URL("http://rbradford.thaumavor.io/jars/Election_Data/election.csv");
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		FileOutputStream fos = new FileOutputStream("election.csv");
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	}

}
