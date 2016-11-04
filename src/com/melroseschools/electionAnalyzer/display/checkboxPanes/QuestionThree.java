package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class QuestionThree extends JPanel {

	int y = 0;
	int offset = 30;
	int width = 100;
	
	public QuestionThree(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		JTextPane questionThree = new JTextPane();
		questionThree.setText("Question Three");
		questionThree.setBounds(0, y, width, 30);
		questionThree.setEditable(false);
		this.add(questionThree);
		y += offset;
		CategoryCheckbox yes = new CategoryCheckbox(BallotItems.questionThree, "Yes");
		yes.setBounds(0, y, width, 40);
		this.add(yes);
		checkboxes.add(yes);
		y += offset;
		CategoryCheckbox no = new CategoryCheckbox(BallotItems.questionThree, "No");
		no.setBounds(0, y, width, 40);
		this.add(no);
		checkboxes.add(no);
		y += offset;
		CategoryCheckbox dontKnow = new CategoryCheckbox(BallotItems.questionThree, "Do Not Know Enough");
		dontKnow.setBounds(0, y, width, 40);
		this.add(dontKnow);
		checkboxes.add(dontKnow);
		y += offset;
		CategoryCheckbox abstain = new CategoryCheckbox(BallotItems.questionThree, "Abstain (Non-Vote)");
		abstain.setBounds(0, y, width, 40);
		this.add(abstain);
		checkboxes.add(abstain);	
	}
	
}
