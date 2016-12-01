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

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.dataUtils.IndividualResult;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.Party;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.PersonalInfo;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionFour;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionOne;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionThree;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.QuestionTwo;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.SchoolInitative;
import com.melroseschools.electionAnalyzer.display.checkboxPanes.Voting;

public class SelectorPane extends JPanel {

	ArrayList<CategoryCheckbox> preCheckboxes;
	ArrayList<CategoryCheckbox> postCheckboxes;
	public ArrayList<IndividualResult> allResults;
	public Scanner readFile;

	public SelectorPane() {
		preCheckboxes = new ArrayList<CategoryCheckbox>();
		postCheckboxes = new ArrayList<CategoryCheckbox>();
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
		initVotingInfo();
		initSchoolInitative();
	}
	
	public void initPersonalIDInfo() {
		PersonalInfo personal = new PersonalInfo(preCheckboxes);
		personal.setBounds(50, 0, 100, 800);
		personal.setVisible(true);
		this.add(personal);
	}

	
	public void initPartyInfo() {
		Party party = new Party(preCheckboxes);
		party.setBounds(150, 0, 100, 400);
		party.setVisible(true);
		this.add(party);
	}
	
	public void initQuestionOne() {
		QuestionOne qPreOne = new QuestionOne(preCheckboxes);
		qPreOne.setBounds(250, 20, 100, 400);
		qPreOne.setVisible(true);
		this.add(qPreOne);
		
		QuestionOne qPostOne = new QuestionOne(postCheckboxes);
		qPostOne.setBounds(450, 420, 100, 400);
		qPostOne.setVisible(true);
		this.add(qPostOne);
	}
	
	public void initQuestionTwo() {
		QuestionTwo qTwo = new QuestionTwo(preCheckboxes);
		qTwo.setBounds(350, 20, 100, 400);
		qTwo.setVisible(true);
		this.add(qTwo);
		
		QuestionTwo qPostTwo = new QuestionTwo(postCheckboxes);
		qPostTwo.setBounds(550, 420, 100, 400);
		qPostTwo.setVisible(true);
		this.add(qPostTwo);
	}
	
	public void initQuestionThree() {
		QuestionThree qThree = new QuestionThree(preCheckboxes);
		qThree.setBounds(450, 20, 100, 400);
		qThree.setVisible(true);
		this.add(qThree);
		
		QuestionThree qPostThree = new QuestionThree(postCheckboxes);
		qPostThree.setBounds(650, 420, 100, 400);
		qPostThree.setVisible(true);
		this.add(qPostThree);
	}
	
	public void initQuestionFour() {
		QuestionFour qFour = new QuestionFour(preCheckboxes);
		qFour.setBounds(550, 20, 100, 400);
		qFour.setVisible(true);
		this.add(qFour);
		
		QuestionFour qPostFour = new QuestionFour(postCheckboxes);
		qPostFour.setBounds(750, 420, 100, 400);
		qPostFour.setVisible(true);
		this.add(qPostFour);
	}
	
	public void initSchoolInitative() {
		SchoolInitative sInit = new SchoolInitative(preCheckboxes);
		sInit.setBounds(650, 20, 100, 400);
		sInit.setVisible(true);
		this.add(sInit);
		
		SchoolInitative sPostInit = new SchoolInitative(postCheckboxes);
		sPostInit.setBounds(950, 420, 100, 400);
		sPostInit.setVisible(true);
		this.add(sPostInit);
	}
	 
	public void initVotingInfo() {
		Voting preVote = new Voting(preCheckboxes);
		preVote.setBounds(750, 0, 100, 400);
		preVote.setVisible(true);
		this.add(preVote);
		
		Voting postVote = new Voting(postCheckboxes);
		postVote.setBounds(850, 400, 100, 400);
		postVote.setVisible(true);
		this.add(postVote);
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
			String postCat = "";
			String postID = "";
			for(int i = 0; i < postCheckboxes.size(); i++) {
				if(postCheckboxes.get(i).getState()) {
					postCat = postCheckboxes.get(i).category;
					postID = postCheckboxes.get(i).name;
				}
			}
			double clintonVotes = 0;
			double totalVotes = 0;
			for (int i = 1; i < allResults.size(); i++) {
				boolean toUse = true;
				for(CategoryCheckbox x: preCheckboxes) {
					if(x.getState() && !allResults.get(i).allFilters.get(x.category).equals(x.name)) {
						toUse = false;
						if(!toUse) {
						for(CategoryCheckbox y: preCheckboxes) {
							if(y.getState() && allResults.get(i).allFilters.get(x.category).contains(y.name)) {
								toUse = true;
							}
						}
						}
					}
				}
				if(postCat.equals("")) {
					totalVotes++;
					if(toUse) {
						clintonVotes++;
					}
				} else if(toUse) {
					totalVotes++;
					if(allResults.get(i).allFilters.get(postCat).contains(postID)) {
						clintonVotes++;
					}
				}
			}
			if(postCat.equals("")) { 
				JOptionPane.showMessageDialog(null, "This demographic is " + Math.round(10000.0 * clintonVotes / (totalVotes)) / 100.0 + "% of the voting population");
			} else {
				JOptionPane.showMessageDialog(null, "This demographic voted " + postID + " on " + postCat + " at a rate of " + Math.round(10000.0 * clintonVotes / (totalVotes)) / 100.0 + "%");
			}	
		}
	}
	
	public void initPersonInfo() throws FileNotFoundException {
		allResults = new ArrayList<IndividualResult>();
		readFile = new Scanner(new File("election.csv"));
		while (readFile.hasNext()) {
			String[] parts = readFile.nextLine().split(new String("\""));
			String person = "";
			for(int i = 0; i < parts.length; i += 2) {
				person+= parts[i];
			}
			String[] personInfo = person.split(",");
			if (personInfo.length > 1) {
				IndividualResult currentResult = new IndividualResult();
				currentResult.initPerson(personInfo);
				allResults.add(currentResult);
			}
		}
	}

}
