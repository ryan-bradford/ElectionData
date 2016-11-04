package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class PersonalInfo extends JPanel {

	ArrayList<CategoryCheckbox> checkboxes;
	int y = 20;
	int offset = 30;
	int width = 100;
	
	public PersonalInfo(ArrayList<CategoryCheckbox> checkboxes) {
		this.checkboxes = checkboxes;
		JTextPane personalInfo = new JTextPane();
		personalInfo.setText("Personal Info");
		personalInfo.setBounds(0, y, 100, 30);
		personalInfo.setEditable(false);
		this.add(personalInfo);
		this.setLayout(null);
		initGender();
		initClassLevel();
		initAge();
		initRegistration();
		initVoting();
	}
	
	public void initAge() {
		y += offset;
		CategoryCheckbox freshman = new CategoryCheckbox(BallotItems.grade, "9");
		freshman.setBounds(0, y, width, 40);
		this.add(freshman);
		checkboxes.add(freshman);
		y += offset;
		CategoryCheckbox sophomore = new CategoryCheckbox(BallotItems.grade, "10");
		sophomore.setBounds(0, y, width, 40);
		this.add(sophomore);
		checkboxes.add(sophomore);
		y += offset;
		CategoryCheckbox junior = new CategoryCheckbox(BallotItems.grade, "11");
		junior.setBounds(0, y, width, 40);
		this.add(junior);
		checkboxes.add(junior);
		y += offset;
		CategoryCheckbox senior = new CategoryCheckbox(BallotItems.grade, "12");
		senior.setBounds(0, y, width, 40);
		this.add(senior);
		checkboxes.add(senior);
		y += offset;
		CategoryCheckbox staff = new CategoryCheckbox(BallotItems.grade, "Teacher");
		staff.setBounds(0, y, width, 40);
		this.add(staff);
		checkboxes.add(staff);
	}
	
	public void initClassLevel() {
		y += offset;
		CategoryCheckbox CP = new CategoryCheckbox(BallotItems.classLevel, "College Prepatory");
		CP.setBounds(0, y, width, 40);
		this.add(CP);
		checkboxes.add(CP);
		y += offset;
		CategoryCheckbox honors = new CategoryCheckbox(BallotItems.classLevel, "Honors");
		honors.setBounds(0, y, width, 40);
		this.add(honors);
		checkboxes.add(honors);
		y += offset;
		CategoryCheckbox AP = new CategoryCheckbox(BallotItems.classLevel, "Advanced Placement");
		AP.setBounds(0, y, width, 40);
		this.add(AP);
		checkboxes.add(AP);
	}
	
	public void initRegistration() {
		y += offset;
		CategoryCheckbox registered = new CategoryCheckbox(BallotItems.registeredToVote, "Yes", true);
		registered.setBounds(0, y, width, 40);
		this.add(registered);
		checkboxes.add(registered);
		y += offset;
		CategoryCheckbox notReg = new CategoryCheckbox(BallotItems.registeredToVote, "No", true);
		notReg.setBounds(0, y, width, 40);
		this.add(notReg);
		checkboxes.add(notReg);
		y += offset;
		CategoryCheckbox notOld = new CategoryCheckbox(BallotItems.registeredToVote, "Not old enough", true);
		notOld.setBounds(0, y, width, 40);
		this.add(notOld);
		checkboxes.add(notOld);
	}
	
	public void initGender() {
		y += offset;
		CategoryCheckbox male = new CategoryCheckbox(BallotItems.gender, "Male");
		male.setBounds(0, y, width, 40);
		this.add(male);
		checkboxes.add(male);
		y += offset;
		CategoryCheckbox female = new CategoryCheckbox(BallotItems.gender, "Female");
		female.setBounds(0, y, width, 40);
		this.add(female);
		checkboxes.add(female);
		y += offset;
		CategoryCheckbox other = new CategoryCheckbox(BallotItems.gender, "Other");
		other.setBounds(0, y, width, 40);
		this.add(other);
		checkboxes.add(other);
	}
	
	public void initVoting() {
		y += offset;
		CategoryCheckbox votedLast = new CategoryCheckbox(BallotItems.votedLastTime, "Yes", true);
		votedLast.setBounds(0, y, width, 40);
		this.add(votedLast);
		checkboxes.add(votedLast);
		y += offset;
		CategoryCheckbox didNotVoteLast = new CategoryCheckbox(BallotItems.votedLastTime, "No", true);
		didNotVoteLast.setBounds(0, y, width, 40);
		this.add(didNotVoteLast);
		checkboxes.add(didNotVoteLast);
	}
	
}
