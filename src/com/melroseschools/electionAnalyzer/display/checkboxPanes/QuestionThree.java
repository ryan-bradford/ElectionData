package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionThree extends JPanel {

	public QuestionThree(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionThree = new JTextPane();
		questionThree.setText("Question Three");
		questionThree.setBounds(0, 0, 100, 30);
		questionThree.setEditable(false);
		this.add(questionThree);
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionThree, "Yes");
		yes.setBounds(0, 30, 90, 40);
		this.add(yes);
		checkboxes.add(yes);
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionThree, "No");
		no.setBounds(0, 80, 90, 40);
		this.add(no);
		checkboxes.add(no);
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionThree, "Do Not Know Enough");
		dontKnow.setBounds(0, 130, 90, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
		CategoryCheckbox abstain = new CategoryCheckbox(BallotItems.questionThree, "Abstain (Non-Vote)");
		abstain.setBounds(0, 180, 90, 40);
		this.add(abstain);
		checkboxes.add(abstain);	
	}
	
}
