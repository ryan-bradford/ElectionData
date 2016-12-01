package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class Party extends JPanel {

	int width = 100;
	
	public Party(ArrayList<CategoryCheckbox> checkboxes) {
		int y = 20;
		int offset = 30;
		this.setLayout(null);
		JTextPane party = new JTextPane();
		party.setText("Party");
		party.setBounds(0, y, width, 30);
		party.setEditable(false);
		this.add(party);
		CategoryCheckbox democraticParty = new CategoryCheckbox(BallotItems.party, "Democrat");
		y += offset;
		democraticParty.setBounds(0, y, width, 40);
		this.add(democraticParty);
		checkboxes.add(democraticParty);
		CategoryCheckbox republicanParty = new CategoryCheckbox(BallotItems.party, "Republican");
		y += offset;
		republicanParty.setBounds(0, y, width, 40);
		this.add(republicanParty);
		checkboxes.add(republicanParty);
		CategoryCheckbox libratarianParty = new CategoryCheckbox(BallotItems.party, "Independant");
		y += offset;
		libratarianParty.setBounds(0, y, width, 40);
		this.add(libratarianParty);
		checkboxes.add(libratarianParty);
		CategoryCheckbox greenParty = new CategoryCheckbox(BallotItems.party, "Other");
		y += offset;
		greenParty.setBounds(0, y, width, 40);
		this.add(greenParty);
		checkboxes.add(greenParty);
	}
	
}
