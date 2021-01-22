package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserController {
	
	public void register(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;
	
	public Object getAllUsers(HttpServletRequest request);

}