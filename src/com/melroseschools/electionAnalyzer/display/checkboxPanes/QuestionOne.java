package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionOne extends JPanel {

	int y = 0;
	int offset = 30;
	int width = 100;
	
	public QuestionOne(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionOne = new JTextPane();
		questionOne.setText("Question One");
		questionOne.setBounds(0, y, width, 30);
		questionOne.setEditable(false);
		this.add(questionOne);
		y += offset;
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionOne, "Yes");
		yes.setBounds(0, y, width, 40);
		this.add(yes);
		checkboxes.add(yes);
		y += offset;
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionOne, "No");
		no.setBounds(0, y, width, 40);
		this.add(no);
		checkboxes.add(no);
		y += offset;
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionOne, "Do Not Know Enough");
		dontKnow.setBounds(0, y, width, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
		y += offset;
		CategoryCheckbox abstain = new CategoryCheckbox(BallotItems.questionOne, "Abstain (Non-Vote)");
		abstain.setBounds(0, y, width, 40);
		this.add(abstain);
		checkboxes.add(abstain);
	}
	
}
