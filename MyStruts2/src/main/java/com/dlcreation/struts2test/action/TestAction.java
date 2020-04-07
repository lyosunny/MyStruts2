package com.dlcreation.struts2test.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 907093955998827198L;

	public String testDispatcher() {
		System.out.println("[ActionSupport] - test dispatcher to student home page");
		return SUCCESS;
	}

	public String testRedirect() {
		System.out.println("[ActionSupport] - test redirect to student home page");
		return SUCCESS;
	}

	public String testChain() {
		System.out.println("[ActionSupport] - test chain to student home page");
		return SUCCESS;
	}

	public String testRedirectAction() {
		System.out.println("[ActionSupport] - test redirect action to student home page");
		return SUCCESS;
	}
}
