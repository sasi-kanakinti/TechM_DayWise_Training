package controller;
 
import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;
 
import javax.sql.DataSource;
 
import jakarta.annotation.Resource;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/DBStatement")

public class DBStatements extends HttpServlet{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/MyDB") // JDBC Resource

	    private DataSource dataSource;
 
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)

	            throws ServletException, IOException {

	    	response.setContentType("text/html");

	    	PrintWriter out = response.getWriter();

	    	//db connection

	    	try {

	    		 Connection conn = dataSource.getConnection();

	             Statement stmt = conn.createStatement(); 

	             String sqlQuery = "SELECT * FROM students";

	             ResultSet res = stmt.executeQuery(sqlQuery);

	             while(res.next()) {

	           out.println("<h1>id:"+res.getInt("id")+

	        		   " email"+res.getString("email")+

	        		   " Name:"+res.getString("name")+

	        		   " age:"+res.getInt("age")+"</h1>");

	             }

	    	}catch(Exception e) {

	    		out.println("<h1>Error:"+e.getMessage()+"</h1>");

	    	}

	    }

}

 