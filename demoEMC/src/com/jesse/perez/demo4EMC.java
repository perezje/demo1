package com.jesse.perez;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo4EMC
 */
@WebServlet("/demo4EMC")
public class demo4EMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@Override
	public void init() throws ServletException {
		// Servlet initialization code here
		super.init();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo4EMC() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<h1>This is a test Servlet!! </h1>");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

	public void destroy() {
		// resource release
		super.destroy();
	}

}
