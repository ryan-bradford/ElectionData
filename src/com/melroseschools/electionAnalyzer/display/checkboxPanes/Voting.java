package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class Voting extends JPanel {

	int y = 20;
	int offset = 30;
	int width = 100;
	
	public Voting(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane voting = new JTextPane();
		voting.setText("Voting");
		voting.setBounds(0, y, width, 30);
		voting.setEditable(false);
		this.add(voting);
		y += offset;
		CategoryCheckbox clinton = new CategoryCheckbox(BallotItems.cand, "Clinton");
		clinton.setBounds(0, y, width, 40);
		this.add(clinton);
		checkboxes.add(clinton);
		y += offset;
		CategoryCheckbox trump = new CategoryCheckbox(BallotItems.cand, "Trump");
		trump.setBounds(0, y, width, 40);
		this.add(trump);
		checkboxes.add(trump);
		y += offset;
		CategoryCheckbox johnson = new CategoryCheckbox(BallotItems.cand, "Johnson");
		johnson.setBounds(0, y, width, 40);
		this.add(johnson);
		checkboxes.add(johnson);
		y += offset;
		CategoryCheckbox stein = new CategoryCheckbox(BallotItems.cand, "Stein");
		stein.setBounds(0, y, width, 40);
		this.add(stein);
		checkboxes.add(stein);
	}
	
}
