<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>用户页面</title>
<style type="text/css">
<!--
#news {
	position:absolute;
	width:485px;
	height:209px;
	z-index:1;
	visibility: visible;
	left: 330px;
	top: 83px;
}
#nor {
	position:absolute;
	width:514px;
	height:386px;
	z-index:2;
	visibility: hidden;
}
#stockinf1 {
	position:absolute;
	width:514px;
	height:388px;
	z-index:3;
	visibility: hidden;
}
.STYLE2 {font-size: 24px; font-weight: bold; color: #00FFFF; }
.STYLE3 {font-size: 24px; font-weight: bold; color: #FFFFFF; }
.STYLE4 {color: #00FFFF}
-->
</style>
</head>

<body>
<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--顶部-->
    <tr>
      <td width="9" height="50">&nbsp;</td>
      <td width="730" align="center" valign="top" bordercolor="#00FFFF" bgcolor="#00FFCC"><div align="center">
        <h3>LXYH-股市交易模拟系统</h3>
        <p><a href="/logon/custom.jsp">用户界面</a></p>
      </div></td>
    <td width="17">&nbsp;</td>
    </tr>
  </table>
</div>
<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="13" height="398">&nbsp;</td>
      <td width="168" valign="top"><table width="200" height="398" border="1">
        <tr>
          <td bgcolor="#00FFCC"><div align="center" class="STYLE3"><a href="/logon/inquire.jsp">个人信息</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC"><div align="center" class="STYLE3"><a href="/logon/buy.jsp">买入</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC"><div align="center" class="STYLE3"><a href="/logon/sale.jsp">卖出</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/cancel.jsp">委托撤单</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/history.jsp">历史查询</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/self.jsp">自选股</a></div></td>
        </tr>
        <tr>
          <td bgcolor="#00FFCC" class="STYLE3"><div align="center"><a href="/logon/modify.jsp">修改信息</a></div></td>
        </tr>
      </table></td>
      <td width="9">&nbsp;</td>
      <td width="538" valign="top"><p align="center">XXXX，你好：</p>
      <p align="center">欢迎来到LXYH-股市交易模拟系统</p>
      <p align="center">请根据左边导航栏进行操作！</p></td>
      <td width="28">&nbsp;</td>
    </tr>
    <tr>
      <td height="27">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
<div align="center">
  <table width="756" border="0" cellpadding="0" cellspacing="0">
    <!--DWLayoutTable-->
    <tr>
      <td width="11" height="14">&nbsp;</td>
      <td width="724">&nbsp;</td>
      <td width="21">&nbsp;</td>
    </tr>
    <tr>
      <td height="25">&nbsp;</td>
      <td valign="top"><div align="center">
        <p>LXYH-股市交易模拟系统</p>
        <p>2007</p>
      </div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="16">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
</body>
</html>
