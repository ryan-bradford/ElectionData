package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionFour extends JPanel {

	int y = 0;
	int offset = 30;
	int width = 100;
	
	public QuestionFour(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionFour = new JTextPane();
		questionFour.setText("Question Four");
		questionFour.setBounds(0, 0, width, 30);
		questionFour.setEditable(false);
		this.add(questionFour);
		y += offset;
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionFour, "Yes");
		yes.setBounds(0, y, width, 40);
		this.add(yes);
		checkboxes.add(yes);
		y += offset;
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionFour, "No");
		no.setBounds(0, y, width, 40);
		this.add(no);
		checkboxes.add(no);
		y += offset;
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionFour, "Unanswered");
		dontKnow.setBounds(0, y, width, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
	}
	
}
