<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=GB18030"
pageEncoding="GB18030"
%>
<META http-equiv="Content-Type" content="text/html; charset=GB18030">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>a.jsp</TITLE>
</HEAD>
<BODY>
<FORM name="form1" action="servlet/LongTest" method="get">
</FORM>

<jsp:useBean id="ds" scope="request" class="servlet.LogonTest"></jsp:useBean>
<%ds.getCon();%>

<P><TEXTAREA rows="14" cols="32" name="a"><%=ds.usname%></TEXTAREA></P>

</BODY>
</HTML>
