package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionFour extends JPanel {

	public QuestionFour(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionFour = new JTextPane();
		questionFour.setText("Question Four");
		questionFour.setBounds(0, 0, 100, 30);
		questionFour.setEditable(false);
		this.add(questionFour);
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionFour, "Yes");
		yes.setBounds(0, 30, 90, 40);
		this.add(yes);
		checkboxes.add(yes);
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionFour, "No");
		no.setBounds(0, 80, 90, 40);
		this.add(no);
		checkboxes.add(no);
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionFour, "Do Not Know Enough");
		dontKnow.setBounds(0, 130, 90, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
		CategoryCheckbox abstain = new CategoryCheckbox(BallotItems.questionFour, "Abstain (Non-Vote)");
		abstain.setBounds(0, 180, 90, 40);
		this.add(abstain);
		checkboxes.add(abstain);
	}
	
}
