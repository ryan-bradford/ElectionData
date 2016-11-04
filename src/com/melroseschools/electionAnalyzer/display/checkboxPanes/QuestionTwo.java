package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionTwo extends JPanel {

	int y = 0;
	int offset = 30;
	int width = 100;
	
	public QuestionTwo(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionTwo = new JTextPane();
		questionTwo.setText("Question Two");
		questionTwo.setBounds(0, y, width, 30);
		questionTwo.setEditable(false);
		this.add(questionTwo);
		y += offset;
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionTwo, "Yes");
		yes.setBounds(0, y, width, 40);
		this.add(yes);
		checkboxes.add(yes);
		y += offset;
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionTwo, "No");
		no.setBounds(0, y, width, 40);
		this.add(no);
		checkboxes.add(no);
		y += offset;
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionTwo, "Unanswered");
		dontKnow.setBounds(0, y, width, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
	}
	
}
