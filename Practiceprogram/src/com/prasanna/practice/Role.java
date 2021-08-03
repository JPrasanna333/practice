package com.prasanna.practice;

public class Role {
	private String designation;
	private String manager;
	public Role(String designation,String manager)
	{
		this.designation=designation;
		this.manager=manager;
		
	}
	public String getDesignation() {
		return designation;
	}
	public String getManager() {
		return manager;
	}
	
	

}
