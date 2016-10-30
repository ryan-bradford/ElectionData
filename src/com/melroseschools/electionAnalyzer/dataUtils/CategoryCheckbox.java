package com.melroseschools.electionAnalyzer.dataUtils;

import java.awt.Checkbox;

public class CategoryCheckbox extends Checkbox {

	public String category;
	public String name;
	
	public CategoryCheckbox(String category, String name) {
		super(name);
		this.category = category;
		this.name = name;
	}
	
}
