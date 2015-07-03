package com.demo.struts.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import java.lang.*;


public class InsertbookForm extends ActionForm{
	
	protected String bookname = null;
	protected String author = null;
	protected String price = null;
    
    public String getBookname(){
    	return bookname;
    }
    
    public void setBookname(String bookname){
    	this.bookname = bookname;
    }
    
    public String getAuthor(){
    	return author;
    }
    
    public void setAuthor(String author){
    	this.author = author;
    }
    
    public String getPrice(){
    	return price;
    }
    
    public void setPrice(String price){
    	this.price = price;
    }
    
    public ActionErrors validate(ActionMapping argo,HttpServletRequest arg1){
    	ActionErrors errors = new ActionErrors();
    	String queryString = arg1.getQueryString();
    	if(queryString.equalsIgnoreCase("method=insertbook")){
    		
    		if(bookname == null || bookname.equals("")){
    			errors.add("bookname", new ActionMessage("insertbook.error.bookname"));
    		}
    		
    		if(author == null || author.equals("")){
    			errors.add("author", new ActionMessage("insertbook.error.author"));
    		}
    		
    		if(price == null || price.equals("")){
    			errors.add("price", new ActionMessage("insertbook.error.price"));
    		}
    		Boolean strResult = price.matches("-?[0-9]+.*[0-9]*");
    	    if(strResult == false) {
    	    	errors.add("price", new ActionMessage("insertbook.error.price2"));
    	    }
    	}
    	return errors;
    }
}
