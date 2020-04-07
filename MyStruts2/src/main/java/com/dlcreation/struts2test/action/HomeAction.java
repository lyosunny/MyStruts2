package com.dlcreation.struts2test.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {
	private static final long serialVersionUID = 7157903538075619471L;

	public String student() {
		System.out.println("[HomeAction] - get student home page");
		return SUCCESS;
	}

	public String hello() {
		System.out.println("[HomeAction] - get hello home page");
		return SUCCESS;
	}

	public String book() {
		System.out.println("[HomeAction] - get book home page");
		return SUCCESS;
	}
}
