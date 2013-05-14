<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>LXYH-模拟股票交易系统</title>
</head>

<body>
<div align="center">
  <table width="448" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="23" height="107">&nbsp;</td>
      <td width="401" valign="top"><div align="center">LXYH-模拟股票交易系统</div></td>
      <td width="24">&nbsp;</td>
    </tr>
    <tr>
      <td height="17">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="176">&nbsp;</td>s
      <td valign="top">
      <form id="form1" name="form1" method="post" action="servlet/Denglu">
        登陆账户：
            <label>
        <input type="text" name="accountname" />
        </label>
        <p>登陆密码：
          <label>
          <input type="password" name="password" />
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
          <input type="submit" name="Submit1" value="确定" />
          </label>
          <label>
          <input type="reset" name="Submit2" value="重置" />
          </label>
        </p>
      </form>
      
      
      </td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
</body>
</html> 