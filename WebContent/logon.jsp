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

<title>LXYH-模拟股票交易系统</title>

<script type="text/javascript">
function on_click(form)
{  
 if(form.accname.value==""){
    alert("请输入用户名");
    return false;
 }
 if(form.password.value==""){
    alert("密码不能为空");
    return false;
 }
  form.submit();
}
</script>

</head>

<body>
<div align="center">
  <table width="448" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="23" height="107">&nbsp;</td>
      <td width="401" valign="top"><div align="center"><A
			href="index.jsp">LXYH-模拟股票交易系统</A></div></td>
      <td width="24">&nbsp;</td>
    </tr>
    <tr>
      <td height="17">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="176">&nbsp;</td>
      <td valign="top"><form method="post" action="">
        登陆账户：
            <label>
        <input type="text" name="accname" styleClass="button"/>
        </label>
        <p>登陆密码：
          <label>
          <input type="password" name="password" styleClass="button"/>
          </label>
        </p>
        <p>登陆类型：
          <label>
          <select name="select">
            <option value="custom" selected="selected">注册账户</option>
            <option value="admin">管理员</option>
          </select>
          </label>
        </p>
        <p>
          <label>
          </label>
          <label>
          </label><INPUT type="button" name="button1" value="确定"
			onclick="on_click(this.form)">
        <INPUT type="reset" name="Submit2" value="重置"></p>
      </form>
		</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>

</body>
</html>
