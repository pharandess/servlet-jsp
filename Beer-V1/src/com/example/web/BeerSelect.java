package com.example.web;

import com.example.model.*;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class BeerSelect extends HttpServlet {
	
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
		
		PrintWriter out = response.getWriter();
		
		out.println("Beer Selection Advice <br>");
		
		String c = request.getParameter("color");
		
		ArrayList<String> beerBrands;
		
		BeerExpert be = new BeerExpert();		
		
		beerBrands = (ArrayList) be.getBrands(c); 
		
		/*
		out.println("Got Beer Color " + c);
		for(String st : beerBrands) {
			out.println("Try "+ st + "<br>");
		}
		
	*/		
		request.setAttribute("styles", beerBrands);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
