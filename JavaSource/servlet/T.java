package servlet;

import java.io.*;
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
public class T extends HttpServlet {
	
			  public String t;
			  
			  
	public void doGet(httpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
			t="rteydse rgdsfgffffffffffffffffffffffff";
			req.setAttribute("text",t);
			this.getServletContext().getRequestDispatcher("../text.jsp").include(req ,resp);
	//PrintWriter out=resp.getWriter();
	//out.print(t);//  ����߽��ܲ��� ���Ǳ���� �������Ǹ���������������
	
	//���� �Ҹ㲻��
	
			//t=req.getParameter("text");
			
		//	DoConnection lt=new DoConnection();
		 //	DB2Connection conn  = lt.getCon();
			
			//Statement stm = conn.createStatement();

		   //PreparedStatement	ps = conn.prepareStatement("Insert into CON36.LOG (USRNAME)"
			//		+ "values(?)");
			//		
			//	ps.setString(1,t );
			//	ps.executeUpdate();
								
		
	  }
	
	}
	