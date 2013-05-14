<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=GB18030"
pageEncoding="GB18030"
%>
<%@ page import="servlet.*"%>
<%@ page import="java.lang.*"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.ibm.db2.jcc.*" %>

<META http-equiv="Content-Type" content="text/html; charset=GB18030">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="/logon/theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>denglu_cm.jsp</TITLE>
</HEAD>
<BODY>
<%
			  String accountnamec;
		      String passwordc;
			  String selectc;
	          String password_real;
			  
	
		accountnamec=request.getParameter("accountname");
		passwordc=request.getParameter("password");
		DoConnection lt=new DoConnection();
		System.out.println("Test5");
		DB2Connection conn  = lt.getCon();
			try{
			System.out.println("Test5");
			Statement stm = conn.createStatement();
			//String a=null;
			//a=	"select ACCPSW from CON35.ACCOUNT where ACCid = '"+accountnamec+ "'";
PreparedStatement	ps = conn.prepareStatement("select * from CON35.ACCOUNT");                                                                          
	//////	"select ACCPSW from CON35.ACCOUNT where ACCid = '"+accountnamec+ "'"
	///String ma_query_stm = "select mapsword from te046.manager where maid = '"+ manager_id + "'" ;
	ResultSet rs = ps.executeQuery(); 
//	password_real=rs.getString("pwd");
//  System.out.println(password_real);
        System.out.println("Teewate");		
					//			
if(rs.next())
				{ 
		
					password_real = rs.getString("ACCPSW");
					password_real = password_real.trim();
				if( passwordc.equals(password_real))
				{
				request.getSession(true);
				session.setAttribute("session_logsign","OK"); 
				//session.putValue("session_psword",manager_psword);
        		%>
            <jsp:forward page="/buy.jsp"/>

            <%   }
               else {%>
                       <jsp:forward page="/modify.jsp"/>;
	
			<%	}
				}
				else{%>

           <jsp:forward  page="/sale.jsp" />   
			<%	}     		
   		
				rs.close();
			   ps.close();
		conn.commit();
			}catch(Exception e) {
		e.printStackTrace();
		System.err.println("Error:" + e);
		System.exit(-1);
}
	  %>
</BODY>
</HTML>
