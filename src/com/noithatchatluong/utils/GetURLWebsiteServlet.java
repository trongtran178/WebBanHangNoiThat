package com.noithatchatluong.utils;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetURLWebsiteServlet
 */
@WebServlet("/GetURLWebsiteServlet")
public class GetURLWebsiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetURLWebsiteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
/*		The getRequestURL() omits the port when it is 80 
		while the scheme is http, or 
		when it is 443 while the scheme is https.

		So, just use getRequestURL() 
		if all you want is obtaining the entire URL. 
		This does however not include the GET query string.*/
		/*StringBuffer requestURL = request.getRequestURL();
		System.out.println(request.getRequestURI());
		if (request.getQueryString() != null) {
		    requestURL.append("?").append(request.getQueryString());
		}
		String completeURL = requestURL.toString();
		System.out.println(completeURL + "  ? ?? ? ");*/
		
/*		//Cách 1
		String uri = request.getRequestURI();
		//uri = "/context/someAction"
		String url = request.getRequestURL().toString();
		// url = "http://server.name:8080/context/someAction"
		String ctxPath = request.getContextPath();
		// ctxPath = "/context";
		url = url.replaceFirst(uri, "");
		// url = "http://server.name:8080"
		url = url + ctxPath;
		//url = "http://server.name:8080/context"
		System.out.println(url);*/
		
		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		String ctx = request.getContextPath();
		String base = url.substring(0, url.length() - uri.length() + ctx.length()) + "/";
		base += "/confirmAccount?" + "jokeaisthis=" + "ád";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
