package com.melroseschools.electionAnalyzer.dataUtils;

import java.util.HashMap;
import java.util.Map;

import com.melroseschools.electionAnalyzer.electionItems.BallotItems;

public class IndividualResult {
	
	public Map<String, String> allFilters;
	
	public String grade;
	public String gender;
	public String registeredToVote; //0 = Not old, 1 = No, 2 = Yes
	public String classLevel;
	
	public String cand;
	public String hillaryOrTrump; //True is clinton, False is trump, Null is other
	public String party;
	public String cFav;
	public String dFav;
	public String jFav;
	public String sFav;
	
	public String questionOne; //0 = Abstain, 1 = Yes, 2 = No, 3 = Do Not Know Enough
	public String questionTwo; //0 = Abstain, 1 = Yes, 2 = No, 3 = Do Not Know Enough
	public String questionThree; //0 = Abstain, 1 = Yes, 2 = No, 3 = Do Not Know Enough
	public String questionFour; //0 = Abstain, 1 = Yes, 2 = No, 3 = Do Not Know Enough
	
	public String socialIssues;
	public String economicIssues;
	public String foreignIssues;
	public String domesticIssues;
	
	public IndividualResult() {
		allFilters = new HashMap<String, String>();
		socialIssues = new String();
		economicIssues = new String();
		foreignIssues = new String();
		domesticIssues = new String();
	}
		
	public void initPerson(String[] personInfo) {
		personalInformation(personInfo[2], personInfo[3], personInfo[1], personInfo[4], personInfo[5]);
		candPrefernece(personInfo[6], personInfo[15], personInfo[7], personInfo[8], personInfo[9], personInfo[10]);
		ballotInfo(personInfo[11], personInfo[12], personInfo[13], personInfo[14]);
	}
	
	public void ballotInfo(String qOne, String qTwo, String qThree, String qFour) {
		questionOne = qOne;
		questionTwo = qTwo;
		questionThree = qThree;
		questionFour = qFour;
		allFilters.put(BallotItems.questionOne, questionOne);
		allFilters.put(BallotItems.questionTwo, questionTwo);
		allFilters.put(BallotItems.questionThree, questionThree);
		allFilters.put(BallotItems.questionFour, questionFour);

	}
	
	public void personalInformation(String gender, String classLevel, String grade, String registeredToVote, String party) {
		this.registeredToVote = registeredToVote;
		this.gender = gender;
		this.grade = grade;
		this.classLevel = classLevel;
		this.party = party;
		allFilters.put(BallotItems.registeredToVote, this.registeredToVote);
		allFilters.put(BallotItems.gender, this.gender);
		allFilters.put(BallotItems.grade, this.grade);
		allFilters.put(BallotItems.classLevel, this.classLevel);
		allFilters.put(BallotItems.party, this.party);
	}
	
	public void candPrefernece(String candatite, String hillaryOrTrump, String clintonFav, String trumpFav, String johnsonFav, String steinFav) {
		this.cand = candatite;
		this.hillaryOrTrump = hillaryOrTrump;
		
		cFav = clintonFav;
		dFav = trumpFav;
		jFav = johnsonFav;
		sFav = steinFav;
		
		allFilters.put(BallotItems.cand, this.cand);
		allFilters.put(BallotItems.hillaryOrTrump, this.hillaryOrTrump);
		allFilters.put(BallotItems.cFav, this.cFav);
		allFilters.put(BallotItems.dFav, this.dFav);
		allFilters.put(BallotItems.jFav, this.jFav);
		allFilters.put(BallotItems.sFav, this.sFav);
	}
	
}
