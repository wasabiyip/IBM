<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>LXYH-ģ���Ʊ����ϵͳ</title>
</head>

<body>
<div align="center">
  <table width="448" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="23" height="107">&nbsp;</td>
      <td width="401" valign="top"><div align="center">LXYH-ģ���Ʊ����ϵͳ</div></td>
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
        ��½�˻���
            <label>
        <input type="text" name="accountname" />
        </label>
        <p>��½���룺
          <label>
          <input type="password" name="password" />
          </label>
        </p>
        <p>��½���ͣ�
          <label>
          <select name="select">
            <option value="custom" selected="selected">ע���˻�</option>
            <option value="admin">����Ա</option>
          </select>
          </label>
        </p>
        <p>
          <label>
          <input type="submit" name="Submit1" value="ȷ��" />
          </label>
          <label>
          <input type="reset" name="Submit2" value="����" />
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