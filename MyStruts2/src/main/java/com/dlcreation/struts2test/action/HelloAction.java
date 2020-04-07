package com.dlcreation.struts2test.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7898470680411576895L;

	public String sayHello() {
		System.out.println("[HelloAction] - sayHello called");
		return "success";
	}
}
