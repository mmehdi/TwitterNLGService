package com.twitternlg.servlet;

import com.twitternlg.nlg.TweetFactory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NLGService
 */
@WebServlet("/NLGService")
public class NLGService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NLGService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
    	TweetFactory t = new TweetFactory();
    	
    	String event = request.getParameter("event");
    	String bus_services = request.getParameter("bus-services");
    	String problem = request.getParameter("problem");
    	String location = request.getParameter("location");     
    	String road = request.getParameter("road");
    	String diversion_road = request.getParameter("diversion_road"); 
    	//3)Services 1/2 / X40 from BOD are being diverted along East North St, Commerce St, Virginia St, Guild St and Bridge St.
    	String duration = request.getParameter("duration");
    	String date_start = request.getParameter("date_start");
    	String date_end = request.getParameter("date_end");
    	String service_status = request.getParameter("service_status");
    	
    	out.println(t.generateTweetString(null));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
