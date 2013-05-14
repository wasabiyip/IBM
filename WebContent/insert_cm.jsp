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
<TITLE>insert_cm.jsp</TITLE>
</HEAD>
<BODY>
<%
String session_logsign = "";
String manager_id="";
String manager_psword="";
String manager_psword_real = "";
manager_id = request.getParameter("ma_id");
manager_psword = request.getParameter("ma_psword");
String ma_query_stm = "select mapsword from te046.manager where maid = '"+ manager_id + "'" ;
DoConnection testcon = new DoConnection();
DB2Connection conn = testcon.getCon();

try {
				PreparedStatement pstm = conn.prepareStatement(ma_query_stm);         
        		ResultSet rs = pstm.executeQuery(); 
        		
        		//
        		if(rs.next())
        		{ 
         	manager_psword_real = rs.getString("MAPSWORD");
         	manager_psword_real = manager_psword_real.trim();
         		if(manager_psword.equals(manager_psword_real))
         		{
         		request.getSession(true);
         		session.setAttribute("session_logsign","OK"); 
                //session.putValue("session_psword",manager_psword);
        		
        		
        		%>
<jsp:forward page="/company_information.jsp"/>
<%}else {%>
<jsp:forward page="/company_log_fall.jsp"/>
<%}	
        		}else{
%>
<jsp:forward  page="/company_log_fall.jsp" />        		
<%}
        		
        		rs.close();
               pstm.close();
         } catch(SQLException ex){
			System.out.println(ex);
			}
		 
 
 %>
</BODY>
</HTML>
