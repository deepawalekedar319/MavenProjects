package com.kedar.serlvets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
@WebServlet("/init")
public class ServletInitServlet extends HttpServlet {
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("ServletInitServlet.init() :: Current class init(-) exeutes" );
//	} // init(-)
	// If we place only init() method then this method ll executes bsc
	// in super class (GenericServlet Class) init(-) is internally calling init() method...
	@Override
	public void init() throws ServletException {
		System.out.println("ServletInitServlet.init() :: If we place both init() then only life cycle method executes...");
	}
} // class
