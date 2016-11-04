package com.melroseschools.electionAnalyzer.dataUtils;

import java.util.HashMap;
import java.util.Map;

import com.melroseschools.electionAnalyzer.electionItems.BallotItems;
import com.melroseschools.electionAnalyzer.electionItems.BallotOrder;

public class IndividualResult {
	
	public Map<String, String> allFilters;
	
	public String grade;
	public String gender;
	public String registeredToVote; 
	public String classLevel;
	public String votedLastTime;
	
	public String cand;
	public String hillaryOrTrump; 
	public String party;
	
	public String questionOne;
	public String questionTwo; 
	public String questionThree; 
	public String questionFour; 
	
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
		personalInformation(personInfo[BallotOrder.gender], personInfo[BallotOrder.classLevel], personInfo[BallotOrder.grade], personInfo[BallotOrder.registeredToVote], personInfo[BallotOrder.party], personInfo[BallotOrder.votedLastTime]);
		candPrefernece(personInfo[BallotOrder.cand], personInfo[BallotOrder.hillaryOrTrump]);
		ballotInfo(personInfo[BallotOrder.questionOne], personInfo[BallotOrder.questionTwo], personInfo[BallotOrder.questionThree], personInfo[BallotOrder.questionFour]);
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
	
	public void personalInformation(String gender, String classLevel, String grade, String registeredToVote, String party, String votedLastTime) {
		this.registeredToVote = registeredToVote;
		this.gender = gender;
		this.grade = grade;
		this.classLevel = classLevel;
		this.party = party;
		this.votedLastTime = votedLastTime;
		allFilters.put(BallotItems.votedLastTime, this.votedLastTime);
		allFilters.put(BallotItems.registeredToVote, this.registeredToVote);
		allFilters.put(BallotItems.gender, this.gender);
		allFilters.put(BallotItems.grade, this.grade);
		allFilters.put(BallotItems.classLevel, this.classLevel);
		allFilters.put(BallotItems.party, this.party);
	}
	
	public void candPrefernece(String candatite, String hillaryOrTrump) {
		this.cand = candatite;
		this.hillaryOrTrump = hillaryOrTrump;

		allFilters.put(BallotItems.cand, this.cand);
		allFilters.put(BallotItems.hillaryOrTrump, this.hillaryOrTrump);
	}
	
}
