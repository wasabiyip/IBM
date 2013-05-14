package servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 	1.0
 * @author
 */
public class T1 extends HttpServlet {

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {



		}
	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	public void init() throws ServletException {

		super.init();

	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
   req.setAttribute("a","kkajkejkajekjkjrkjkkkkkk");
		
		
		}


}
