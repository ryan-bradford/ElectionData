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
	ArrayList<CategoryCheckbox> checkboxes;
	
	public Voting(ArrayList<CategoryCheckbox> checkboxes) {
		this.checkboxes = checkboxes;
		this.setLayout(null);
		initAllCand();
		y += offset;
		initHilOrTrump();
	}
	
	public void initHilOrTrump() {
		JTextPane hilOrTrump = new JTextPane();
		hilOrTrump.setText("Clinton Trump");
		hilOrTrump.setBounds(0, y, width, 30);
		hilOrTrump.setEditable(false);
		this.add(hilOrTrump);
		y += offset;
		CategoryCheckbox clinton = new CategoryCheckbox(BallotItems.hillaryOrTrump, "Democrat- Hillary Clinton");
		clinton.setBounds(0, y, width, 40);
		this.add(clinton);
		checkboxes.add(clinton);
		y += offset;
		CategoryCheckbox trump = new CategoryCheckbox(BallotItems.hillaryOrTrump, "Republican- Donald Trump");
		trump.setBounds(0, y, width, 40);
		this.add(trump);
		checkboxes.add(trump);
		y += offset;
		CategoryCheckbox unanswered = new CategoryCheckbox(BallotItems.hillaryOrTrump, "Unanswered");
		unanswered.setBounds(0, y, width, 40);
		this.add(unanswered);
		checkboxes.add(unanswered);
		y += offset;
	}
	
	public void initAllCand() {
		JTextPane voting = new JTextPane();
		voting.setText("All Candatites");
		voting.setBounds(0, y, width, 30);
		voting.setEditable(false);
		this.add(voting);
		y += offset;
		CategoryCheckbox clinton = new CategoryCheckbox(BallotItems.cand, "Hillary Clinton and Tim Kaine");
		clinton.setBounds(0, y, width, 40);
		this.add(clinton);
		checkboxes.add(clinton);
		y += offset;
		CategoryCheckbox trump = new CategoryCheckbox(BallotItems.cand, "Donald Trump and Mike Pence");
		trump.setBounds(0, y, width, 40);
		this.add(trump);
		checkboxes.add(trump);
		y += offset;
		CategoryCheckbox johnson = new CategoryCheckbox(BallotItems.cand, "Gary Johnson and William Weld");
		johnson.setBounds(0, y, width, 40);
		this.add(johnson);
		checkboxes.add(johnson);
		y += offset;
		CategoryCheckbox stein = new CategoryCheckbox(BallotItems.cand, "Jill Stein and Ajamu");
		stein.setBounds(0, y, width, 40);
		this.add(stein);
		checkboxes.add(stein);
	}
	
}
