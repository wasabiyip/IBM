package servlet;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.db2.jcc.DB2Connection;

/**
 * @version 	1.0
 * @author
 */
public class ii extends HttpServlet {
	
			  public String usname;
			  public String uspsword;
			  public String cust_number;
	  //   public String fd;
		 
	public void  perform(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	
			usname=req.getParameter("name");
			uspsword=req.getParameter("pwd");
			cust_number=req.getParameter("cust");
		//fd=	Conv.toasc(usname);
		    DoConnection lt=new DoConnection();
		   
		   System.out.println("Test5");
			DB2Connection conn  = lt.getCon();
			
			try{
			Statement stm = conn.createStatement();

		   PreparedStatement	ps = conn.prepareStatement("Insert into CON35.LOGON (USRNAME,PWD,CUST_NUMB)"
					+ "values(?,?,?)");
					
				ps.setString(1,usname);
				ps.setString(2, uspsword);
				ps.setString(3, cust_number);
				ps.executeUpdate();
						conn.commit();
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
