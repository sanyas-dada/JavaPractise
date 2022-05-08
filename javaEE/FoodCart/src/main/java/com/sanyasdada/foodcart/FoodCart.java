package com.sanyasdada.foodcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/foodcart")
public class FoodCart extends HttpServlet{

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// get the data from the database (model)
		String[] foodItems = {"pizza","brocauli","chickenlolipop","Mom's hand"};
		request.setAttribute("fooditems", foodItems);
		
		
	// redirects to a different page(view)
	   RequestDispatcher dispatcher =request.getRequestDispatcher("show-food.jsp");
	   dispatcher.forward(request, response);
		
	}
	

}
