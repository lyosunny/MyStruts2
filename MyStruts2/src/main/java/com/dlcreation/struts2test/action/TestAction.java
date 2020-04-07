package com.dlcreation.struts2test.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport
		implements ServletRequestAware, ServletResponseAware, ServletContextAware {

	private static final long serialVersionUID = 907093955998827198L;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext context;

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

	public String doAction1() {

//		First Way to get http object:
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpServletResponse response1 = ServletActionContext.getResponse();
		HttpSession session1 = request1.getSession();
		ActionContext app1 = ServletActionContext.getContext();
		System.out.println("doAction1: ----------------------------------------");
		System.out.println(request1);
		System.out.println(response1);
		System.out.println(session1);
		System.out.println(app1);
		return NONE;
	}

	public String doAction2() {

//		Second Way to get http object: by implements aware interface
		System.out.println("doAction1: ----------------------------------------");
		System.out.println(request);
		System.out.println(response);
		System.out.println(request.getSession());
		System.out.println(context);
		return NONE;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	@Override
	public void setServletContext(ServletContext context) {
		this.context = context;

	}
}
