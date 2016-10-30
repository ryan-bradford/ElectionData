package com.melroseschools.electionAnalyzer.display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.dataUtils.IndividualResult;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.Party;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.PersonalInfo;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionFour;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionOne;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionThree;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionTwo;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class SelectorPane extends JPanel {

	ArrayList<CategoryCheckbox> checkboxes;
	public ArrayList<IndividualResult> allResults;
	public Scanner readFile;

	public SelectorPane() {
		checkboxes = new ArrayList<CategoryCheckbox>();
		submitButton();
		try {
			initPersonInfo();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		displayChecks();
	}

	public void displayChecks() {
		initPersonalIDInfo();
		initPartyInfo();
		initQuestionOne();
		initQuestionTwo();
		initQuestionThree();
		initQuestionFour();
	}
	
	public void initPartyInfo() {
		Party party = new Party(checkboxes);
		party.setBounds(150, 50, 100, 400);
		party.setVisible(true);
		this.add(party);
	}
	
	public void initQuestionOne() {
		QuestionOne qOne = new QuestionOne(checkboxes);
		qOne.setBounds(250, 20, 100, 400);
		qOne.setVisible(true);
		this.add(qOne);
	}
	
	public void initQuestionTwo() {
		QuestionTwo qTwo = new QuestionTwo(checkboxes);
		qTwo.setBounds(350, 20, 100, 400);
		qTwo.setVisible(true);
		this.add(qTwo);
	}
	
	public void initQuestionThree() {
		QuestionThree qThree = new QuestionThree(checkboxes);
		qThree.setBounds(450, 20, 100, 400);
		qThree.setVisible(true);
		this.add(qThree);
	}
	
	public void initQuestionFour() {
		QuestionFour qFour = new QuestionFour(checkboxes);
		qFour.setBounds(550, 20, 100, 400);
		qFour.setVisible(true);
		this.add(qFour);
	}

	public void initPersonalIDInfo() {
		PersonalInfo personal = new PersonalInfo(checkboxes);
		personal.setBounds(50, 50, 100, 400);
		personal.setVisible(true);
		this.add(personal);
	}

	public void submitButton() {
		JButton submit = new JButton("Analyze");
		submit.setBounds(200, 400, 200, 50);
		submit.setVisible(true);
		submit.addActionListener(new submit());
		this.add(submit);
	}

	public class submit implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double clintonVotes = 0;
			double totalVotes = 0;
			for (int i = 1; i < allResults.size(); i++) {
				boolean toUse = true;
				for(CategoryCheckbox x: checkboxes) {
					if(x.getState() && !allResults.get(i).allFilters.get(x.category).equals(x.name)) {
						toUse = false;
						if(!toUse) {
						for(CategoryCheckbox y: checkboxes) {
							if(y.getState() && allResults.get(i).allFilters.get(x.category).contains(y.name)) {
								toUse = true;
							}
						}
						}
					}
				}
				if(toUse) {
					totalVotes++;
					if(allResults.get(i).allFilters.get(BallotItems.cand).contains("Hillary Clinton")) {
						clintonVotes++;
					}
				}
			}
			JOptionPane.showMessageDialog(null, "This demographic voted for Clinton at a rate of " + Math.round(10000.0 * clintonVotes / (totalVotes)) / 100.0 + "%");
		}
	}
	
	public void initPersonInfo() throws FileNotFoundException {
		allResults = new ArrayList<IndividualResult>();
		readFile = new Scanner(new File("election.csv"));
		while (readFile.hasNext()) {
			String person = readFile.nextLine();
			String[] personInfo = person.split(",");
			if (personInfo.length > 1) {
				IndividualResult currentResult = new IndividualResult();
				currentResult.initPerson(personInfo);
				allResults.add(currentResult);
			}
		}
	}

}
