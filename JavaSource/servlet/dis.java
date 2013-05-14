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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;
import com.ibm.db2.jcc.DB2Connection;
/**
 * @version 	1.0
 * @author
 */
public class dis extends HttpServlet {
	
			  public String usname;
			  public String uspsword;
			  public String cust_number;
	          public String fd;
		 
	public void  perform(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	
		
			DoConnection lt=new DoConnection();
		   
		   System.out.println("Test5");
			DB2Connection conn  = lt.getCon();
			
			try{
			Statement stm = conn.createStatement();

		   PreparedStatement	ps = conn.prepareStatement("select ACCPSW from CON35.ACCOUNT where ACCid = 2");
		   ResultSet rs = ps.executeQuery();
		   
		   
						//   while(rs.next()){
					
							   usname = rs.getString("usrname");
							   uspsword = rs.getString("pwd");
							   cust_number = rs.getString("cust_numb");
				   
							   fd= Conv.togb(usname);
							
						//			   }
						   System.out.println("NULL DATA∫√≈∂");
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
