package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class SchoolInitative extends JPanel {
	int y = 0;
	int offset = 30;
	int width = 100;
	
	public SchoolInitative(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane schoolInitative = new JTextPane();
		schoolInitative.setText("School Initative");
		schoolInitative.setBounds(0, y, width, 30);
		schoolInitative.setEditable(false);
		this.add(schoolInitative);
		y += offset;
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.schoolInitative, "Yes");
		yes.setBounds(0, y, width, 40);
		this.add(yes);
		checkboxes.add(yes);
		y += offset;
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.schoolInitative, "No");
		no.setBounds(0, y, width, 40);
		this.add(no);
		checkboxes.add(no);
		y += offset;
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.schoolInitative, "Unanswered");
		dontKnow.setBounds(0, y, width, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
		y += offset;
	}
}
