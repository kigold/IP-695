package com.lagosjug;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LagosJugServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("<h1>Welcome to LagosJUG</h1><p><a href='/project-ta-690.html'>Click here for project info.</a></p>");
	}
}
