 
import java.io.IOException;

//import java.io.PrintWriter;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;
 
@WebServlet("/") //url mapping root directory

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static int counter = 0;

    public HelloServlet() {

        super();

    }

    //POST

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 

    ServletException,IOException {

    	//reading request and processing

    	System.out.println("Post Request Sent");

    	HttpSession session = request.getSession();  

    	session.setAttribute("username", "abhishek gowda");

    	System.out.println((String) session.getAttribute("username"));

    	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)

    		throws IOException {

    	//reading request and processing

    	System.out.println("GET REQUEST"+counter);

    	counter++;

    }

    //doPatch , doDelete, doPut, doOptions
 
}

 