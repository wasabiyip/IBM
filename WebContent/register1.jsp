<%@ page contentType="text/html;charset=GBK" %>


<html>
<head>
<title>LXYH-���н���ģ��ϵͳ�����˻�ע��</title>
<link href="<%=request.getContextPath()%>/css/sc.css" rel="stylesheet" type = "text/css">
<script type="text/javascript">
function on_click(form)
{  
 if(form.accountname.value==""){
    alert("�������û�ID");
    return false;
 }
 if(form.password.value==""){
    alert("���벻��Ϊ��");
    return false;
 }
 if(form.repassword.value==""){
    alert("ȷ�����벻��Ϊ��");
    return false;
 }
 if(form.password.value!=form.repassword.value){
    
    alert("ȷ�����������벻һ��");
    return false;
 }
 
 var forwardemail=form.accountemail.value;
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


<form action="servlet/register"  method="post" >

     
<!-- ?��?��???? -->
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
  <input type="text" name="accountname" size="20" value="" styleClass="button" >
  
  </td> 
 </TR>
 <TR>
  <TD bgColor="#ffffff">����:</td>
  <td bgColor="#ffffff">
  <input type="password" name="password" size="20" styleClass="button" >
  </td>

 </TR>
 <TR>
  <TD bgColor="#ffffff">ȷ������:</td>
  <td bgColor="#ffffff">
  <input type="password" name="repassword" size="20" styleClass="button" >
  </td>

 </TR>
 <TR>
  <TD bgColor="#ffffff">�ǳ�:</td>
  <td bgColor="#ffffff">
  <input type="text" name="accountnicheng" size="20" value="" styleClass="button" >
  </td>

 </TR>
  <TR>
  <TD bgColor="#ffffff">�ʼ���ַ:</td>
  <td bgColor="#ffffff">
  <input type="text" name="accountemail" size="20" value="" styleClass="button" >
  </td>

 </TR>
 
 <TR>
  <TD bgColor="#ffffff">�绰��</td>
  <td bgColor="#ffffff"><INPUT type="text" name="accountphone" size="20" value="" styleClass="button">
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
</form>
</div>
</body>
</html>
