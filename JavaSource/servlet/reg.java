package servlet;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.db2.jcc.DB2Connection;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * @version 	1.0
 * @author
 */
public class reg extends HttpServlet {
	
			 public String accname;
			 public String accid;
			 public String accnicheng;
			 public String accpsw;
			 public String accemail;       //定义6个变量
			 public String accphone;
			 public int maxaccid;
	 

 	 
	  
	public void  perform(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		
			accname=req.getParameter("accname");
			accnicheng=req.getParameter("accnicheng");
			accpsw=req.getParameter("accpsw");
			accemail=req.getParameter("accemail");
			accphone=req.getParameter("accphone");
			//fd=	Conv.toasc(usname);
			DoConnection lt=new DoConnection();
		   
			System.out.println("Test3");
			DB2Connection conn  = lt.getCon();
			
			try{
			
				Statement stm = conn.createStatement();
		   PreparedStatement	ps1 = conn.prepareStatement("Select max(ACCID) FROM CON35.ACCOUNT");
		 
 ResultSet rs = ps1.executeQuery();
		   
		   
		   ResultSetMetaData md = rs.getMetaData();
				
		   System.out.println(md.getColumnCount());
		 md.c
				System.out.println("Test3");
int i=0;
				 maxaccid =rs.getInt(i)+1;
				System.out.println(maxaccid);
		        
		   PreparedStatement	ps2 = conn.prepareStatement("Insert into CON35.ACCOUNT (ACCNAME,ACCNICHENG,ACCPSW,ACCEMAIL,ACCPHONE,ACCID)" + "values(?,?,?,?,?,?)" );
					
				ps2.setString(1, accname);
				ps2.setString(2, accnicheng);
				ps2.setString(3, accpsw);
				ps2.setString(4, accemail);
				ps2.setString(5, accphone);
				ps2.setInt(6, maxaccid);
				ps2.executeUpdate();
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
		 //取得Session对象
		 //如果Session不存在，为本次会话创建此对象
		HttpSession session =req.getSession(true);
		
		//如果session是新的
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		
		//接收传来的参数
        
		String accname;
		String accnicheng;
		String accpsw;
		String accemail;
		String accphone;                 //定义变量
		
		accname=req.getParameter("accname");
		accnicheng=req.getParameter("accnicheng");
		accpsw=req.getParameter("accpsw");
		accemail=req.getParameter("accemail");
		accphone=req.getParameter("accphone");              //把表单提交的内容赋值给定义好的变量
		
		System.out.print(accname);
		System.out.print(accnicheng);
		System.out.print(accpsw);
		System.out.print(accemail);
		System.out.print(accphone);          //测试有没有正确接收表单赋值
		
		out.println("<html>");
		out.println("<title>");
		out.println("REGISTER RESULT LIST");
		out.println("</title>");
		out.println("<body>");
		out.println("<P>YOUR ACCOUNT NAME:" +
					req.getParameter("accname") +
					"<BR>YOUR ACCOUNT PASSWORD:" + 
					req.getParameter("accpsw") +
					"<BR>YOUR ACCOUNT NICHENG:" +
					req.getParameter("accnicheng") +
					"<BR>YOUR ACCOUNT E-MAIL:" +
					req.getParameter("accemail") +
					"<BR>YOUR ACCOUNT PHONE:" +
					req.getParameter("accphone") +
					"<BR></P>");
		
		out.println("</TBODY>");
		out.println("</TABLE>");
		out.println("<P>");
		out.println("<A href='index.jsp'>");
		out.println("back to index");
		out.println("</A>");
		out.println("</P>");
		out.println("</body>");
		out.println("</html>");           //输出到页面
		out.close();                      //关闭out
	}

	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	public void init() throws ServletException {

		super.init();

	}

}
