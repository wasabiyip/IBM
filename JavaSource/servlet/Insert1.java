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

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * @version 	1.0
 * @author
 */
public class Insert1 extends HttpServlet {
	
			 public String stockname;
			 public String stockid;
			 public String stonum;
			 public String stockinfom;
			 public String stosty;       //定义5个变量
			 
			 public String addcheck;     //定义变量检查插入成功与否
	  
	public void  perform(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		System.out.println("Test5");
			stockname=req.getParameter("stockname");
			stockid=req.getParameter("stockid");
			stonum=req.getParameter("basicnum");
			stockinfom=req.getParameter("stockinfom");
			stosty=req.getParameter("stosty");
			
		//fd=	Conv.toasc(usname);
		System.out.println("Test5");
			DoConnection lt=new DoConnection();
		   
		   System.out.println("Test5");
			DB2Connection conn  = lt.getCon();
			
			try{
			Statement stm = conn.createStatement();
			System.out.println("Test5");
		   PreparedStatement	ps = conn.prepareStatement("Insert into CON35.STOCK(STOCKID,STONAME,STOSTY,STOFA,STODATA)"
					+ "values(?,?,?,?,?)");
					
				ps.setString(1, stockid);
				ps.setString(2, stockname);
				ps.setString(3, stosty);
				ps.setString(4, stonum);
				ps.setString(5, stockinfom);
				
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
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, 

javax.servlet.http.HttpServletResponse)
	*/
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			System.out.println("35rtr3w4yrt");
		 //perform(req,resp);
		//取得Session对象
	//如果Session不存在，为本次会话创建此对象
	perform(req,resp);
		HttpSession session =req.getSession(true);
		
		//如果session是新的
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		
		//接收传来的参数
        
		String stockid;
		String stockname;
		String stonum;
		String stockinfom;
		String stosty;                 //定义变量
		
		stockname=req.getParameter("stockname");
		stockid=req.getParameter("stockid");
		stonum=req.getParameter("basicnum");
		stockinfom=req.getParameter("stockinfom");
		stosty=req.getParameter("stosty");              //把表单提交的内容赋值给定义好的变量
		
		System.out.print(stockname);
		System.out.print(stockid);
		System.out.print(stonum);
		System.out.print(stockinfom);
		System.out.print(stosty);          //测试有没有正确接收表单赋值
		
		out.println("<html>");
		out.println("<title>");
		out.println("ADDstock List");
		out.println("</title>");
		out.println("<body>");
		out.println("<P>stockid-added:" +
		stockid+
					"<BR>stockname-added:" + 
					req.getParameter("stockname") +
					"<BR>stocksty-added:" +
					req.getParameter("stosty") +
					"<BR>stockbasicnumber-added:" +
					req.getParameter("basicnum") +
					"<BR>stockdata-added:" +
					req.getParameter("stockinfom") +
					"<BR></P>");
			        
			        
		//out.println("<TABLE border="1" width="744" height="332">");
		//out.println("<TBODY>");
		
		//out.println("<TR>");
		//out.println("<TD width="150">已添加股票代码</TD>");
		//out.println("<TD width="431">" + req.getParameter("stockid") + "</TD>");
		//out.println("</TR>");
		//out.println("<TR>");
		//out.println("<TD width="150">已添加股票名称</TD>");
		//out.println("<TD width="431">" + req.getParameter("stockname") + "</TD>");
		//out.println("</TR>");
		//out.println("<TR>");
		//out.println("<TD width="150">已添加股票发行数量</TD>");
		//out.println("<TD width="431">" + req.getParameter("basicnum") + "</TD>");
		//out.println("</TR>");
		//out.println("<TR>");
		//out.println("<TD width="150">已添加股票类型</TD>");
		//out.println("<TD width="431">" + req.getParameter("stosty") + "</TD>");
		//out.println("</TR>");
		//out.println("<TR>");
		//out.println("<TD width="150">已添加股票资料</TD>");
		//out.println("<TD width="431">" + req.getParameter("stockinfom") + "</TD>");
		//out.println(" </TR>");
		
		out.println("</TBODY>");
		out.println("</TABLE>");
		out.println("</body>");
		out.println("</html>");           //输出到页面
		out.close();                      //关闭out
		
		
	}

	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	
	public void init() throws ServletException {
	//	System.out.println("Test5");
		super.init();

	}

}
