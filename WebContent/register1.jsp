<%@ page contentType="text/html;charset=GBK" %>


<html>
<head>
<title>LXYH-股市交易模拟系统——账户注册</title>
<link href="<%=request.getContextPath()%>/css/sc.css" rel="stylesheet" type = "text/css">
<script type="text/javascript">
function on_click(form)
{  
 if(form.accountname.value==""){
    alert("请输入用户ID");
    return false;
 }
 if(form.password.value==""){
    alert("密码不能为空");
    return false;
 }
 if(form.repassword.value==""){
    alert("确认密码不能为空");
    return false;
 }
 if(form.password.value!=form.repassword.value){
    
    alert("确认密码与密码不一致");
    return false;
 }
 
 var forwardemail=form.accountemail.value;
   var ptn=/^[a-zA-Z0-9\-_\.]+@[a-zA-Z0-9_\-\.]+\.\w+/i;
   if (forwardemail=='')
   {
     alert('请填写正确的email地址');
     return false;
   }
   var flag=ptn.test(forwardemail);
   if (!flag)
   {
     alert('请填写正确的email地址');
     return false;
   }
   //return false;
 form.submit();
}


</script>
</head>
<body leftmargin="0" topmargin="0">


<form action="servlet/register"  method="post" >

     
<!-- ?§?·???? -->
<div align="center">
<table width="50%"  border="0" align="center" cellpadding="0" cellspacing="0">

<tr>
      <td width="31" height="23"></td>
      <td width="100%"  class="show-title">用户注册</td>
      <td></td>
</tr>

<TR>
<TD colspan="3">
<table width="100%"  border="0" align="center" cellpadding="3" cellspacing="1"> 
 <TR>
  <TD bgColor="#ffffff">账户名：</TD>
  <td bgColor="#ffffff">
  <input type="text" name="accountname" size="20" value="" styleClass="button" >
  
  </td> 
 </TR>
 <TR>
  <TD bgColor="#ffffff">密码:</td>
  <td bgColor="#ffffff">
  <input type="password" name="password" size="20" styleClass="button" >
  </td>

 </TR>
 <TR>
  <TD bgColor="#ffffff">确认密码:</td>
  <td bgColor="#ffffff">
  <input type="password" name="repassword" size="20" styleClass="button" >
  </td>

 </TR>
 <TR>
  <TD bgColor="#ffffff">昵称:</td>
  <td bgColor="#ffffff">
  <input type="text" name="accountnicheng" size="20" value="" styleClass="button" >
  </td>

 </TR>
  <TR>
  <TD bgColor="#ffffff">邮件地址:</td>
  <td bgColor="#ffffff">
  <input type="text" name="accountemail" size="20" value="" styleClass="button" >
  </td>

 </TR>
 
 <TR>
  <TD bgColor="#ffffff">电话：</td>
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
                     <input type="button" name="button1" value="确定" onclick=on_click(this.form)>
                     </div>
                     <td width="100%">
                     <div align="center">
                     <INPUT type="reset" name="Submit2" value="重置">
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
