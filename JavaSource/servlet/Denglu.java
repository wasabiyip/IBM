package servlet;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.SQLException;
import java.io.*;
import java.sql.*;
import java.lang.*;
import java.util.*;
import com.ibm.db2.jcc.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.db2.jcc.DB2Connection;
/**
 * @version 	1.0
 * @author
 */

		
public class Denglu extends HttpServlet {
	
			  public String accountnamec;
			  public String passwordc;
			  public String selectc;
	          public String password_real;
			  
	public void perform(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		accountnamec=req.getParameter("accountname");
		passwordc=req.getParameter("password");
		DoConnection lt=new DoConnection();
		
		   System.out.println("Test5");
			DB2Connection conn  = lt.getCon();
			try{
				
			Statement stm = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement("select ACCPSW from CON35.ACCOUNT where ACCid = "+accountnamec+ "");
	////////////////////////////////////////////	
	ResultSet rs = ps.executeQuery(); 
	ps.executeUpdate()
        		
					//			
if(rs.next())
				{ 
			
					password_real = rs.getString("ACCPSW");
					System.out.println(password_real);
					password_real = password_real.trim();
				if( passwordc.equals(password_real))
				{
			
					req.getSession(true);
				//session.setAttribute("session_logsign","OK"); 
				//session.putValue("session_psword",manager_psword);
        		resp.sendRedirect("../buy.jsp");
		
                return;
               }
               else {
				resp.sendRedirect("../cancel.jsp");
				return;
				}
				}
				else{

					resp.sendRedirect("../cancel.jsp");return;
				}     		
   		
			
		rs.close();
				
				
					
			}catch(Exception e) {
		e.printStackTrace();
		System.err.println("Error:" + e);
		System.exit(-1);
	  }
	  finally {      
		 ; 
	  }
	  System.out.println("d");
		}
	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	public void destroy() {

		super.destroy();

	}

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		 perform(req,resp);
	}

	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	public void init() throws ServletException {

		super.init();

	}

}
