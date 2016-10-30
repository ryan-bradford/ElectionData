package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionTwo extends JPanel {

	public QuestionTwo(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionTwo = new JTextPane();
		questionTwo.setText("Question Two");
		questionTwo.setBounds(0, 0, 100, 30);
		questionTwo.setEditable(false);
		this.add(questionTwo);
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionTwo, "Yes");
		yes.setBounds(0, 30, 90, 40);
		this.add(yes);
		checkboxes.add(yes);
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionTwo, "No");
		no.setBounds(0, 80, 90, 40);
		this.add(no);
		checkboxes.add(no);
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionTwo, "Do Not Know Enough");
		dontKnow.setBounds(0, 130, 90, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
		CategoryCheckbox abstain = new CategoryCheckbox(BallotItems.questionTwo, "Abstain (Non-Vote)");
		abstain.setBounds(0, 180, 90, 40);
		this.add(abstain);
		checkboxes.add(abstain);
	}
	
}
