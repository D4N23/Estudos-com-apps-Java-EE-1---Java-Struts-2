/*
 * HelloWorld! test Class 
 *  IMPORTANTE *********************************************
 *  
 *  REMOVE THESE CLASS AND THE DEFAULT USER CREATED FOR TEST!
*/
package com.strutexample.controller;


import javax.inject.Inject;

import com.strutexample.business.LoginService;



public class HelloAction extends BaseAction{
	@Inject
	LoginService sv;
	
	public String execute(){
		sv.createFirst();
		return "success";
	}

}
