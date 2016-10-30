package com.melroseschools.electionAnalyzer.display.checkboxPanes;

import java.util.ArrayList;

import javax.swing.JPanel;

import com.melroseschools.electionAnalyzer.dataUtils.CategoryCheckbox;
import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class PersonalInfo extends JPanel {

	public PersonalInfo(ArrayList<CategoryCheckbox> checkboxes) {
		this.setLayout(null);
		CategoryCheckbox male = new CategoryCheckbox(BallotItems.gender, "Male");
		male.setBounds(0, 0, 90, 40);
		this.add(male);
		checkboxes.add(male);
		CategoryCheckbox female = new CategoryCheckbox(BallotItems.gender, "Female");
		female.setBounds(0, 50, 90, 40);
		this.add(female);
		checkboxes.add(female);
		CategoryCheckbox CP = new CategoryCheckbox(BallotItems.classLevel, "College Prep");
		CP.setBounds(0, 100, 90, 40);
		this.add(CP);
		checkboxes.add(CP);
		CategoryCheckbox honors = new CategoryCheckbox(BallotItems.classLevel, "Honors");
		honors.setBounds(0, 150, 90, 40);
		this.add(honors);
		checkboxes.add(honors);
		CategoryCheckbox AP = new CategoryCheckbox(BallotItems.classLevel, "AP");
		AP.setBounds(0, 200, 90, 40);
		this.add(AP);
		checkboxes.add(AP);
		CategoryCheckbox staff = new CategoryCheckbox(BallotItems.classLevel, "Staff");
		staff.setBounds(0, 250, 90, 40);
		this.add(staff);
		checkboxes.add(staff);
	}
	
}
