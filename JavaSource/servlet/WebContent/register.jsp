<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>

<head>

<%@ page 
language="java"
contentType="text/html; charset=GB18030"
pageEncoding="GB18030"
%>
<META http-equiv="Content-Type" content="text/html; charset=GB18030">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">

<title>LXYH-���н���ģ��ϵͳ�����˻�ע��</title>

<script type="text/javascript">
function on_click(form)
{  
 if(form.accname.value==""){
    alert("�������û�ID");
    return false;
 }
 if(form.accpsw.value==""){
    alert("���벻��Ϊ��");
    return false;
 }
 if(form.reaccpsw.value==""){
    alert("ȷ�����벻��Ϊ��");
    return false;
 }
 if(form.accpsw.value!=form.reaccpsw.value){
    
    alert("ȷ�����������벻һ��");
    return false;
 }
 
 var forwardemail=form.accemail.value;
   var ptn=/^[a-zA-Z0-9\-_\.]+@[a-zA-Z0-9_\-\.]+\.\w+/i;
   if (forwardemail=='')
   {
     alert('����д��ȷ��email��ַ');
     return false;
   }
   var flag=ptn.test(forwardemail);
   if (!flag)
   {
     alert('����д��ȷ��email��ַ');
     return false;
   }
   //return false;
 form.submit();
}


</script>
</head>
<body leftmargin="0" topmargin="0">
<form action="servlet/Register"  method="post" >
<!--00000-->
<div align="center">
<table width="50%"  border="0" align="center" cellpadding="0" cellspacing="0">

<tr>
      <td width="31" height="23"></td>
      <td width="100%"  class="show-title">�û�ע��</td>
      <td></td>
</tr>

<TR>
<TD colspan="3">
<table width="100%"  border="0" align="center" cellpadding="3" cellspacing="1"> 
 <TR>
  <TD bgColor="#ffffff">�˻�����</TD>
  <td bgColor="#ffffff">
  <input type="text" name="accname" size="20" value="" styleClass="button" >
  
  </td> 
 </TR>
 <TR>
  <TD bgColor="#ffffff">����:</td>
  <td bgColor="#ffffff">
  <input type="password" name="accpsw" size="20" styleClass="button" >
  </td>

 </TR>
 <TR>
  <TD bgColor="#ffffff">ȷ������:</td>
  <td bgColor="#ffffff">
  <input type="password" name="reaccpsw" size="20" styleClass="button" >
  </td>

 </TR>
 <TR>
  <TD bgColor="#ffffff">�ǳ�:</td>
  <td bgColor="#ffffff">
  <input type="text" name="accnicheng" size="20" value="" styleClass="button" >
  </td>

 </TR>
  <TR>
  <TD bgColor="#ffffff">�ʼ���ַ:</td>
  <td bgColor="#ffffff">
  <input type="text" name="accemail" size="20" value="" styleClass="button" >
  </td>

 </TR>
 
 <TR>
  <TD bgColor="#ffffff">�绰��</td>
  <td bgColor="#ffffff"><INPUT type="text" name="accphone" size="20" value="" styleClass="button">
  </td>
 </TR>
</table>
</TD>
</tr>

<tr>
<td colspan="3" align="center">
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
 <tr>
   <td><table width="100%" border="0" cellpadding="3" cellspacing="1">
     <tr align="center">
       <td bgcolor="#ffffff"><hr>
           <table width="30%"  border="0" cellspacing="0" cellpadding="0">
             <tr>
             <td><table width="60" border="0" cellspacing="0" cellpadding="0">
                   <tr>
                     <td></td>
                     <td width="100%" >
                     <div align="center">
                     <input type="button" name="button1" value="ȷ��" onclick=on_click(this.form)>
                     </div>
                     <td width="100%">
                     <div align="center">
                     <INPUT type="reset" name="Submit2" value="����">
                     </div>
                     </td>
                     
                     <td>
                     </td>
                   </tr>
               </table></td>
               </table></td>
     </tr>
   </table>
</td>
</tr>

</table>

</div>
<A href="index.jsp">������ҳ</A></form>
</body>
</html>
