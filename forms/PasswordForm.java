package com.demo.struts.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class PasswordForm extends ActionForm{

	protected String password1 = null;
	protected String password2 = null;
	protected String email = null;
	
    public String getPassword1(){
    	return password1;
    }
    
    public void setPassword1(String password1){
    	this.password1 = password1;
    }
    
    public String getPassword2(){
    	return password2;
    }
    
    public void setPassword2(String password2){
    	this.password2 = password2;
    }
    
    public String getEmail(){
    	return email;
    }
    
    public void setEmail(String email){
    	this.email = email;
    }
    
    public ActionErrors validate(ActionMapping argo,HttpServletRequest arg1){
    	ActionErrors errors = new ActionErrors();
    		if(password1 == null || password1.equals("")){
    			if(email== null || email.equals(""))
    			errors.add("password1", new ActionMessage("password.error.username"));
    		}
    		else{
    			if(password2 == null || !password2.equals(password1)){
    				errors.add("password2", new ActionMessage("register.error.password2"));
    			}
    		}
    	return errors;
    }
}
