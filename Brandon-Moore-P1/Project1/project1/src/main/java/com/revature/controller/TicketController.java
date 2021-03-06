package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface TicketController {
	
	public void insertTicket(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException;

	public void viewAll(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException; 
	
	public void viewAllApproved(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException; 
	
	public void viewAllDenied(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException; 
	
	public void viewAllPending(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException; 
	
	public void viewAllUser(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException; 
	
	public void changeTicketStatus(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException;

	
}



