package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class Party extends JPanel {

	public Party(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		CategoryCheckbox democraticParty = new CategoryCheckbox(BallotItems.party, "Democratic");
		democraticParty.setBounds(0, 0, 90, 40);
		this.add(democraticParty);
		checkboxes.add(democraticParty);
		CategoryCheckbox republicanParty = new CategoryCheckbox(BallotItems.party, "Republican");
		republicanParty.setBounds(0, 50, 90, 40);
		this.add(republicanParty);
		checkboxes.add(democraticParty);
		CategoryCheckbox libratarianParty = new CategoryCheckbox(BallotItems.party, "Libretarian");
		libratarianParty.setBounds(0, 100, 90, 40);
		this.add(libratarianParty);
		checkboxes.add(democraticParty);
		CategoryCheckbox greenParty = new CategoryCheckbox(BallotItems.party, "Green");
		greenParty.setBounds(0, 150, 90, 40);
		this.add(greenParty);
		checkboxes.add(greenParty);
	}
	
}
